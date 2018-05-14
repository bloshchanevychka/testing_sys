package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IUsers;
import com.iasa.tests.persistence.entity.Users;
import com.iasa.tests.persistence.repositories.UsersRepository;

import java.util.Optional;

//@AllArgConstructor
public class UsersImpl implements IUsers {

    private UsersRepository usersRepository;

    public UsersImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @Override
    public Optional<Users> findUsersById(Long id) {
        return usersRepository.findById(id);
    }
////////////////////////////////////////////////////
    @Override
    public Users findUsersByUFullNameAndUEmail(String fullName, String email) {
        return usersRepository.findUsersByUFullNameAndUEmail(fullName, email);
    }
    @Override
    public Users findUsersByUEmailAndUPassword(String email, String password){
        return usersRepository.findUsersByUEmailAndUPassword(email, password);
    }
    @Override
    public Users findUsersByULogin(String login) {return usersRepository.findUsersByULogin(login);}
    @Override
    public Users findUsersByEmail(String email){return usersRepository.findUsersByEmail(email);}
    @Override
    public Users findUsersByUStatus(String status) {return usersRepository.findUsersByUStatus( status);}

}