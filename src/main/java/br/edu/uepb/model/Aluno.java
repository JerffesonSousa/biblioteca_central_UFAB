package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Jerffeson Sousa
 *
 */

@Entity
@Table(name="alunos")
@DiscriminatorValue("aluno")
public class Aluno extends Usuario {
	@Id
	@Column(name="alunoID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int alunoID;
	private String matricula;
	private String nomeMae;
	private String curso;
	private Date ano;
	private String periodo;

	public Aluno() {
		super();
	}
	

	/**
	 * @param cpf
	 * @param nome
	 * @param rg
	 * @param naturalidade
	 * @param endereco
	 * @param tel
	 * @param email
	 * @param login
	 * @param senha
	 * @param alunoID
	 * @param matricula
	 * @param nomeMae
	 * @param curso
	 * @param ano
	 * @param periodo
	 */
	public Aluno(int cpf, String nome, int rg, String naturalidade, String endereco, String tel, String email,
			String login, String senha, int alunoID, String matricula, String nomeMae, String curso, Date ano,
			String periodo) {
		super(cpf, nome, rg, naturalidade, endereco, tel, email, login, senha);
		this.alunoID = alunoID;
		this.matricula = matricula;
		this.nomeMae = nomeMae;
		this.curso = curso;
		this.ano = ano;
		this.periodo = periodo;
	}
	
	

	/**
	 * @param cpf
	 * @param nome
	 * @param rg
	 * @param naturalidade
	 * @param endereco
	 * @param tel
	 * @param email
	 * @param login
	 * @param senha
	 * @param matricula
	 * @param nomeMae
	 * @param curso
	 * @param ano
	 * @param periodo
	 */
	public Aluno(int cpf, String nome, int rg, String naturalidade, String endereco, String tel, String email,
			String login, String senha, String matricula, String nomeMae, String curso, Date ano, String periodo) {
		super(cpf, nome, rg, naturalidade, endereco, tel, email, login, senha);
		this.matricula = matricula;
		this.nomeMae = nomeMae;
		this.curso = curso;
		this.ano = ano;
		this.periodo = periodo;
	}



	public int getAlunoID() {
		return alunoID;
	}

	public void setAlunoID(int alunoID) {
		this.alunoID = alunoID;
	}

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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
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
