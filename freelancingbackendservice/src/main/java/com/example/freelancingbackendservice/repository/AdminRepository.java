package com.example.freelancingbackendservice.repository;

import com.example.freelancingbackendservice.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);

    Optional<Admin> findByFullName(String fullName);
}
