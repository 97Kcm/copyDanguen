package com.dangeun.controller;

import com.dangeun.dto.UserDTO;
import com.dangeun.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public void get_login(){}

    @GetMapping("/register")
    public void get_register(){}

    @PostMapping("/register")
    public String post_register(UserDTO userDTO){
        userService.createUser(userDTO);

        return "redirect:/user/login";
    }

}
