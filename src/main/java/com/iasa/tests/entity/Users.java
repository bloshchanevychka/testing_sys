package com.iasa.tests.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
    private String userLogin;
    private String userFullName;
    private String userEmail;
    private String userPassword;

    protected Users() {}

    public Users(String userLogin, String userFullName, String userEmail, String userPassword) {
        this.userFullName = userFullName;
        this.userLogin = userLogin;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, Login='%s', Name='%s', Email='%s', Password='%s']",
                userId, userLogin, userFullName, userEmail, userPassword);
    }
}
