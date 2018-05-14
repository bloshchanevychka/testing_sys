package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.QuestionSettings;
import org.springframework.data.repository.CrudRepository;

public interface QuestionSettingsRepository extends CrudRepository <QuestionSettings, Long> {
}
