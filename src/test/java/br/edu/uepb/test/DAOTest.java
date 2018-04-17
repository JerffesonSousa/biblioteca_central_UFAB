package br.edu.uepb.test;

import junit.framework.TestCase;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.edu.uepb.model.Anais;
import br.edu.uepb.dao.AnaisDAOImpl;

public class DAOTest extends TestCase {
	private Calendar cal;
	private Date date;
	private Anais _anais;
	private ClassPathXmlApplicationContext context;
	private AnaisDAOImpl anaisDao;
	
	@Before
	public void setUp() {
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 26);
		date = cal.getTime();
		context = new ClassPathXmlApplicationContext("spring.xml");
		anaisDao= context.getBean(AnaisDAOImpl.class);
		
		_anais = new Anais("Artigo", "Primeiro", "José", "Home", date, "Room");
	}
	
	@Test
	public void testAdicionaAnais() {
		assertTrue(anaisDao.adiciona(_anais) instanceof Anais);
	}
	
//	@Test
//	public void testEditaAnais() {
//		_anais = new Anais("Artigo", "Segundo", "José", "Home", date, "Room");
//		_anais.setAnaisID(40);
//		assertTrue(anaisDao.edita(null) instanceof Anais);
//	}
	
//	@Test
//	public void testDeletaAnais() {
//		_anais.setAnaisID(40);
//		assertTrue(anaisDao.deleta(_anais.getAnaisID()));
//	}
	
//	@Test(expected = ObjectNotFoundException.class)
//	public void testGetAnais() {
//		assertFalse(anaisDao.getObj(44) instanceof Anais);
//	}
	
//	@Test
//	public void testGetAllAnais() {
//		assertTrue(anaisDao.getAllObj() instanceof List);
//	}

}
