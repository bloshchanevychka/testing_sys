package com.iasa.tests.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class z1 {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long aId;
    private String answer;


    public z1(String answer) {
        this.answer = answer;
    }

}
