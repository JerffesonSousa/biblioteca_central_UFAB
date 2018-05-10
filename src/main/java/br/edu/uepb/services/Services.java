package br.edu.uepb.services;

import java.util.List;

public interface Services<T> {
	public void adiciona(T obj);
	public void edita(T obj);
	public void deleta(int objId);
	public T getObj(int objId);
	public List<T> getAllObj();
}
