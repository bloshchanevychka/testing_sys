package com.iasa.tests.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionSettinsSet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long qSettingsSetId;
    private Long qId;
    private Long sId;

    protected QuestionSettinsSet () {}


    public QuestionSettinsSet(Long qId, Long sId) {
        this.qId = qId;
        this.sId = sId;
    }
}
