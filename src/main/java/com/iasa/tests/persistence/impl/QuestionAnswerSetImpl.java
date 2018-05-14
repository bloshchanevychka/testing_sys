package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IQuestionAnswerSet;
import com.iasa.tests.persistence.entity.QuestionAnswerSet;
import com.iasa.tests.persistence.repositories.QuestionAnswerSetRepository;

import java.util.Optional;

public class QuestionAnswerSetImpl implements IQuestionAnswerSet {

    private QuestionAnswerSetRepository setRepository;

    public QuestionAnswerSetImpl(QuestionAnswerSetRepository setRepository) {
        this.setRepository = setRepository;
    }
    @Override
    public Optional<QuestionAnswerSet> findQuestionAnswerSetById(Long id) {
        return setRepository.findById(id);
    }
    ////////////////////////////////////////////////////
    @Override
    public QuestionAnswerSet findQuestionAnswerSetByQuestion(Long qId){return setRepository.findQuestionAnswerSetByQuestion(qId);};
    public QuestionAnswerSet findQuestionAnswerSetByAnswer(Long aId){return setRepository.findQuestionAnswerSetByAnswer(aId);};
    public QuestionAnswerSet findQuestionAnswerSetByStatus(Long sId){ return setRepository.findQuestionAnswerSetByStatus(sId);};
}
