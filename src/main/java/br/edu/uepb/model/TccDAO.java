package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.uepb.exceptions.DAOException;

public class TccDAO extends DAO<Tcc>{

	@Override
	public Tcc get(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "SELECT * FROM revistas WHERE tccID=?;";
		Tcc tcc = null;
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();
			
			if(resultSet.next()) {
				tcc = new Tcc();
				tcc.setTccID(resultSet.getInt(1));
				tcc.setTitulo(resultSet.getString(2));
				tcc.setAutores(resultSet.getString(3));
				tcc.setOrientadores(resultSet.getString(4));
				tcc.setTipo(resultSet.getString(5));
				tcc.setAnodeDeDefesa(resultSet.getDate(6));
				tcc.setLocal(resultSet.getString(7));
			}
			super.closeConnections();
			return tcc;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Tcc> getLista() {
		super.connection = new Conexao().getConexao();

		List<Tcc> listaTcc = new ArrayList<Tcc>();
		String sql = "SELECT * FROM revistas;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Tcc tcc = new Tcc(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getDate(6), resultSet.getString(7));

				listaTcc.add(tcc);

			}
			super.closeConnections();
			return listaTcc;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Tcc inserir(Tcc obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO tcc VALUES (DEFAULT,?,?,?,?,?);";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getAutores());
				super.statement.setString(3, obj.getOrientadores());
				super.statement.setString(4, obj.getTipo());
				super.statement.setDate(5, (Date) obj.getAnodeDeDefesa());
				super.statement.setString(6, obj.getLocal());
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

	@Override
	public boolean remover(Tcc obj) {
		if(obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM tcc WHERE tccID=? LIMIT 1;";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getTccID());
				super.statement.execute();
				
				super.closeConnections();
				return true;
			} catch (Exception e) {
				throw new DAOException(e.getMessage());
			}
		}else {
			return false;
		}
	}

	@Override
	public boolean remover(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM tcc WHERE tccID=? LIMIT 1;";
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.statement.execute();
			
			super.closeConnections();
			return true;
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Tcc atualizar(Tcc obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE revistas SET titulo=?, autor=?, orientador=?, tipo=?, defesa=?, local=? WHERE revistaID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getAutores());
				super.statement.setString(3, obj.getOrientadores());
				super.statement.setString(4, obj.getTipo());
				super.statement.setDate(5, (Date) obj.getAnodeDeDefesa());
				super.statement.setString(6, obj.getLocal());
				super.statement.setInt(7, obj.getTccID());

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
