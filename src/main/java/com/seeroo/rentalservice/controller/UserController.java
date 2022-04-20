package com.seeroo.rentalservice.controller;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static String country = "India";
    public static String state = "Kerala";
    public static String company = "Seeroo";

    @PostMapping(value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO) {
        String welcomeMessage = "";
        if (userDetailsDTO.getLocation().equals(country)) {
            if (userDetailsDTO.getState().equals(state)) {
                welcomeMessage = "Namaskaram! " + userDetailsDTO.getName() + ", Welcome to java. ";
            } else {
                welcomeMessage = "Namaste " + userDetailsDTO.getName() + " ,Welcome to java. ";
            }
            if (userDetailsDTO.getCompany().equals(company)) {
                welcomeMessage = welcomeMessage + userDetailsDTO.getCompany() + "Welcomes you to the Java Team ";
            }
        } else {
            welcomeMessage = "HOLA! " + userDetailsDTO.getName() + " ,Welcome to java. ";
        }
//        return "My name is " + userDetailsDTO.getName() + "\n" +
//               "I am from " +userDetailsDTO.getLocation() + "\n" +
//               "I am working at " + userDetailsDTO.getCompany() ;
        return welcomeMessage;

    }
}