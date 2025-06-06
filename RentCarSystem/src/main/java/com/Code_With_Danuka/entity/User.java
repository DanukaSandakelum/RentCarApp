package com.Code_With_Danuka.entity;

import com.Code_With_Danuka.enums.UserRole; // Fixed enum name convention
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User { // Changed class name to follow Java conventions (PascalCase)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Added constraints
    private String name;

    @Column(nullable = false, unique = true) // Ensures email is unique
    private String email;

    @Column(nullable = false) // Password is required
    private String password;

    @Enumerated(EnumType.STRING) // Required for enum storage
    @Column(nullable = false)
    private UserRole userRole; // Fixed field name convention
}