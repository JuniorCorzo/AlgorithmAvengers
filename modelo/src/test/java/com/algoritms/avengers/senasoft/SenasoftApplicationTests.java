package com.algoritms.avengers.senasoft;

import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.services.impl.ServiceDBCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SenasoftApplicationTests {
	@Qualifier("serviceDBCrud")
	@Autowired
	private ServiceDBCrud crud;

	@Test
	void contextLoads() {
	}

	@Test
	public void guardarUsuario(){
		Usuarios usuarios = new Usuarios(2,1, "Angel", "Corzo", "prueba@gmail.com", "1234");
		crud.guardar(usuarios);
	}

}
