package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany
    private Long typeId;
    private String type;

    protected QuestionType() {}

    public QuestionType(String type) {
        this.type = type;
    }
}
