package com.iasa.tests.persistence;

import com.iasa.tests.persistence.entity.Users;

import java.util.Optional;

public interface IUsers {

    Optional<Users> findUsersById(Long id);

    Optional<Users> findUsersByUFullNameAndUEmail(String fullName, String email);
    Users findUsersByUEmailAndUPassword(String email, String password);
    Users findUsersByULogin(String login);
    Users findUsersByEmail(String email);
    Users findUsersByUStatus(String status);
}
