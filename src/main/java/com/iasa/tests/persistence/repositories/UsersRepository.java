package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findUsersByUFullNameAndUEmail(String fullName, String email);
    Users findUsersByUEmailAndUPassword(String email, String password);
    Users findUsersByULogin(String login);
    Users findUsersByEmail(String email);
    Users findUsersByUStatus(String status);
}
