package com.example.freelancingbackendservice.dto;

import lombok.Data;

@Data
public class VerifyRequest {
    private String email;
    private String otp;
}
