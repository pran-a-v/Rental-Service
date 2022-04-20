package com.seeroo.rentalservice.controller;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping (value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO){
        return "My name is " + userDetailsDTO.getName() + "\n" +
               "I am from " +userDetailsDTO.getLocation() + "\n" +
               "I am working at " + userDetailsDTO.getCompany() ;
    }


}