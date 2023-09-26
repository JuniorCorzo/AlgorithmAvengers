package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Usuarios;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<Usuarios, Integer> {
}
