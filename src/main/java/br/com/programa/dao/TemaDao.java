package br.com.programa.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.programa.model.Tema;

public class TemaDao implements DaoGenerico{
	
	private List<Tema> temas;
	private Long id;
	public TemaDao() {
		temas = new ArrayList<Tema>();
		id = 0L;
	}
	
	public boolean salvar(Object tema) {
		boolean saida;
		saida = false;
		Tema t = (Tema) tema;
		t.setId(id + 1);
		if (!(temas.contains(t))) {
			temas.add(t);
			saida = true;
			
		}
		return saida;
	}
	public boolean remover(Long id) { 
		boolean saida;
		Tema tema = new Tema();
		tema.setId(id);
		
		saida = false;
		if (temas.contains(tema)) {
			temas.remove(tema);
			saida = true;
			
		}
		return saida;
	}

	@Override
	public Object buscar(Long id) {
		for (Tema tema : temas) {
			if (tema.getId() == id)
				return tema;
		}
		return null;
	}

	@Override
	public List<Tema> BuscarTodos() {
		return temas;
	}
	public boolean Alterar(Object tema) {
		boolean saida;
		saida = false;
		Tema t = (Tema) tema;
		t.setId(id + 1);
		if ((temas.contains(t))) {
			temas.remove(t);
			temas.add(t);
			saida = true;
			
		}
		return saida;
	}
}
