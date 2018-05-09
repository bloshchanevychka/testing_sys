package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToOne
    @ManyToMany
    private Long questionId;
    private String questionText;
    @ManyToOne
    private Long questionLevel;
    @ManyToOne
    private Long questionType;
    private String questionAddInfo;

    protected Questions() {}

    public Questions(String questionText, Long questionLevel, Long questionType, String questionAddInfo) {
        this.questionText = questionText;
        this.questionLevel = questionLevel;
        this.questionType = questionType;
        this.questionAddInfo = questionAddInfo;
    }
}
