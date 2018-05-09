package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class TestSettingsSet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long setId;
    @ManyToOne
    private Long test;
    @ManyToOne
    private Long settingSet;

    protected TestSettingsSet () {}

    public TestSettingsSet(Long test, Long settingSet) {
        this.test = test;
        this.settingSet = settingSet;
    }
}
