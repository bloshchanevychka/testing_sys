package com.iasa.tests.IDAO;

import com.iasa.tests.entity.TestSettings;
import org.springframework.data.repository.CrudRepository;

public interface TestSettingsRepository extends CrudRepository <TestSettings, Long> {
}
