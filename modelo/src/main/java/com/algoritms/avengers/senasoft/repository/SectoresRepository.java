package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Sectores;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectoresRepository extends ListCrudRepository<Sectores, Integer> {
}
