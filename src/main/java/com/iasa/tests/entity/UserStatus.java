package com.iasa.tests.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStatus {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long setId;
    private Long userId;
    private Long statusId;

    protected UserStatus () {}

    public UserStatus(Long userId, Long statusId){
        this.userId = userId;
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return String.format(
                "User status[id=%d, User Id='%s', Status Id='%s'",
                setId, userId, statusId);
    }

}



