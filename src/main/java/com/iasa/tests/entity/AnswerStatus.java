package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class AnswerStatus {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToOne
    private Long answerStId;
    private boolean aStatus;

    protected AnswerStatus () {}


    public AnswerStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }
}
