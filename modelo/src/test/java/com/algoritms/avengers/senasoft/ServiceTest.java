package com.algoritms.avengers.senasoft;

import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.services.DBService;
import com.algoritms.avengers.senasoft.services.impl.DBServiceDecorado;
import com.algoritms.avengers.senasoft.services.impl.DBServiceEncontrarImpl;
import com.algoritms.avengers.senasoft.services.impl.DBServiceManejoDatosImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ServiceTest {

    @Qualifier("crud")
    @Autowired
    private DBServiceManejoDatosImpl crud;
    private DBServiceEncontrarImpl find;

    @Test
    public void guardarUsuario(){
        Usuarios usuarios = new Usuarios(1, "Angel", "Corzo", "prueba@gmail.com", "1234");
        crud.guardar(usuarios);
    }
}
