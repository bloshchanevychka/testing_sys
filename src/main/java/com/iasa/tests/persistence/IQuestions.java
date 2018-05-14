package com.iasa.tests.persistence;

import com.iasa.tests.persistence.entity.Questions;

import java.util.Optional;

public interface IQuestions {
    Optional<Questions> findQuestionsById(Long questionId);
    Questions findQuestionsByQuestionType(Long type);
    Questions findQuestionsByQuestionLevel(Long level);
    Questions findQuestionsByQuestionText(String text);


}
