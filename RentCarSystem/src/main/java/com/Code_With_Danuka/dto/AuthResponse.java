package com.Code_With_Danuka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    @NonNull
    private Long id;

    @NonNull
    private String username;

    @NonNull
    private String role;

    @Builder.Default
    private String token = ""; // Default empty string if not using JWT
}
