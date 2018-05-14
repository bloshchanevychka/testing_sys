package com.iasa.tests.persistence;

import com.iasa.tests.persistence.entity.AnswerStatus;
import java.util.Optional;

public interface IAnswersStatus {

    Optional<AnswerStatus> findAnswerStatusById(Long id);
    AnswerStatus findAnswerStatusByaStatus(boolean answerSt);
}
