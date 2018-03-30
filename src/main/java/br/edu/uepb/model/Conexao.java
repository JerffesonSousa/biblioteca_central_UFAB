package br.edu.uepb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConexao() {
		Connection connection = null;
		try {
			if(connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "admin");
			}
			System.out.println("Connected");
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro ao conectar o MySql");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o BD");
		}
		return connection;
	}
	
	public void close(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println("RuntimeException");
		}
	}
}
