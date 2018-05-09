package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class QuestionAnswerSet {
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

    protected QuestionAnswerSet () {}


    public QuestionAnswerSet(Long question, Long answer, Long status) {
        this.question = question;
        this.answer = answer;
        this.status = status;
    }
}
