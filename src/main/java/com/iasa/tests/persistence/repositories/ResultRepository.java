package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Result;
import org.springframework.data.repository.CrudRepository;

public interface ResultRepository extends CrudRepository <Result, Long> {
}
