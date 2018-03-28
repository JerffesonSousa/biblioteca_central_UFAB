package br.edu.uepb.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uepb.controller.LoginController;

public class LoginControllerTest {
	private LoginController lc;
	
	@Before
	public void setUp() {
		lc = new LoginController();
	}

	@Test
	public void testCadastrar() {
		assertTrue(lc.cadastraUsuario("Jerffeson", "123", "operador"));
	}
	
	@Test
	public void testLogin() {
		lc.cadastraUsuario("Jerffeson", "123", "operador");
		assertTrue(lc.loginUsuario("Jerffeson", "123"));
		assertFalse(lc.loginUsuario("Jerffeson", "321"));
		assertFalse(lc.loginUsuario("Sousa", "123"));
	}

}
