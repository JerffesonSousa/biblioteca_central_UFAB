package br.edu.uepb.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.edu.uepb.exceptions.DAOException;

public class CursoDAO extends DAO<Curso> {

	@Override
	public Curso get(int id) {
		super.connection = new Conexao().getConexao();

		String sql = "SELECT * FROM cursos WHERE cursoID = ?;";

		Curso curso = null;

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();

			if (resultSet.next()) {
				curso = new Curso();
				curso.setCursoID(resultSet.getInt(1));
				curso.setNome(resultSet.getString(2));
				curso.setArea(resultSet.getString(3));
				curso.setTipo(resultSet.getString(4));

			}

			super.closeConnections();
			return curso;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}

	}

	@Override
	public List<Curso> getLista() {
		super.connection = new Conexao().getConexao();

		List<Curso> listaCursos = new ArrayList<Curso>();
		String sql = "SELECT * FROM cursos;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Curso curso = new Curso(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4));

				listaCursos.add(curso);

			}
			super.closeConnections();
			return listaCursos;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public Curso inserir(Curso obj) {

		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO cursos (nome, area, tipo) VALUES (?,?,?);";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getNome());
				super.statement.setString(2, obj.getArea());
				super.statement.setString(3, obj.getTipo());
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
	public boolean remover(Curso obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "DELETE FROM cursos WHERE cursoID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getCursoID());
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
		String sql = "DELETE FROM cursos WHERE cursoID = ? LIMIT 1";
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
	public Curso atualizar(Curso obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE cursos SET nome = ?, area = ?, tipo = ? WHERE cursoID = ? LIMIT 1;";

			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setString(1, obj.getNome());
				super.statement.setString(2, obj.getArea());
				super.statement.setString(3, obj.getTipo());
				super.statement.setInt(4, obj.getCursoID());

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
