package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class TestSets implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long testSetId;
    @ManyToMany
    private Long testId;
    @OneToMany
    private Long questionId;

    //protected TestSets () {}
    public TestSets(Long testId, Long questionId) {
        this.testId = testId;
        this.questionId = questionId;
    }
}
