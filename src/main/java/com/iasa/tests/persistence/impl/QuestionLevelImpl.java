package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IQuestionLevel;
import com.iasa.tests.persistence.entity.QuestionLevel;
import com.iasa.tests.persistence.repositories.QuestionLevelRepository;

import java.util.Optional;

public class QuestionLevelImpl implements IQuestionLevel {
    private QuestionLevelRepository qlRepository;

    public QuestionLevelImpl(QuestionLevelRepository setRepository) {
        this.qlRepository = qlRepository;
    }
    @Override
    public Optional<QuestionLevel> findQuestionLevelById(Long id) {
        return qlRepository.findById(id);
    }
    ////////////////////////////////////////////////////
    @Override
    public QuestionLevel findQuestionLevelByQuestionLevel(String qLevel){return qlRepository.findQuestionLevelByQuestionLevel(qLevel);};

}
