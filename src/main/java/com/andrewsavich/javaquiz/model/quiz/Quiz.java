package com.andrewsavich.javaquiz.model.quiz;

import com.andrewsavich.javaquiz.model.answer.Answer;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String question;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "quiz", cascade = CascadeType.MERGE)
    private Set<Answer> answers;
}
