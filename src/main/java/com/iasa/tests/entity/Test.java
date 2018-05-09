package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToMany
    @OneToMany
    private Long testId;
    private String testName;
    @ManyToOne
    private Long testSubj;
    private String addInfo;

    protected Test() {}


    public Test(String testName, Long testSubj, String addInfo) {
        this.testName = testName;
        this.testSubj = testSubj;
        this.addInfo = addInfo;
    }
}
