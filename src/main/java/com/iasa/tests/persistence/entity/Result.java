package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Result implements Serializable {
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

    //protected Result (){}
    public Result(Long testId, Long userId, Long questionId, Long givenAnswer, Date testDaate, Long testTime) {
        this.testId = testId;
        this.userId = userId;
        this.questionId = questionId;
        this.givenAnswer = givenAnswer;
        this.testDate = testDaate;
        this.testTime = testTime;
    }
}
