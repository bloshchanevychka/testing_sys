package com.iasa.tests.persistence;

import com.iasa.tests.persistence.entity.QuestionAnswerSet;

import java.util.Optional;

public interface IQuestionAnswerSet {
    Optional<QuestionAnswerSet> findQuestionAnswerSetById(Long id);
    QuestionAnswerSet  findQuestionAnswerSetByQuestion(Long qId);
    QuestionAnswerSet findQuestionAnswerSetByAnswer(Long aId);
    QuestionAnswerSet findQuestionAnswerSetByStatus(Long sId);
}
