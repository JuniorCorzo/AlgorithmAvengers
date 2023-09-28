package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Recursos;
import com.algoritms.avengers.senasoft.model.Sectores;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecursosRepository extends ListCrudRepository<Recursos, Integer> {
    List<Recursos> findAllByIdSector(int id);
}
