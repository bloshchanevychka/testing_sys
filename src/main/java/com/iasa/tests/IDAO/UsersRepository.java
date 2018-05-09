package com.iasa.tests.IDAO;

import com.iasa.tests.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository <Users, Long> {
}
