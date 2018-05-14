package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.AnswerStatus;
import org.springframework.data.repository.CrudRepository;

public interface AnswersStatusRepository extends CrudRepository <AnswerStatus, Long> {
}
