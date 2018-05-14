package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IAnswers;
import com.iasa.tests.persistence.entity.Answers;
import com.iasa.tests.persistence.repositories.AnswersRepository;
import java.util.Optional;

public class AnswersImpl implements IAnswers {
    private AnswersRepository aRepository;

    public AnswersImpl(AnswersRepository aRepository) {
        this.aRepository = aRepository;
    }
    @Override
    public Optional<Answers> findAnswersById(Long id) {
        return aRepository.findById(id);
    }
    ////////////////////////////////////////////////////
    @Override
    public Answers findAnswersByAnswer(String answer) {
        return aRepository.findAnswersByAnswer(answer);
    }


}
