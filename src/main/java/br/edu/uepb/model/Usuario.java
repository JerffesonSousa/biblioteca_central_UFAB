package br.edu.uepb.model;

/**
 * @author Jerffeson Sousa
 *
 * */

public class Usuario {
	private String userName;
	private String password;
	private String tipo;

	public Usuario(String userName, String password, String tipo) {
		super();
		this.userName = userName;
		this.password = password;
		this.tipo = tipo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
