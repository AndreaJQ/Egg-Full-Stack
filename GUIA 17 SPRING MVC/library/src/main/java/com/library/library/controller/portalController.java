package com.library.library.controller;

import com.library.library.exceptions.MyException;
import com.library.library.model.UserEntity;
import com.library.library.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PortalController {

    private UserServiceImpl userService;
    @Autowired
    public PortalController(UserServiceImpl userService) {
        this.userService = userService;
    }





    @GetMapping("/")
    public String index(){

    return "index";
}

    @GetMapping("/register")
    public String register(){
        return "registry";
    }

    @PostMapping("/register")
    public String registry(@RequestParam String name, @RequestParam String email, @RequestParam String password,
                           @RequestParam String password2, ModelMap model, MultipartFile file) {
        try {
            userService.saveUser(name, email, password, password2, file);
            model.put("success", "User registered correctly");
            return "index";
        } catch (MyException e) {
            model.put("error", e.getMessage());
            model.put("name", name);
            model.put("email", email);
            return "registry";
        }

    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap model){
        if (error!= null){
            model.put("error", "invalid user or password");
        }

        return "login";
    }



    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String indexLogged(HttpSession session){

        UserEntity logged = (UserEntity) session.getAttribute("usersession");

        if (logged.getRole().toString().equals("ADMIN")){

            return "redirect:/admin/dashboard";
        }
            return "inicio.html";


    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/profile")
    public String profile(ModelMap modelo,HttpSession session){
        UserEntity user = (UserEntity) session.getAttribute("usersession");
        modelo.put("user", user);
        return "user_modify.html";
    }


    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/profile/{id}")
    public String updateProfile(@PathVariable String id, @RequestParam String name, @RequestParam String email,
                             @RequestParam String password, @RequestParam String password2, ModelMap model, MultipartFile file) {

        try {
            userService.update( id, name, email, password, password2, file);
            model.put("success", "User uploades correctly");

            return "redirect:/inicio";
        } catch (MyException ex) {
            model.put("error", ex.getMessage());
            model.put("name", name);
            model.put("email", email);

            return "user_modify.html";
        }

    }


}
