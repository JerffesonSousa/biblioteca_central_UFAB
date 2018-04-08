package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.uepb.exceptions.DAOException;

public class AnaisDAO extends DAO<Anais> {

	@Override
	public Anais get(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "SELECT * FROM anais WHERE anaisID=?;";

		Anais anais = null;

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();

			if (resultSet.next()) {
				anais = new Anais();
				anais.setAnaisID(resultSet.getInt(1));
				anais.setTipo(resultSet.getString(2));
				anais.setTitulo(resultSet.getString(3));
				anais.setAutores(resultSet.getString(4));
				anais.setNomeCongresso(resultSet.getString(5));
				anais.setAnoDePublicacao(resultSet.getDate(6));
				anais.setLocal(resultSet.getString(7));
			}
			super.closeConnections();
			return anais;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Anais> getLista() {
		super.connection = new Conexao().getConexao();

		List<Anais> listaAnais = new ArrayList<Anais>();
		String sql = "SELECT * FROM anais;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Anais anais = new Anais(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getDate(6), resultSet.getString(7));

				listaAnais.add(anais);

			}
			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		return listaAnais;
	}

	@Override
	public Anais inserir(Anais obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO anais (tipo, titulo, autor, congresso, publicacao, local VALUES(?,?,?,?,?,?);";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTipo());
				super.statement.setString(2, obj.getTitulo());
				super.statement.setString(3, obj.getAutores());
				super.statement.setString(4, obj.getNomeCongresso());
				super.statement.setDate(5, (Date) obj.getAnoDePublicao());
				super.statement.setString(6, obj.getLocal());
				super.statement.executeQuery();

				super.closeConnections();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public boolean remover(Anais obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM anais WHERE anaisID =? LIMIT 1;";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getAnaisID());
				super.statement.execute();

				super.closeConnections();
				return true;
			} catch (Exception e) {
				throw new DAOException(e.getMessage());
			}
		}

		return false;
	}

	@Override
	public boolean remover(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM anais WHERE anaisID = ? LIMIT 1";
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
	public Anais atualizar(Anais obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE cursos SET tipo=?, titulo=?, autor=?, congresso=?, publicacao=?, local=?, WHERE anaisID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTipo());
				super.statement.setString(2, obj.getTitulo());
				super.statement.setString(3, obj.getAutores());
				super.statement.setString(4, obj.getNomeCongresso());
				super.statement.setDate(5, (Date) obj.getAnoDePublicacao());
				super.statement.setString(6, obj.getLocal());
				super.statement.setInt(6, obj.getAnaisID());

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
