package br.com.programa.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;
import br.com.programa.model.gerente.Gerente;

public class QuestoesDao implements DaoGenerico<Questao>{
	private List<Questao> questoes;
	private Long id;
	private Gerente gerente;
	
	public QuestoesDao() {
		questoes = new ArrayList<Questao>();
		id = 0L;
		gerente = Gerente.GetInstance();
	}
	
	@Override
	public boolean salvar(Questao questao) {
		boolean saida;
		saida = false;
		Questao quest = (Questao) questao; 
		quest.setId(id + 1);
		Tema tema = (Tema) gerente.getTemaDao().buscar(quest.getTema().getId());
		tema.getQuestoes().add(quest);
		gerente.getTemaDao().Alterar(tema);
		if ( !questoes.contains(quest)) {			
			questoes.add(quest);
			saida = true;
		}
		return saida;
	}
	
	public boolean remover(Questao questao) {
		boolean saida;
		saida = false;
		if ( questoes.contains(questao)) {
			questoes.remove(questao);
			saida = true;
		}
		return saida;
	}
	
	public boolean remover(Long id) {
		boolean saida;
		Questao questao = new Questao();
		questao.setId(id);
		saida = false;
		if (questoes.contains(questao)) {
			questoes.remove(questao);
			saida = true;
		}
		return saida;
	}
	
	public Questao buscar(Long id) {
		for (Questao questao : questoes) {
			if (questao.getId() == id)
				return questao;
		}
		return null;
	}
	public List<Questao> BuscarTodos(){
		return questoes;
	}

}
