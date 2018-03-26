package br.edu.uepb.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.edu.uepb.controller.Gerenciador;
import br.edu.uepb.model.*;

public class BibliotecaTest {
	private Gerenciador ger;
	private Calendar cal;
	private Date date;
	private Anais _anais;
	private Jornal _jornal;
	private Livro _livro;
	private MidiaEletronica _midia;
	private Revista _revista;
	private Tcc _tcc;
	
	@Before
	public void setUp() { 
		ger = new Gerenciador();
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 26);
		date = cal.getTime();
		
		_anais = new Anais ("Artigo", "Primeiro", "José", "Home", date, "Room");
	}
	
	
	@Test
	public void testInserirAnais() {
		assertTrue(ger.inserirAnais("artigo", "Primeiro", "Jerffeson", "Home", date, "Room"));
	}
	
	@Test
	public void testRemoveAnais() {
		ger.inserirAnais("artigo", "Primeiro", "Jerffeson", "Home", date, "Room");
		assertTrue(ger.removeAnais("Primeiro"));
		assertFalse(ger.removeAnais("Segundo"));
	}
	
	@Test
	public void testAtualizaAnais() {
		ger.inserirAnais("artigo", "Primeiro", "Jerffeson", "Home", date, "Room");
		assertTrue(ger.atualizaAnais(_anais));
		ger.removeAnais("Primeiro");
		assertFalse(ger.atualizaAnais(_anais));
	}

}
