package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class TestSettingsSet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long setId;
    @ManyToOne
    private Long test;
    @ManyToOne
    private Long settingSet;

    //protected TestSettingsSet () {}
    public TestSettingsSet(Long test, Long settingSet) {
        this.test = test;
        this.settingSet = settingSet;
    }
}
