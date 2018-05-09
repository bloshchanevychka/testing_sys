package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class QuestionSettings {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToOne
    private Long setttingId;
    private Integer answAmount;
    private String help;
    private String picture;

    protected QuestionSettings () {}

    public QuestionSettings(Integer answAmount, String help, String picture) {
        if (answAmount < 1 || answAmount > 10)
            throw new IllegalArgumentException(answAmount + " is out of range");
        else {
            this.answAmount = answAmount;
            this.help = help;
            this.picture = picture;
        }
    }
}

