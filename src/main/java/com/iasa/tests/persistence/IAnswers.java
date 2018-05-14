package com.iasa.tests.persistence;


import com.iasa.tests.persistence.entity.Answers;
import java.util.Optional;

public interface IAnswers {
    Optional<Answers> findAnswersById(Long id);
    Answers findAnswersByAnswer(String answer);

}
