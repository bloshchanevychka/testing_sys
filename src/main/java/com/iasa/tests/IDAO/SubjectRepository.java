package com.iasa.tests.IDAO;

import com.iasa.tests.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository <Subject, Long> {
}
