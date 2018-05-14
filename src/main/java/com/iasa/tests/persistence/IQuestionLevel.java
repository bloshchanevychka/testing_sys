package com.iasa.tests.persistence;
import com.iasa.tests.persistence.entity.QuestionLevel;

import java.util.Optional;

public interface IQuestionLevel {
    Optional<QuestionLevel> findQuestionLevelById(Long id);
    QuestionLevel findQuestionLevelByQuestionLevel(String qLevel);
}
