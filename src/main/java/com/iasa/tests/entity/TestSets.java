package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class TestSets {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long testSetId;
    @ManyToMany
    private Long testId;
    @OneToMany
    private Long questionId;

    protected TestSets () {}

    public TestSets(Long testId, Long questionId) {
        this.testId = testId;
        this.questionId = questionId;
    }
}
