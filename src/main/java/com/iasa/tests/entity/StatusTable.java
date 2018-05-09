package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class StatusTable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany
    private Long statusId;
    private Integer status;

    protected StatusTable () {}

    public StatusTable (Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        switch (this.status){
            case 0:
                return String.format(
                        "Status [id=%d, Status='admin'",  statusId);
            case 1:
                return String.format(
                        "Status [id=%d, Status='teacher'",  statusId);
             default:
                 return String.format(
                         "Status [id=%d, Status='Student'",  statusId);

        }

    }
}
