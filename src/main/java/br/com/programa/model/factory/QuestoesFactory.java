package br.com.programa.model.factory;

import java.util.List;

import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;
import br.com.programa.model.singleton.Gerente;

public class QuestoesFactory {
	public static QuestoesFactory getQuestoesFactory() {
		return new QuestoesFactory();
	}
	
	public List<Questao> retornaQuestoes(Tema tema){
		Gerente gerente = Gerente.GetInstance();
		List<Questao> questoes;
		List<Questao> questoes2;
		questoes = 	tema.getQuestoes();
		questoes2 = gerente.getQuestoesDao().BuscarTodos();
		for(Questao questao : questoes2) {
			if (questao.getTema() == null)
				questoes.add(questao);
		}
		return questoes;
	}
}
