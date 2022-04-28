package com.seeroo.rentalservice.service.impl;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.service.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {

    static String country = "India";
    static String state = "Kerala";
    static String company = "Seeroo";


    @Override
    public String getWelcomeMessage(UserDetailsDTO userDetailsDTO) {
        String welcomeMessage = "";
        if (userDetailsDTO.getLocation().equals(country)) {
            if (userDetailsDTO.getState().equals(state)) {
                welcomeMessage = "Namaskaram! " + userDetailsDTO.getName() + ", Welcome to java. ";
            } else {
                welcomeMessage = "Namaste " + userDetailsDTO.getName() + ", Welcome to java. ";
            }
            if (userDetailsDTO.getCompany().equals(company)) {
                welcomeMessage = welcomeMessage + userDetailsDTO.getCompany() + ", Welcomes you to Java Team ";
            }
        } else {
            welcomeMessage = "HOLA! " + userDetailsDTO.getName() + ", Welcome to java. ";
        }
        return welcomeMessage;

    }
}
