package com.example.freelancingbackendservice.repository;

import com.example.freelancingbackendservice.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByJobIdOrderByTimestampAsc(Long jobId);

    List<Message> findByReceiverIdAndIsReadFalse(Long receiverId);
}
