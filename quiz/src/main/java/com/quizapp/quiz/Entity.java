package com.quizapp.quiz;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;


@jakarta.persistence.Entity
@Data
@Component
@Table(name = "quizquestions")
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String correct_answer;

    private String difficultyLevel;

}
