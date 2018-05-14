package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.QuestionAnswerSet;
import org.springframework.data.repository.CrudRepository;

public interface QuestionAnswerSetRepository extends CrudRepository <QuestionAnswerSet, Long> {
}
