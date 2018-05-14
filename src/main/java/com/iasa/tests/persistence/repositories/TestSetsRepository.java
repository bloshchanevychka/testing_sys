package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.TestSets;
import org.springframework.data.repository.CrudRepository;

public interface TestSetsRepository extends CrudRepository  <TestSets, Long>{
}
