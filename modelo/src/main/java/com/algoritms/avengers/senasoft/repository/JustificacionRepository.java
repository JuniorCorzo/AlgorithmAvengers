package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Justificacion;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JustificacionRepository extends ListCrudRepository<Justificacion, Integer> {
}
