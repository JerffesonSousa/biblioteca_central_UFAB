package br.edu.uepb.controller;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.edu.uepb.model.Usuario;

public class LoginController {
	ArrayList<Usuario> users;
	private final Logger logger = LogManager.getLogger(LoginController.class);
	
	public LoginController() {
		users = new ArrayList<Usuario>();
	}
	
	public boolean cadastraUsuario(String userName, String password, String tipo) {
		Usuario user = new Usuario(userName, password, tipo);
		return users.add(user);
	}
	
	public boolean loginUsuario(String userName, String password) {
		for(Usuario user : users) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				logger.info("Login realizado");
				return true;
			}
		}
		logger.info("Username ou senha ivalidos");
		return false;
	}
	
}
