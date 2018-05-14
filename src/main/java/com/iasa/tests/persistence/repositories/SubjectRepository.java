package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository <Subject, Long> {
}
