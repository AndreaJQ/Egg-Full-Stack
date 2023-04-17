package com.eggnews.eggnews.controller;

import com.eggnews.eggnews.models.UserEntity;
import com.eggnews.eggnews.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller

public class AdminController {

    private UserServiceImpl userService;
    @Autowired
    public AdminController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/dashboard")
    public String panelAdmin(){

        return "dashboard";
    }

    @GetMapping("/admin/users")
    public String list (ModelMap model){
        List<UserEntity> user = userService.listUsers();
        model.addAttribute("user", user);
        return "users-list";
    }

    @GetMapping("/admin/editRole/{id}")
    public String changeRol(@PathVariable String id){
        userService.changeRole(id);
        return "redirect:/admin/users";
    }
    @PostMapping("/admin/editRole/{id}")
    public String changeRole(@PathVariable String id){
        userService.changeRole(id);
        return "redirect:/admin/users";
    }

    @GetMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
        return "redirect:/admin/users";
    }


}
