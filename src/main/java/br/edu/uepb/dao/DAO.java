package br.edu.uepb.dao;

import java.util.List;


public interface DAO<T> {
	public void adiciona(T obj);
	public void edita(T obj);
	public void deleta(int objId);
	public T getObj(int objId);
	public List<T> getAllObj();
	
}
