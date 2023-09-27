package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Sector;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends ListCrudRepository<Sector, Integer> {
}
