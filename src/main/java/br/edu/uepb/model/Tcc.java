package br.edu.uepb.model;

import java.util.Date;

public class Tcc {
	private String titulo;
	private String autores;
	private String orientadores;
	private String tipo;
	private Date andeDeDefesa;
	private String local;
	
	public Tcc(String titulo, String autores, String orientadores, String tipo, Date andeDeDefesa, String local) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.orientadores = orientadores;
		this.tipo = tipo;
		this.andeDeDefesa = andeDeDefesa;
		this.local = local;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getOrientadores() {
		return orientadores;
	}
	public void setOrientadores(String orientadores) {
		this.orientadores = orientadores;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getAndeDeDefesa() {
		return andeDeDefesa;
	}
	public void setAndeDeDefesa(Date andeDeDefesa) {
		this.andeDeDefesa = andeDeDefesa;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
