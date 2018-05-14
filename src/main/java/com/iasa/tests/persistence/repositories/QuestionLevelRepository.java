package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.QuestionLevel;
import org.springframework.data.repository.CrudRepository;

public interface QuestionLevelRepository extends CrudRepository <QuestionLevel, Long> {
}
