package com.iasa.tests.IDAO;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository <com.iasa.tests.entity.Users, Long> {
}
