package br.edu.uepb.model;

/**
 * @author Jerffeson Sousa
 *
 */

public class Usuario {
	private int usuarioID;
	private String userName;
	private String password;
	private String tipo;

	public Usuario(String userName, String password, String tipo) {
		super();
		this.userName = userName;
		this.password = password;
		this.tipo = tipo;
	}

	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
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
