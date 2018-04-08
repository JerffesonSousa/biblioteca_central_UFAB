package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.edu.uepb.exceptions.DAOException;

public class JornalDAO extends DAO<Jornal> {

	@Override
	public Jornal get(int id) {
		super.connection = new Conexao().getConexao();

		String sql = "SELECT * FROM jornais WHERE id = ?;";
		Jornal jornal = null;

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();

			if (resultSet.next()) {
				jornal = new Jornal();
				jornal.setJornalID(resultSet.getInt(1));
				jornal.setTitulo(resultSet.getString(2));
				jornal.setData(resultSet.getDate(3));
				jornal.setEdicao(resultSet.getInt(4));
			}

			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		return jornal;
	}

	@Override
	public List<Jornal> getLista() {
		super.connection = new Conexao().getConexao();

		List<Jornal> listaJornais= new ArrayList<Jornal>();
		String sql = "SELECT * FROM jornais;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Jornal jornal = new Jornal(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3),
						resultSet.getInt(4));

				listaJornais.add(jornal);

			}
			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		return listaJornais;
	}

	@Override
	public Jornal inserir(Jornal obj) {
		int id = -1;
		super.connection = new Conexao().getConexao();
		String sql = "INSERT INTO jornais (titulo, data, edicao) VALUES (?,?,?);";
		
		if(obj != null) {
			try {
				super.statement = super.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setDate(2, (Date) obj.getData());
				super.statement.setInt(3, obj.getEdicao());
				super.statement.execute();
				super.resultSet = super.statement.getGeneratedKeys();
				
				if(resultSet.next()) {
					id = super.resultSet.getInt(1);
				}
				
				super.closeConnections();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}else {
			return obj;
		}
	}

	@Override
	public boolean remover(Jornal obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM jornais WHERE id = ? LIMIT 1;";
			
			try {
				super.statement = super .connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getJornalID());
				super.statement.execute();
				
				super.closeConnections();
				return true;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}else {
			return false;
		}
	}

	@Override
	public boolean remover(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM jornais WHERE id = ? LIMIT 1";
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.statement.execute();
			
			super.closeConnections();
			return true;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Jornal atualizar(Jornal obj) {
		if(obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE cursos SET nome = ?, area = ?, tipo = ? WHERE id = ? LIMIT 1;";
			
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setDate(2, (Date) obj.getData());
				super.statement.setInt(3, obj.getEdicao());
				super.statement.setInt(4, obj.getJornalID());
				
				super.statement.execute();
				
				super.closeConnections();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}else {
			return obj;
		}
	}

}
