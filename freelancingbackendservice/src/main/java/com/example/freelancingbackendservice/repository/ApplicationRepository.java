package com.example.freelancingbackendservice.repository;

import com.example.freelancingbackendservice.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByJobId(Long jobId);
    List<Application> findByFreelancerId(Long freelancerId);
    boolean existsByJobIdAndFreelancerId(Long jobId, Long freelancerId);
    
    // Sort by match percentage (Highest first)
    List<Application> findByJobIdOrderByMatchPercentageDesc(Long jobId);
}
