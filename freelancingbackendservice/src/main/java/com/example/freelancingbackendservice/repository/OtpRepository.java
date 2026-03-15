package com.example.freelancingbackendservice.repository;

import com.example.freelancingbackendservice.entity.OtpVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpRepository extends JpaRepository<OtpVerification, Long> {
    Optional<OtpVerification> findByEmailAndOtp(String email, String otp);

    void deleteByEmail(String email);
}
