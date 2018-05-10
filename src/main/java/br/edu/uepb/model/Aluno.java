package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "alunos")
@PrimaryKeyJoinColumn(name = "USUARIOID")
public class Aluno extends Usuario {
	
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMEMAE")
	private String nomeMae;

	@ManyToOne
	@JoinColumn(name = "CURSOID")
	private Curso curso;

	@Column(name = "ANO")
	private Date ano;

	@Column(name = "PERIODO")
	private String periodo;
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
