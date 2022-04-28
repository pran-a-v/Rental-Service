package com.seeroo.rentalservice.controller;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.Autowired;

@RestController
public class UserController {

    @Autowired private UserServices userServices;

    @PostMapping(value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO) {

        return userServices.getWelcomeMessage(userDetailsDTO);

    }
}