package com.gtm.questions.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Questions {
    @Id
    @GeneratedValue(strategy  = GenerationType.SEQUENCE)
    private Integer id;
    private String question;
    private String option1;
    private String option2;
    private String correctAnswer;
    private String domain;
}
