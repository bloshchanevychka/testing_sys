package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Questions;
import org.springframework.data.repository.CrudRepository;

public interface QuestionsRepository extends CrudRepository <Questions, Long> {
    Questions findQuestionsByQuestionType(Long type);
    Questions findQuestionsByQuestionLevel(Long level);
    Questions findQuestionsByQuestionText(String text);
}
