package br.edu.uepb.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
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
	private Conexao _conexao;
	private AnaisDAO _anaisDAO;
	private JornalDAO _jornalDAO;
	private LivroDAO _livroDAO;
	private MidiaEletronicaDAO _midiaDAO;
	private RevistaDAO _revistaDAO;
	private TccDAO _tccDAO;
	private CursoDAO _cursoDAO;

	@Before
	public void setUp() {
		ger = new Gerenciador();
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 26);
		date = cal.getTime();

		_anais = new Anais("Artigo", "Primeiro", "José", "Home", date, "Room");
		_jornal = new Jornal("Folha", date, "Segunda");
		_livro = new Livro(1234, "A casa", "Eu", "minha", date, "Segunda", 30, "informatica", "redes");
		_midia = new MidiaEletronica("Know", "CD", date);
		_revista = new Revista("Veja", "Home", date, "Primeira", 20);
		_tcc = new Tcc("A coisa", "Só eu", "thiago", "tese", date, "School");
		_curso = new Curso("Ciência da Computação", "exatas", "pos-graduação");
		_conexao = new Conexao();
		_anaisDAO = new AnaisDAO();
		_jornalDAO = new JornalDAO();
		_livroDAO = new LivroDAO();
		_midiaDAO = new MidiaEletronicaDAO();
		_revistaDAO = new RevistaDAO();
		_tccDAO = new TccDAO();
		_cursoDAO = new CursoDAO();

	}
	
//	@Test
//	public void testInserirAnais() {
//		assertEquals(true, (_anaisDAO.inserir(_anais) instanceof Anais));
//		assertEquals(null, _anaisDAO.inserir(null));
//	}
//	
//	@Test
//	public void testRemoverAnais() {
//		assertTrue(_anaisDAO.remover(_anaisDAO.inserir(_anais)));
//		assertFalse(_anaisDAO.remover(null));
//	}
//	
//	@Test
//	public void testRemoverAnaisID() {
//		assertTrue(_anaisDAO.remover(_anaisDAO.inserir(_anais).getAnaisID()));
//	}
//	
//	@Test
//	public void testAtualizarAnais() {
//		assertTrue((_anaisDAO.atualizar(_anaisDAO.inserir(_anais))) instanceof Anais);
//		assertNull(_anaisDAO.atualizar(null));
//	}
	
//	@Test
//	public void testGetAnais() {
//		assertTrue((_anaisDAO.get(_anaisDAO.inserir(_anais).getAnaisID())) instanceof Anais);
//	}
	
//	@Test
//	public void testGetListAnais() {
//		assertTrue((_anaisDAO.getLista()) instanceof ArrayList);
//	}
	
//	@Test
//	public void testInserirJornal() {
//		assertEquals(true, (_jornalDAO.inserir(_jornal) instanceof Jornal));
//		assertEquals(null, _jornalDAO.inserir(null));
//	}
	
//	@Test
//	public void testRemoverJornal() {
//		assertTrue(_jornalDAO.remover(_jornalDAO.inserir(_jornal)));
//	}
	
//	@Test
//	public void testAtualizaJornal() {
//		assertTrue((_jornalDAO.atualizar(_jornalDAO.inserir(_jornal))) instanceof Jornal);
//		assertNull(_jornalDAO.atualizar(null));
//	}
	
//	@Test
//	public void testGetJornal() {
//		assertTrue((_jornalDAO.get(_jornalDAO.inserir(_jornal).getJornalID())) instanceof Jornal);
//	}
	
//	@Test
//	public void testGetListaJornal() {
//		assertTrue((_jornalDAO.getLista()) instanceof ArrayList);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
