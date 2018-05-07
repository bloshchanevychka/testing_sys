package com.iasa.tests.IDAO;

import com.iasa.tests.entity.UserStatus;
import org.springframework.data.repository.CrudRepository;

public interface UserStatusRepository extends CrudRepository <UserStatus, Long> {
}
