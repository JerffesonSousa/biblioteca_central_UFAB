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

		String sql = "SELECT * FROM jornais WHERE jornalID = ?;";
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
				jornal.setEdicao(resultSet.getString(4));
			}

			super.closeConnections();
			return jornal;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public List<Jornal> getLista() {
		super.connection = new Conexao().getConexao();

		List<Jornal> listaJornais = new ArrayList<Jornal>();
		String sql = "SELECT * FROM jornais;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Jornal jornal = new Jornal(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3),
						resultSet.getString(4));

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

		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO jornais VALUES (DEFAULT,?,?,?);";
			Date dateSql = new java.sql.Date(obj.getData().getTime());
			try {
				super.statement = super.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setDate(2, dateSql);
				super.statement.setString(3, obj.getEdicao());
				super.statement.execute();
				super.resultSet = super.statement.getGeneratedKeys();
				
				if(resultSet.next()) {
					obj.setJornalID(resultSet.getInt(1));
				}

				super.closeConnections();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		} else {
			return obj;
		}
	}

	@Override
	public boolean remover(Jornal obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM jornais WHERE jornalID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getJornalID());
				super.statement.execute();

				super.closeConnections();
				return true;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		} else {
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
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE jornais SET titulo=?, datapublicacao=?, edicao=? WHERE jornalID = ? LIMIT 1;";
			Date dateSql = new java.sql.Date(obj.getData().getTime());

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setDate(2, dateSql);
				super.statement.setString(3, obj.getEdicao());
				super.statement.setInt(4, obj.getJornalID());

				super.statement.execute();

				super.closeConnections();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		} else {
			return obj;
		}
	}

}
