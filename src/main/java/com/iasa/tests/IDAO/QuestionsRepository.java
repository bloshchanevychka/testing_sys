package com.iasa.tests.IDAO;

import com.iasa.tests.entity.Questions;
import org.springframework.data.repository.CrudRepository;

public interface QuestionsRepository extends CrudRepository <Questions, Long> {
}
