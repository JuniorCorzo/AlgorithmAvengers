package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Recursos;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursosRepository extends ListCrudRepository<Recursos, Integer> {
}
