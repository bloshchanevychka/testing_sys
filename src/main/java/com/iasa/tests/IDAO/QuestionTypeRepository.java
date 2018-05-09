package com.iasa.tests.IDAO;

import com.iasa.tests.entity.QuestionType;
import org.springframework.data.repository.CrudRepository;

public interface QuestionTypeRepository extends CrudRepository <QuestionType, Long> {
}
