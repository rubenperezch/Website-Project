package com.ruben.website.service;

import com.ruben.website.model.User;
import com.ruben.website.web.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDTO registrationDTO);
}
