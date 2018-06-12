package br.com.programa.service;

import org.springframework.stereotype.Service;

import br.com.programa.model.classes.Questao;
import br.com.programa.model.gerente.Gerente;

@Service
public class QuestaoService {

	public boolean salvarQuestao(Questao questao) {
		Gerente gerente = Gerente.GetInstance();
		return gerente.getQuestoesDao().salvar(questao);		
	}
}
