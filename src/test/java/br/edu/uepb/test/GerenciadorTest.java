package br.edu.uepb.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.edu.uepb.controller.Gerenciador;
import br.edu.uepb.model.*;

public class GerenciadorTest {
	private Gerenciador ger;
	private Calendar cal;
	private Date date;
	private Anais _anais;
	private Jornal _jornal;
	private Livro _livro;
	private MidiaEletronica _midia;
	private Revista _revista;
	private Tcc _tcc;
	private Curso _curso;
	private CursoDAO _cursoDao;
	private Conexao _conexao;
	
	@Before
	public void setUp() { 
		ger = new Gerenciador();
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 26);
		date = cal.getTime();
		
		_anais = new Anais ("Artigo", "Primeiro", "José", "Home", date, "Room");
		_jornal = new Jornal("Folha", date, 2);
		_livro = new Livro(1234, "A casa", "Eu", "minha", date, 2, 30, "informatica", "redes");
		_midia = new MidiaEletronica("Know", "CD", date);
		_revista = new Revista("Veja", "Home",date, 3, 20);
		_tcc = new Tcc("A coisa", "Só eu", "thiago", "tese", date, "School");
		_curso = new Curso("Ciência da Computação", "exatas", "pos-graduação");
		_cursoDao = new CursoDAO();
		_conexao = new Conexao();
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
	
	
	@Test
	public void testInserirJornal() {
		assertTrue(ger.inserirJornal("Folha", date, 1));
	}
	
	@Test
	public void testRemoverJornal() {
		ger.inserirJornal("Folha", date, 1);
		assertTrue(ger.removeJornal("Folha"));
		assertFalse(ger.removeJornal("Times"));
	}
	
	@Test
	public void testAtualizaJornal() {
		ger.inserirJornal("Folha", date, 1);
		assertTrue(ger.atualizaJornal(_jornal));
		ger.removeJornal("Folha");
		assertFalse(ger.atualizaJornal(_jornal));
		
	}
	
	@Test
	public void testInserirLivro() {
		assertTrue(ger.inserirLivro(1234, "A casa", "Eu", "minha", date, 2, 30, "informatica", "redes"));
	}
	
	@Test
	public void testRemoverLivro() {
		ger.inserirLivro(1234, "A casa", "Eu", "minha", date, 2, 30, "informatica", "redes");
		assertTrue(ger.removeLivro("A casa"));
		assertFalse(ger.removeLivro("The house"));
	}
	
	@Test
	public void testAtualizaLivro() {
		ger.inserirLivro(1234, "A casa", "Eu", "minha", date, 1, 30, "informatica", "redes");
		assertTrue(ger.atualizaLivro(_livro));
		ger.removeLivro("A casa");
		assertFalse(ger.atualizaLivro(_livro));
	}
	
	@Test
	public void testInserirRevista() {
		assertTrue(ger.inserirRevista("Veja", "Home",date, 3, 20));
	}
	
	@Test
	public void testRemoverRevista() {
		ger.inserirRevista("Veja", "Home",date, 3, 20);
		assertTrue(ger.removeRevista("Veja"));
		assertFalse(ger.removeRevista("Book"));
	}
	
	@Test
	public void testAtualizaRevista() {
		ger.inserirRevista("Veja","Home",date, 3, 20);
		assertTrue(ger.atualizaRevista(_revista));
		ger.removeRevista("Veja");
		assertFalse(ger.atualizaRevista(_revista));
	}
	
	@Test
	public void testInserirMidiaE() {
		assertTrue(ger.inserirMidiaEletronica("Know", "CD", date));
	}
	
	@Test
	public void testRemoverMidiaE() {
		ger.inserirMidiaEletronica("Know", "CD", date);
		assertTrue(ger.removeMidiaEletronica("Know"));
		assertFalse(ger.removeMidiaEletronica("Unknow"));
	}
	
	@Test
	public void testAtualizaMidiaE() {
		ger.inserirMidiaEletronica("Know", "DVD", date);
		assertTrue(ger.atualizaMidiaEletronica(_midia));
		ger.removeMidiaEletronica("Know");
		assertFalse(ger.atualizaMidiaEletronica(_midia));
	}
	
	@Test
	public void testInserirTcc() {
		assertTrue(ger.inserirTcc("A coisa", "Só eu", "thiago", "tese", date, "School"));
	}
	
	@Test
	public void testRemoverTcc() {
		ger.inserirTcc("A coisa", "Só eu", "thiago", "tese", date, "School");
		assertTrue(ger.removeTcc("A coisa"));
		assertFalse(ger.removeTcc("Unknow"));
	}
	
	@Test
	public void testAtualizaTcc() {
		ger.inserirTcc("A coisa", "Só eu", "thiago", "monografia", date, "School");
		assertTrue(ger.atualizaTcc(_tcc));
		ger.removeTcc("A coisa");
		assertFalse(ger.atualizaTcc(_tcc));
	}
	
	@Test
	public void testInserirCurso() {
		assertTrue(ger.inserirCurso("Ciência da Computação", "exatas", "Graduação"));
	}
	
	@Test
	public void testRemoverCurso() {
		ger.inserirCurso("Ciência da Computação", "exatas", "Graduação");
		assertTrue(ger.removeCurso("Ciência da Computação"));
		assertFalse(ger.removeCurso("Mecânica"));
	}
	
	@Test
	public void testAtualizaCurso() {
		ger.inserirCurso("Ciência da Computação", "exatas", "Graduação");
		assertTrue(ger.atualizaCurso(_curso));
		ger.removeCurso("Ciência da Computação");
		assertFalse(ger.atualizaCurso(_curso));
	}
	
	@Test
	public void testConexao() {
		assertTrue(_conexao.getConexao() instanceof Connection);
	}
	
	@Test
	public void testInseriCurso() {
		assertEquals(8, _cursoDao.inserir(_curso));
	}
}
