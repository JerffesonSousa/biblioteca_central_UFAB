package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.uepb.exceptions.DAOException;

public class MidiaEletronicaDAO extends DAO<MidiaEletronica> {

	@Override
	public MidiaEletronica get(int id) {
		super.connection = new Conexao().getConexao();

		String sql = "SELECT * FROM midiaseletronicas WHERE id = ?;";

		MidiaEletronica midia = null;
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();

			if (resultSet.next()) {
				midia = new MidiaEletronica();
				midia.setMidiaID(resultSet.getInt(1));
				midia.setTitulo(resultSet.getString(2));
				midia.setTipo(resultSet.getString(3));
				midia.setDataDaGravacao(resultSet.getDate(4));
			}

			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}

		return midia;
	}

	@Override
	public List<MidiaEletronica> getLista() {
		super.connection = new Conexao().getConexao();

		List<MidiaEletronica> listaMidias = new ArrayList<MidiaEletronica>();
		String sql = "SELECT * FROM midiaseletronicas;";

		try {
			super.statement = connection.prepareStatement(sql);
			super.resultSet = statement.executeQuery();

			while (resultSet.next()) {
				MidiaEletronica midia = new MidiaEletronica(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getDate(4));
				listaMidias.add(midia);
			}
			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}

		return listaMidias;
	}

	@Override
	public MidiaEletronica inserir(MidiaEletronica obj) {
		int id = -1;
		super.connection = new Conexao().getConexao();
		String sql = "INSERT INTO midiaseletronicas (titulo, tipo, datadegravacao) VALUES (?,?,?);";

		if (obj != null) {
			try {
				super.statement = super.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getTipo());
				super.statement.setDate(3, (Date) obj.getDataDaGravacao());
				super.resultSet = super.statement.getGeneratedKeys();

				if (resultSet.next()) {
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
	public boolean remover(MidiaEletronica obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM midiaseletronicas WHERE id = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getMidiaID());
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
		String sql = "DELETE FROM midiaseletronicas WHERE id = ?;";

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
	public MidiaEletronica atualizar(MidiaEletronica obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE midaseletronicas SET titulo = ?, tipo = ?, datadegravacao = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getTitulo());
				super.statement.setString(2, obj.getTipo());
				super.statement.setDate(3, (Date) obj.getDataDaGravacao());

				super.statement.execute();
				return obj;
			} catch (SQLException e) {
				throw new DAOException(e.getMessage());
			}
		}else {
			return obj;
		}

	}

}
