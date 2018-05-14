package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository <Test, Long> {
}
