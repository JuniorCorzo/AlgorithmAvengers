package com.algoritms.avengers.senasoft;

import com.algoritms.avengers.senasoft.model.Usuarios;
import com.algoritms.avengers.senasoft.services.impl.ServiceDBCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
		//quiero crear un test donde se va a comprobar si se creo correctamente el usuario en la base de datos
		Usuarios usuario = new Usuarios();
		usuario.setNombre("David");
		usuario.setApellido("Garcia");
		usuario.setIdSector(1);
		usuario.setCorreo("davidgarcia@gmail.com");
		usuario.setClave("1234567");

		Usuarios usuarioGuardado = crud.guardar(usuario);
		//comprobar si el usuario se guardo correctamente
		assertThat(usuarioGuardado).isNotNull();
	}

	@Test
	public void editarUsuario() {
		//quiero crear un test donde se va a comprobar si se creo correctamente el usuario en la base de datos
		Usuarios usuario = new Usuarios();
		usuario.setIdUsuario(1);
		usuario.setNombre("David");
		usuario.setApellido("Garcia");
		usuario.setIdSector(1);
		usuario.setCorreo("prueba@gmail.com");
		usuario.setClave("1234567");

		Usuarios usuarioGuardado = crud.actualizar(1, usuario);
		//comprobar si el usuario se guardo correctamente
		assertThat(usuarioGuardado).isNotNull();
	}

	@Test
	public void obtenerRecurso(){
		//quiero crear un test que verifique si se obtiene un recurso
		assertThat(crud.encontrarPorIdRecursos(1)).isNotNull();
	}

	@Test
	public void obtenerMotivoPorId(){
		//quiero crear un test que verifique si se obtiene un motivo
		assertThat(crud.encontrarPorIdMotivos(1)).isNotNull();
	}
}
