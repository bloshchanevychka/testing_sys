package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class AnswerStatus implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long answerStId;
    private boolean aStatus;

  //  protected AnswerStatus () {}
    public AnswerStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }
}
