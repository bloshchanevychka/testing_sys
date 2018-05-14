package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.TestSettings;
import org.springframework.data.repository.CrudRepository;

public interface TestSettingsRepository extends CrudRepository <TestSettings, Long> {
}
