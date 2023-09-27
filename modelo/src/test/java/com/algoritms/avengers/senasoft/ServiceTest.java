package com.algoritms.avengers.senasoft;

import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.services.impl.ServiceDBCrud;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Configuration;

@DataJpaTest
public class ServiceTest {
    @Qualifier("serviceDBCrud")
    @Autowired
    private ServiceDBCrud crud;

    @Test
    public void guardarUsuario(){

    }
}
