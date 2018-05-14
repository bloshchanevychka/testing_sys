package com.iasa.tests.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long uId;
    private String uLogin;
    private String uFullName;
    private String uEmail;
    private String uPassword;
       private Long uStatus;

    //protected Users() {}
    public Users(String uLogin, String uFullName, String uEmail, String uPassword, Long uStatus) {
        this.uLogin = uLogin;
        this.uFullName = uFullName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uStatus = uStatus;
    }



}
