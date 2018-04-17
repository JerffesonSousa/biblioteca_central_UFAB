package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jerffeson Sousa
 * */

@Entity
@Table(name = "midiaseletronicas")
public class MidiaEletronica {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int midiaID;
	private String titulo;
	private String tipo;
	private Date dataGravacao;

	public MidiaEletronica() {
	}

	public MidiaEletronica(int midiaID, String titulo, String tipo, Date dataGravacao) {
		super();
		this.midiaID = midiaID;
		this.titulo = titulo;
		this.tipo = tipo;
		this.dataGravacao = dataGravacao;
	}

	public MidiaEletronica(String titulo, String tipo, Date dataGravacao) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.dataGravacao = dataGravacao;
	}

	public int getMidiaID() {
		return midiaID;
	}

	public void setMidiaID(int midiaID) {
		this.midiaID = midiaID;
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

	public Date getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(Date dataGravacao) {
		this.dataGravacao = dataGravacao;
	}
	
	

}
