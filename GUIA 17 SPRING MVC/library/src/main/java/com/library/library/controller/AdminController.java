package com.library.library.controller;

import com.library.library.model.UserEntity;
import com.library.library.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserServiceImpl userService;
    @Autowired
    public AdminController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/dashboard")
    public String panelAdmin(){

        return "dashboard";
    }

    @GetMapping("/users")
    public String list (ModelMap model){
        List<UserEntity> user = userService.listUsers();
        model.addAttribute("user", user);
        return "users-list";
    }

    @GetMapping("/editRole/{id}")
    public String changeRol(@PathVariable String id){
        userService.changeRole(id);
        return "redirect:/admin/users";
    }
    @PostMapping("/editRole/{id}")
    public String changeRole(@PathVariable String id){
        userService.changeRole(id);
        return "redirect:/admin/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
        return "redirect:/admin/users";
    }


}
