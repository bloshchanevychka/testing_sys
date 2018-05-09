package com.iasa.tests.IDAO;

import com.iasa.tests.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository <Test, Long> {
}
