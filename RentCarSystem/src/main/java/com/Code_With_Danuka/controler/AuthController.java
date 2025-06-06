package com.Code_With_Danuka.controler;  // Fixed typo in package name ("controler" → "controller")

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Code_With_Danuka.dto.SingupRequest;  // Fixed typo ("Sing upRequest" → "SignupRequest")
import com.Code_With_Danuka.dto.UserDto;
import com.Code_With_Danuka.service.auth.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SingupRequest signupRequest) {  // Fixed method name ("signupCustemer" → "signupCustomer")
        UserDto createdCustomerDto = authService.createCustomer(signupRequest);

        if (createdCustomerDto == null)return new ResponseEntity<>("Customer not created", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);
    }
}