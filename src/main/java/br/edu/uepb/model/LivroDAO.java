package br.edu.uepb.model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.uepb.exceptions.DAOException;

public class LivroDAO extends DAO<Livro> {

	@Override
	public Livro get(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "SELECT * FROM livros WHERE livroID=?;";

		Livro livro = null;

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, id);
			super.resultSet = super.statement.executeQuery();

			if (resultSet.next()) {
				livro = new Livro();
				livro.setLivroID(resultSet.getInt(1));
				livro.setISBN(resultSet.getInt(2));
				livro.setTitulo(resultSet.getString(3));
				livro.setAutores(resultSet.getString(4));
				livro.setEditora(resultSet.getString(5));
				livro.setAnoDePpublicacao(resultSet.getDate(6));
				livro.setEdicao(resultSet.getString(7));
				livro.setnPaginas(resultSet.getInt(8));
				livro.setAreaConhecimento(resultSet.getString(9));
				livro.setSubarea(resultSet.getString(10));
			}
			super.closeConnections();
			return livro;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Livro> getLista() {
		super.connection = new Conexao().getConexao();

		List<Livro> listaLivro = new ArrayList<Livro>();
		String sql = "SELECT * FROM livros;";

		try {
			super.statement = super.connection.prepareStatement(sql);
			super.resultSet = super.statement.executeQuery();

			while (resultSet.next()) {
				Livro livro = new Livro(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getDate(6), resultSet.getString(7),
						resultSet.getInt(8),resultSet.getString(9),resultSet.getString(10));

				listaLivro.add(livro);

			}
			super.closeConnections();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
		return listaLivro;
	}

	@Override
	public Livro inserir(Livro obj) {
		if (obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "INSERT INTO livros local VALUES(DEFAULT,?,?,?,?,?,?,?,?,?);";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getISBN());
				super.statement.setString(2, obj.getTitulo());
				super.statement.setString(3, obj.getAutores());
				super.statement.setString(4, obj.getEditora());
				super.statement.setDate(5, (Date) obj.getAnoDePpublicacao());
				super.statement.setString(6, obj.getEditora());
				super.statement.setInt(7, obj.getnPaginas());
				super.statement.setString(8, obj.getAreaConhecimento());
				super.statement.setString(9, obj.getSubArea());
				super.statement.executeQuery();

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
	public boolean remover(Livro obj) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM livros WHERE livroID=? LIMIT 1;";
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1, obj.getLivroID());
			super.statement.execute();
			
			super.closeConnections();
			return true;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public boolean remover(int id) {
		super.connection = new Conexao().getConexao();
		String sql = "DELETE FROM livros WHERE livroID=? LIMIT 1;";
		try {
			super.statement = super.connection.prepareStatement(sql);
			super.statement.setInt(1,id);
			super.statement.execute();
			
			super.closeConnections();
			return true;
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Livro atualizar(Livro obj) {
		if(obj != null) {
			super.connection = new Conexao().getConexao();
			String sql = "UPDATE livros SET isbn=?, titulo=?, autor=?, editora=?, publicacao=?, edicao=?, paginas=?" +
						"area=?, subarea=? WHERE livroID=? LIMIt 1;";
			try {
				super.statement = super.connection.prepareStatement(sql);
				super.statement.setInt(1, obj.getISBN());
				super.statement.setString(2, obj.getTitulo());
				super.statement.setString(3, obj.getAutores());
				super.statement.setString(4, obj.getEditora());
				super.statement.setDate(5, (Date) obj.getAnoDePpublicacao());
				super.statement.setString(6, obj.getEdicao());
				super.statement.setInt(7, obj.getnPaginas());
				super.statement.setString(8, obj.getAreaConhecimento());
				super.statement.setString(9, obj.getSubarea());
				super.statement.setInt(10, obj.getLivroID());
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
