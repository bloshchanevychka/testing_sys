package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.QuestionAnswerSet;
import org.springframework.data.repository.CrudRepository;

public interface QuestionAnswerSetRepository extends CrudRepository <QuestionAnswerSet, Long> {
    // тут по идее надо подтягивать из других таблиц данные, Как?
    QuestionAnswerSet findQuestionAnswerSetByQuestion(Long qId);
    QuestionAnswerSet findQuestionAnswerSetByAnswer(Long aId);
    QuestionAnswerSet findQuestionAnswerSetByStatus(Long sId);
}
