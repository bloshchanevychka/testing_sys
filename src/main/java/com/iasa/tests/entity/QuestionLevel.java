package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class QuestionLevel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany
    private Long questionLevelId;
    private String questionLevel;

    protected QuestionLevel () {}


    public QuestionLevel(String questionLevel) {
        this.questionLevel = questionLevel;
    }
}
