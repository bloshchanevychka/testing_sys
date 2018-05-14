package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.TestSettingsSet;
import org.springframework.data.repository.CrudRepository;

public interface TestSettingsSetRepository extends CrudRepository <TestSettingsSet,Long> {
}
