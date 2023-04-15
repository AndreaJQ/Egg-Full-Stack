package com.library.library.controller;

import com.library.library.model.UserEntity;
import com.library.library.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/image")
public class ImageController {
    private UserServiceImpl userService;
    @Autowired
    public ImageController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @GetMapping("/profile/{id}")
    public ResponseEntity<byte[]> userImage(@PathVariable String id){
        UserEntity user= userService.getOne(id);

        byte[] image = user.getImage().getContent();

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<>(image,headers, HttpStatus.OK);
    }
}
