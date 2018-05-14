package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class QuestionAnswerSet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToOne
    private Long setId;
    @OneToMany
    private Long question;
    @ManyToMany
    private Long answer;
    @OneToMany
    private Long status;

   // protected QuestionAnswerSet () {}
    public QuestionAnswerSet(Long question, Long answer, Long status) {
        this.question = question;
        this.answer = answer;
        this.status = status;
    }
}
