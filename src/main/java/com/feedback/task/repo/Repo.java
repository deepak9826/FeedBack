package com.feedback.task.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.task.Entity.Feedback;

public interface Repo extends JpaRepository<Feedback, Long> {
    // Custom queries or methods if needed
}
