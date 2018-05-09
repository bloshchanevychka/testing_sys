package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ManyToMany
    private Long uId;
    private String uLogin;
    private String uFullName;
    private String uEmail;
    private String uPassword;
    @ManyToOne
    private Long uStatus;

    protected Users() {}

    public Users(String uLogin, String uFullName, String uEmail, String uPassword, Long uStatus) {
        this.uLogin = uLogin;
        this.uFullName = uFullName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uStatus = uStatus;
    }


    @Override
    public String toString() {
        return String.format(
                "User[id=%d, Login='%s', Name='%s', Email='%s', Password='%s']",
                uId, uLogin, uFullName, uEmail, uPassword);
    }
}
