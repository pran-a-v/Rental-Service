package com.seeroo.rentalservice.service;

import com.seeroo.rentalservice.dto.UserDetailsDTO;

public interface UserServices {
    String getWelcomeMessage(UserDetailsDTO userDetailsDTO);
}