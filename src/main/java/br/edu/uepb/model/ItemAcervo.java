package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="itens")
@PrimaryKeyJoinColumn(name="ITEMID")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemAcervo {
	
	@Id
	@GeneratedValue
	@Column(name="ITEMID")
	private int itemId;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="DATAPUBLICACAO")
	private Date dataPublicacao;
	
	@Column(name="edicao")
	public String edicao;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	

}
