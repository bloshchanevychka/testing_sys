package com.iasa.tests.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long resId;
    @ManyToMany
    private Long testId;
    @ManyToMany
    private Long userId;
    @ManyToMany
    private Long questionId;
    @ManyToMany
    private Long givenAnswer;
    private Date testDate;
    private Long testTime;

    protected Result (){}

    public Result(Long testId, Long userId, Long questionId, Long givenAnswer, Date testDaate, Long testTime) {
        this.testId = testId;
        this.userId = userId;
        this.questionId = questionId;
        this.givenAnswer = givenAnswer;
        this.testDate = testDaate;
        this.testTime = testTime;
    }
}
