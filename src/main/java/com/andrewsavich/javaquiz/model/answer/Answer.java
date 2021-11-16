package com.andrewsavich.javaquiz.model.answer;

import com.andrewsavich.javaquiz.model.quiz.Quiz;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String answerText;
    @Column
    private Boolean rightAnswer;

    @ManyToOne
    @JoinColumn(name="quiz_id", nullable = false)
    private Quiz quiz;
}
