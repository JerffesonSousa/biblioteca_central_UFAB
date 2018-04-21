package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.uepb.enums.MidiaEletronicaEnum;

/**
 * Classe para objetos do tipo MidiaEletronica
 * @author Jerffeson Sousa
 * */

@Entity
@Table(name = "midiaseletronicas")
public class MidiaEletronica {
	@Id
	@Column
	@GeneratedValue
	private int midiaID;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="TIPO")
	private MidiaEletronicaEnum tipo;
	
	@Column(name="DATAGRAVACAO")
	private Date dataGravacao;

	public MidiaEletronica() {
	}
	
	/**
	 * Construtor MidiaEletronica
	 * @param midiaID um int para indicar id no banco
	 * @param titulo uma String para indicar o título
	 * @param enum para indicar o tipo(CD, DVD)
	 * @param dataGravacao um objeto do tipo Date para indicar data da gravação
	 */
	public MidiaEletronica(int midiaID, String titulo, MidiaEletronicaEnum tipo, Date dataGravacao) {
		super();
		this.midiaID = midiaID;
		this.titulo = titulo;
		this.tipo = tipo;
		this.dataGravacao = dataGravacao;
	}
	
	/**
	 * Construtor MidiaEletronica
	 * @param titulo uma String para indicar o título
	 * @param tipo enum para indicar o tipo(CD, DVD)
	 * @param dataGravacao um objeto do tipo Date para indicar data da gravação
	 */
	public MidiaEletronica(String titulo, MidiaEletronicaEnum tipo, Date dataGravacao) {
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

	public MidiaEletronicaEnum getTipo() {
		return tipo;
	}

	public void setTipo(MidiaEletronicaEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(Date dataGravacao) {
		this.dataGravacao = dataGravacao;
	}
	
	

}
