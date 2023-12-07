package com.feedback.task.Controller;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.task.Entity.Feedback;
import com.feedback.task.repo.Repo;

// import ch.qos.logback.core.model.Model;

@RestController
public class FeedbackComtroller {

    @Autowired
    private Repo repository;

   @PostMapping("/submit-feedback")
    public String submitFeedback(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String rating,
            @RequestParam String recommend,
            @RequestParam String feedback
    ) {
        Feedback userFeedback = new Feedback();
        userFeedback.setName(name);
        userFeedback.setEmail(email);
        userFeedback.setRating(rating);
        userFeedback.setRecommend(recommend);
        userFeedback.setFeedback(feedback);
        repository.save(userFeedback); // Save feedback into the database

        return "redirect:/thankyou.html"; // Redirect to a thank you page or another confirmation page
    }
}
