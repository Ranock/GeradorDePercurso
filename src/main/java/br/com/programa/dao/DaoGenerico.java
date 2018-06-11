package br.com.programa.dao;

import java.util.List;

import br.com.programa.model.classes.Questao;

public interface DaoGenerico<T> {

	public boolean salvar(T obj);
	public boolean remover(Long id);
	public T buscar(Long id);
	public List BuscarTodos();
}
