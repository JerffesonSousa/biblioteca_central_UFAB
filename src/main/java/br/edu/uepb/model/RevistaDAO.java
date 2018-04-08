package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.uepb.exceptions.DAOException;

public class RevistaDAO extends DAO<Revista>{

	@Override
	public Revista get(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "SELECT * FROM revistas WHERE revistaID=?;";
		Revista revista = null;
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();
			
			if(resultSet.next()) {
				revista = new Revista();
				revista.setRevistID(resultSet.getInt(1));
				revista.setTitulo(resultSet.getString(2));
				revista.setEditora(resultSet.getString(3));
				revista.setAnoDePublicacao(resultSet.getDate(4));
				revista.setEdicao(resultSet.getString(5));
				revista.setnPaginas(resultSet.getShort(6));
			}
			super.closeConnections();
			return revista;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Revista> getLista() {
		super.connection = new Conexao().getConexao();

		List<Revista> listaRevista = new ArrayList<Revista>();
		String sql = "SELECT * FROM revistas;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Revista revista = new Revista(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getDate(4), resultSet.getString(5), resultSet.getInt(6));

				listaRevista.add(revista);

			}
			super.closeConnections();
			return listaRevista;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Revista inserir(Revista obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO revistas VALUES (DEFAULT,?,?,?,?,?);";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getEditora());
				super.statement.setDate(3, (Date) obj.getAnoDePublicacao());
				super.statement.setString(4, obj.getEdicao());
				super.statement.setInt(5, obj.getnPaginas());
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
	public boolean remover(Revista obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM revistas WHERE revistaID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getRevistID());
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
		String sql = "DELETE FROM revistas WHERE revistaID = ? LIMIT 1";
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
	public Revista atualizar(Revista obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE revistas SET titulo=?, editora=?, publicacao=?, edicao=?, paginas=? WHERE revistaID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getEditora());
				super.statement.setDate(3, (Date) obj.getAnoDePublicacao());
				super.statement.setString(4, obj.getEdicao());
				super.statement.setInt(4, obj.getnPaginas());
				super.statement.setInt(5, obj.getRevistID());

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
