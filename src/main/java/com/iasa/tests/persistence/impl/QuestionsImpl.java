package com.iasa.tests.persistence.impl;

import com.iasa.tests.persistence.IQuestions;
import com.iasa.tests.persistence.entity.Questions;
import com.iasa.tests.persistence.repositories.QuestionsRepository;
import java.util.Optional;

public class QuestionsImpl implements IQuestions {
    private QuestionsRepository qRepository;

    public QuestionsImpl(QuestionsRepository qRepository) {
        this.qRepository = qRepository;
    }
    @Override
    public Optional<Questions> findQuestionsById(Long questionId) {
        return qRepository.findById(questionId);
    }
    ////////////////////////////////////////////////////
    @Override
    public Questions findQuestionsByQuestionType(Long type) {return qRepository.findQuestionsByQuestionType(type);}
    @Override
    public Questions findQuestionsByQuestionLevel(Long level){return qRepository.findQuestionsByQuestionLevel(level);}
    @Override
    public Questions findQuestionsByQuestionText(String text) {return qRepository.findQuestionsByQuestionText(text);}

}
