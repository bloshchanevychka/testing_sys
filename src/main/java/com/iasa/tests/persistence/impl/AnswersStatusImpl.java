package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IAnswersStatus;
import com.iasa.tests.persistence.entity.AnswerStatus;
import com.iasa.tests.persistence.repositories.AnswersStatusRepository;
import java.util.Optional;

public class AnswersStatusImpl implements IAnswersStatus {
    private AnswersStatusRepository aSRepository;

    public AnswersStatusImpl(AnswersStatusRepository aRepository) {
        this.aSRepository = aSRepository;
    }
    @Override
    public Optional<AnswerStatus> findAnswerStatusById(Long id) {
        return aSRepository.findById(id);
    }
    ////////////////////////////////////////////////////
    @Override
    public AnswerStatus findAnswerStatusByaStatus(boolean answerSt) {
        return aSRepository.findAnswerStatusByAStatus(answerSt);
    }
}
