package br.edu.uepb.services;

import java.util.List;

public interface DAOServices<T> {
	public T adiciona(T obj);
	public T edita(T obj);
	public boolean deleta(int objId);
	public T getObj(int objId);
	public List<T> getAllObj();
}