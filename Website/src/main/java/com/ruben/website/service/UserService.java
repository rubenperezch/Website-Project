package com.ruben.website.service;

import com.ruben.website.model.User;
import com.ruben.website.web.dto.UserRegistrationDTO;

public interface UserService {

    User save(UserRegistrationDTO registrationDTO);
}
