package com.Code_With_Danuka.service.auth;

import org.apache.catalina.authenticator.SavedRequest;

import com.Code_With_Danuka.dto.SingupRequest;
import com.Code_With_Danuka.dto.UserDto;



public interface AuthService {
    UserDto createCustomer(SingupRequest signupRequest);
}
