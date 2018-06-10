package br.com.programa.dao;

import java.util.List;

import br.com.programa.model.Questao;

public interface DaoGenerico {

	public boolean salvar(Object obj);
	public boolean remover(Long id);
	public Object buscar(Long id);
	public List BuscarTodos();
}
