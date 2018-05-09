package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class QuestionSettingSet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long qSettingsSetId;
    @ManyToMany
    private Long qId;
    @OneToMany
    private Long sId;

    protected QuestionSettingSet() {}


    public QuestionSettingSet(Long qId, Long sId) {
        this.qId = qId;
        this.sId = sId;
    }
}
