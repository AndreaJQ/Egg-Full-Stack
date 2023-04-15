package com.library.library.service.impl;

import com.library.library.enumeration.Role;
import com.library.library.exceptions.MyException;
import com.library.library.model.Image;
import com.library.library.model.UserEntity;
import com.library.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService {

    //----------------IMPORT THE REPOSITORY And IMAGE SERVICE----------------------
    private UserRepository userRepository;
    private ImageService imageService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ImageService imageService) {
        this.userRepository = userRepository;
        this.imageService = imageService;
    }


//----------------SAVE USER----------------------

    @Transactional
     public void saveUser(String name, String email, String password, String password2,MultipartFile file) throws MyException {

        validation(name,email,password,password2);
        UserEntity user = new UserEntity();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        user.setRole(Role.USER);

        Image image = imageService.save(file);
        user.setImage(image);

        userRepository.save(user);
    }

    //----------------UPDATE----------------------
    @Transactional
    public void update (String id, String name, String email, String password, String password2, MultipartFile file) throws MyException {

        Optional<UserEntity> answer = userRepository.findById(id);
        if (answer.isPresent()){
            UserEntity user = answer.get();
            user.setName(name);
            user.setEmail(email);

            user.setPassword(new BCryptPasswordEncoder().encode(password));

            user.setRole(Role.USER);

            String idImage=null;

            if (user.getImage()!=null){
                idImage=user.getImage().getId();
            }
            Image image = imageService.upload(file, idImage);

            user.setImage(image);

            userRepository.save(user);
        }
    }

    //----------------GET ONE----------------------
    public UserEntity getOne(String id){
        return userRepository.getOne(id);
    }


    //----------------USER DETAIL----------------------

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserEntity user = userRepository.findByEmail(email);

        if (user != null) {

            List<GrantedAuthority> permission = new ArrayList();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + user.getRole().toString());

            permission.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usersession", user);

            return new User(user.getEmail(), user.getPassword(), permission);
        } else {
            return null;
        }
    }


    //----------------LIST USERS----------------------
    @Transactional (readOnly = true)
    public List<UserEntity> listUsers(){
        List<UserEntity> usersList= new ArrayList<>();
        usersList=userRepository.findAll();
        return usersList;
    }


    //----------------CHANGE ROLE----------------------

    @Transactional
    public void changeRole(String id){
        Optional<UserEntity> answer = userRepository.findById(id);

        if(answer.isPresent()) {

            UserEntity user = answer.get();

            if(user.getRole().equals(Role.USER)) {

                user.setRole(Role.ADMIN);

            }else if(user.getRole().equals(Role.ADMIN)) {
                user.setRole(Role.USER);
            }
        }
    }
    //----------------DELETE USER----------------------
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }


    private void validation(String name, String email, String password, String password2) throws MyException {

        if (name.isEmpty() || name == null) {
            throw new MyException("el nombre no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MyException("el email no puede ser nulo o estar vacio");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MyException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }

        if (!password.equals(password2)) {
            throw new MyException("Las contraseñas ingresadas deben ser iguales");
        }

    }
}