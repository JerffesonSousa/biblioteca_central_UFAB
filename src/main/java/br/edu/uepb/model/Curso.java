package br.edu.uepb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Classe para objetos do tipo Curso
 * @author Jerffeson Sousa
 * */
@Entity
@Table(name="cursos")
public class Curso {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cursoID;
	private String nome;
	private String area;
	private String tipo;
	
	public Curso() {}
	
	/**Construtor Curso
	 * @param nome uma string para indicar o nome do curso
	 * @param area uma string para indicar a area do curso
	 * @param tipo uma string para indicar o tipo do curso(p�s-gradua��o ou gradua��o)
	 * */
	public Curso(String nome, String area, String tipo) {
		super();
		this.nome = nome;
		this.area = area;
		this.tipo = tipo;
	}
	
	/**Construtor Curso
	 * @param cursoID um int para indicar seu id no banco
	 * @param nome uma string para indicar o nome do curso
	 * @param area uma string para indicar a area do curso
	 * @param tipo uma string para indicar o tipo do curso(p�s-gradua��o ou gradua��o)
	 * */
	public Curso(int cursoID, String nome, String area, String tipo) {
		super();
		this.cursoID = cursoID;
		this.nome = nome;
		this.area = area;
		this.tipo = tipo;
	}

	public int getCursoID() {
		return cursoID;
	}

	public void setCursoID(int cursoID) {
		this.cursoID = cursoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
