package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.models.UserEntity;
import com.eggnews.eggnews.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class AuthController {
    private UserServiceImpl userService;
    @Autowired
    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }



    @GetMapping("/")
    public String index(){

        return "news-list";
    }

    @GetMapping("/register")
    public String register(){
        return "registry";
    }

    @PostMapping("/register")
    public String registry(@RequestParam String username, @RequestParam String email, @RequestParam String password,
                           @RequestParam String password2, Model model) {
        try {
            userService.saveUser(username, email, password, password2);

            return "news-list";
        } catch (Exception e) {

            return "registry";
        }


    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap model){
        if (error!= null){
        }

        return "login";
    }


    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_JOURNALIST')")
    @GetMapping("/index")
    public String indexLogged(HttpSession session){

        UserEntity logged = (UserEntity) session.getAttribute("usersession");

        if (logged.getRole().toString().equals("ADMIN")){

            return "redirect:/admin/dashboard";
        } else if (logged.getRole().toString().equals("JOURNALIST")) {
            return "index";
        }

        return "index";


    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_JOURNALIST')")
    @GetMapping("/profile")
    public String profile(ModelMap modelo,HttpSession session){
        UserEntity user = (UserEntity) session.getAttribute("usersession");
        modelo.put("user", user);
        return "users-modify";
    }


    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_JOURNALIST')")
    @PostMapping("/profile/{id}")
    public String updateProfile(@PathVariable String id, @RequestParam String name, @RequestParam String email,
                                @RequestParam String password, @RequestParam String password2, ModelMap model) {

        try {
            userService.update( id, name, email, password, password2);
            model.put("success", "User uploads correctly");

            return "redirect:/index";
        } catch (Exception ex) {
            model.put("error", ex.getMessage());
            model.put("name", name);
            model.put("email", email);

            return "users-modify";
        }

    }

}
