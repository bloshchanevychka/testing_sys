package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToMany

    private Long aId;
    private String answer;

    protected Answers () {}

    public Answers(String answer) {
        this.answer = answer;
    }
}
