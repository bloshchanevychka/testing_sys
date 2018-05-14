package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Answers;
import org.springframework.data.repository.CrudRepository;

public interface AnswersRepository extends CrudRepository <Answers, Long> {
    Answers findAnswersByAnswer(String answer);
}
