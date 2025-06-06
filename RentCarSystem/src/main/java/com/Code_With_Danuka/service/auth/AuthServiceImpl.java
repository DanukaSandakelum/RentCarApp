package com.Code_With_Danuka.service.auth;

import com.Code_With_Danuka.dto.SignupRequest;
import com.Code_With_Danuka.dto.AuthResponse;
import com.Code_With_Danuka.entity.User;
import com.Code_With_Danuka.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;

    @Override
    public AuthResponse createCustomer(SignupRequest signupRequest) {
        if (signupRequest.getUsername() == null || signupRequest.getPassword() == null) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }

        User user = User.builder()
                .username(signupRequest.getUsername())
                .password(passwordEncoder.encode(signupRequest.getPassword()))
                .role("CUSTOMER")
                .build();

        User savedUser = userRepository.save(user);
        String jwt = jwtProvider.generateToken(user);

        return AuthResponse.builder()
                .id(savedUser.getId())
                .username(savedUser.getUsername())
                .role(savedUser.getRole())
                .token(jwt)
                .build();
    }
}