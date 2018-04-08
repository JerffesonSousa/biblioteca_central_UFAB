package br.edu.uepb.model;

/**
 * @author Jerffeson Sousa
 */

public class Curso {
	private int cursoID;
	private String nome;
	private String area;
	private String tipo;
	
	public Curso() {}

	public Curso(String nome, String area, String tipo) {
		super();
		this.nome = nome;
		this.area = area;
		this.tipo = tipo;
	}
	
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
