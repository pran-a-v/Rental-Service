package com.seeroo.rentalservice.service.impl;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.service.UserServices;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserServices {

    static String country = "India";
    static String state = "Kerala";
    static String company = "Seeroo";


    @Override
    public String getWelcomeMessage(UserDetailsDTO userDetailsDTO) {
        String welcomeMessage = "";
        ArrayList<UserDetailsDTO> userDetails = getUserDetails();

        if (userDetails.get(1).getLocation().contains(userDetailsDTO.getLocation())) {
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

    private ArrayList<UserDetailsDTO> getUserDetails() {

        ArrayList<UserDetailsDTO> userDetails = new ArrayList<>();
        userDetails.add(0,new UserDetailsDTO("Ebin Roy","Seeroo UAE","UAE"));
        userDetails.add(1,new UserDetailsDTO("Pranav","Seeroo IT Solutions","India"));
        userDetails.add(2,new UserDetailsDTO("Jose","Seeroo","UK"));

        return userDetails;
    }
}

