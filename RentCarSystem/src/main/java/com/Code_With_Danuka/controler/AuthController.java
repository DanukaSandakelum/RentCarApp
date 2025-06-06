package com.Code_With_Danuka.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Code_With_Danuka.dto.SignupRequest;
import com.Code_With_Danuka.dto.AuthResponse;
import com.Code_With_Danuka.service.auth.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest) {
        AuthResponse authResponse = authService.createCustomer(signupRequest);

        if (authResponse == null) return new ResponseEntity<>("Customer not created", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(authResponse, HttpStatus.CREATED);
    }
}