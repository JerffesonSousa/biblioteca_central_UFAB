package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.uepb.enums.TccEnum;

@Entity
@Table(name="tcc")
public class Tcc {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tccID;
	private String titulo;
	private String autor;
	private String orientador;
	private TccEnum tipo;
	private Date dataDefesa;
	private String local;
	
	public Tcc() {}
	
	public Tcc(int tccID, String titulo, String autor, String orientador, TccEnum tipo, Date dataDefesa, String local) {
		super();
		this.tccID = tccID;
		this.titulo = titulo;
		this.autor = autor;
		this.orientador = orientador;
		this.tipo = tipo;
		this.dataDefesa = dataDefesa;
		this.local = local;
	}
	public Tcc(String titulo, String autor, String orientador, TccEnum tipo, Date dataDefesa, String local) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.orientador = orientador;
		this.tipo = tipo;
		this.dataDefesa = dataDefesa;
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public TccEnum getTipo() {
		return tipo;
	}

	public void setTipo(TccEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataDefesa() {
		return dataDefesa;
	}

	public void setDataDefesa(Date dataDefesa) {
		this.dataDefesa = dataDefesa;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	

}
