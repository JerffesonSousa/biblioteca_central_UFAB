package br.edu.uepb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<T> {
	public Connection connection;
	public PreparedStatement statement;
	public ResultSet resultSet;
	
	
	public void closeConnections() throws SQLException {
		if(statement != null) {
			statement.close();
		}
		
		if(resultSet != null) {
			resultSet.close();
		}
		
	}
	
	public abstract T get(int id);
	
	public abstract List<T> getLista();
	
	public abstract int inserir(T obj);
	
	public abstract void remover(T obj);
	
	public abstract void remover(int id);
	
	public abstract void atualizar(T obj);
}
