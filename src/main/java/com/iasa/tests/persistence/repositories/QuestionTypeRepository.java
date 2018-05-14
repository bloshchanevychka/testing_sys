package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.QuestionType;
import org.springframework.data.repository.CrudRepository;

public interface QuestionTypeRepository extends CrudRepository <QuestionType, Long> {
}
