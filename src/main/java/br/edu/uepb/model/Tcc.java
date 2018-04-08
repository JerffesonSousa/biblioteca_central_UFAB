package br.edu.uepb.model;

import java.util.Date;

/**
 * @author Jerffeson Sousa
 *
 */

public class Tcc {
	private int tccID;
	private String titulo;
	private String autores;
	private String orientadores;
	private String tipo;
	private Date anodeDeDefesa;
	private String local;
	
	public Tcc () {}

	public Tcc(String titulo, String autores, String orientadores, String tipo, Date andeDeDefesa, String local) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.orientadores = orientadores;
		this.tipo = tipo;
		this.anodeDeDefesa = andeDeDefesa;
		this.local = local;
	}
	
	public Tcc(int tccID, String titulo, String autores, String orientadores, String tipo, Date anodeDeDefesa, String local) {
		super();
		this.tccID = tccID;
		this.titulo = titulo;
		this.autores = autores;
		this.orientadores = orientadores;
		this.tipo = tipo;
		this.anodeDeDefesa = anodeDeDefesa;
		this.local = local;
	}

	public int getTccID() {
		return tccID;
	}

	public void setTccID(int tccID) {
		this.tccID = tccID;
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

	public Date getAnodeDeDefesa() {
		return anodeDeDefesa;
	}

	public void setAnodeDeDefesa(Date andeDeDefesa) {
		this.anodeDeDefesa = andeDeDefesa;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
