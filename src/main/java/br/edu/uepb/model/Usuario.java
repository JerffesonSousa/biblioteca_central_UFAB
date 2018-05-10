package br.edu.uepb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="USUARIOID")
	private int usuarioId;
	
	@Column(name="CPF")
	private int cpf;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="RG")
	private int rg;
	
	@Column(name="NATURALIDADE")
	private String naturalidade;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="TELEFONE")
	private String telefone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="LOGIN")
	private String login;
	
	@Column(name="SENHA")
	private String senha;
	
	public Usuario() {}

	/**
	 * 
	 * @param usuarioId
	 * @param cpf
	 * @param nome
	 * @param rg
	 * @param naturalidade
	 * @param endereco
	 * @param telefone
	 * @param email
	 * @param login
	 * @param senha
	 */
	public Usuario(int usuarioId, int cpf, String nome, int rg, String naturalidade, String endereco, String telefone,
			String email, String login, String senha) {
		super();
		this.usuarioId = usuarioId;
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}

	/**
	 * @param cpf
	 * @param nome
	 * @param rg
	 * @param naturalidade
	 * @param endereco
	 * @param telefone
	 * @param email
	 * @param login
	 * @param senha
	 */
	public Usuario(int cpf, String nome, int rg, String naturalidade, String endereco, String telefone, String email,
			String login, String senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
