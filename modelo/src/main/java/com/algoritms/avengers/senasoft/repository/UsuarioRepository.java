package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.Usuarios;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends ListCrudRepository<Usuarios, Integer> {
}
