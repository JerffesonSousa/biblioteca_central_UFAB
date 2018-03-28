package br.edu.uepb.model;

/**
 * @author Jerffeson Sousa
 * */

public class Curso {
	private String nome;
	private String area;
	private String tipo;
	
	public Curso(String nome, String area, String tipo) {
		super();
		this.nome = nome;
		this.area = area;
		this.tipo = tipo;
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
