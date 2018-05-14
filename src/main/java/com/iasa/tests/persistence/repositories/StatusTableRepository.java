package com.iasa.tests.persistence.repositories;

import com.iasa.tests.persistence.entity.StatusTable;
import org.springframework.data.repository.CrudRepository;

public interface StatusTableRepository extends CrudRepository<StatusTable, Long> {
}

