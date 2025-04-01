package com.example.quiz_service.model;

import lombok.Data;

@Data
public class QuizDto {
    String CategoryName;
    Integer numQuestions;
    String title;
}
