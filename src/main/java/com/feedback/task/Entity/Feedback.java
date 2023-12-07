package com.feedback.task.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
/**
 * Feedback
 */


@Entity
public class Feedback {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotBlank(message="Name is required")
private String name;
@Email(message="Email should be valid")
private String email;

private String rating;

private String recommend;

private String feedback;

public String getRating(){return rating;}

public void setRating(String rating){this.rating=rating;}

public String getRecommend(){return recommend;}

public void setRecommend(String recommend){this.recommend=recommend;}

public Feedback(){}

public String getName(){return this.name;}

public void setName(String name){this.name=name;}

public String getEmail(){return this.email;}

public void setEmail(String email){this.email=email;}

// public String getCourse() {
// return this.course;
// }

// public void setCourse(String course) {
// this.course = course;
// }

public String getFeedback(){return this.feedback;}

public void setFeedback(String feedback){this.feedback=feedback;}

// Getters and Setters (or Lombok annotations)
}
