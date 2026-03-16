package com.example.freelancingbackendservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String fullName;
    private String email;
    private String username;
    private String password;
    private String mobileNo;
    private String role; // CLIENT or FREELANCER
    private boolean termsAccepted;
}
