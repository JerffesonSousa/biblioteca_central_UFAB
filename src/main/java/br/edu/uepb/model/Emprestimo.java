package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprestimos")
public class Emprestimo {
	
	@Id
	@GeneratedValue
	@Column(name="EMPRESTIMOID")
	private int emprestimoId;
	
	@OneToOne
	@JoinColumn(name="USUARIOID")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="ITEMID")
	private ItemAcervo item;
	
	@Column(name="DATARESERVA")
	private Date dateReserva;
	
	@Column(name="DATAENTREGA")
	private Date dateEntrega;

	public int getEmprestimoId() {
		return emprestimoId;
	}

	public void setEmprestimoId(int emprestimoId) {
		this.emprestimoId = emprestimoId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ItemAcervo getItem() {
		return item;
	}

	public void setItem(ItemAcervo item) {
		this.item = item;
	}

	public Date getDateReserva() {
		return dateReserva;
	}

	public void setDateReserva(Date dateReserva) {
		this.dateReserva = dateReserva;
	}

	public Date getDateEntrega() {
		return dateEntrega;
	}

	public void setDateEntrega(Date dateEntrega) {
		this.dateEntrega = dateEntrega;
	}
	
	
	

}
