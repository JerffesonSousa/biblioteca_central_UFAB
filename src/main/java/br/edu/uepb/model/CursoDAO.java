package br.edu.uepb.model;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Statement;

public class CursoDAO extends DAO<Curso> {

	@Override
	public Curso get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserir(Curso obj) {
		int id = -1;
		super.connection = new Conexao().getConexao();
		String sql = "INSERT INTO cursos (nome, area, tipo) VALUES (?,?,?);";
		
		if(obj != null) {
			try {
				super.statement = super.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				super.statement.setString(1, obj.getNome());
				super.statement.setString(2, obj.getArea());
				super.statement.setString(3, obj.getTipo());
				super.statement.execute();
				super.resultSet = super.statement.getGeneratedKeys();
				
				if(resultSet.next()) {
					id = super.resultSet.getInt(1);
				}
				super.closeConnections();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return id;
	}

	@Override
	public void remover(Curso obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM cursos WHERE id = ? LIMIT 1";
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.statement.execute();
			
			super.closeConnections();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void atualizar(Curso obj) {
	
	}

}
