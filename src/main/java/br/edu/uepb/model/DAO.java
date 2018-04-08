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
	
	public abstract T inserir(T obj);
	
	public abstract boolean remover(T obj);
	
	public abstract boolean remover(int id);
	
	public abstract T atualizar(T obj);
}
