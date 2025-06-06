package com.Code_With_Danuka.service.auth;

import com.Code_With_Danuka.dto.SignupRequest;
import com.Code_With_Danuka.dto.AuthResponse;



public interface AuthService {
    AuthResponse createCustomer(SignupRequest signupRequest);
}
