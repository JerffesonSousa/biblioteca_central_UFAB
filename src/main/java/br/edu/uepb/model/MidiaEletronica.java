package br.edu.uepb.model;

import java.util.Date;

/**
 * @author Jerffeson Sousa
 *
 * */

public class MidiaEletronica {
	private String titulo;
	private String tipo;
	private Date dataDaGravacao;
	
	
	public MidiaEletronica(String titulo, String tipo, Date dataDaGravacao) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.dataDaGravacao = dataDaGravacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataDaGravacao() {
		return dataDaGravacao;
	}
	public void setDataDaGravacao(Date dataDaGravacao) {
		this.dataDaGravacao = dataDaGravacao;
	}
}
