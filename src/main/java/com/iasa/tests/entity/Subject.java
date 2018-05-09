package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany
    private Long subjId;
    private String subject;

    protected Subject () {}

    public Subject(String subject) {
        this.subject = subject;
    }
}
