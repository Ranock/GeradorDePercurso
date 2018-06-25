package br.com.programa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.programa.model.classes.Tema;
import br.com.programa.model.singleton.Gerente;

@Service
public class TemaService {

	public boolean salvaTema(Tema tema) {
		Gerente gerente = Gerente.GetInstance();
		return gerente.getTemaDao().salvar(tema);
	}
	
	public List<Tema> retornaTemas() {
		Gerente gerente = Gerente.GetInstance();
		List<Tema> tema =  gerente.getTemaDao().BuscarTodos();
		return tema;
	}
}
