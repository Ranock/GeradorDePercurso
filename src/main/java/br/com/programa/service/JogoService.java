package br.com.programa.service;

import java.util.List;

import br.com.programa.model.builder.JogoBuilder;
import br.com.programa.model.classes.Avatar;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.Jogo;
import br.com.programa.model.classes.ParametrosJogo;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;
import br.com.programa.model.facade.ListaCasasFacade;
import br.com.programa.model.factory.AvatarFactory;
import br.com.programa.model.factory.QuestoesFactory;
import br.com.programa.model.singleton.Gerente;

public class JogoService {
	
	public Jogo geraJogo(ParametrosJogo parametros) {
		Gerente gerente = Gerente.GetInstance();
		Integer quantidadeCasas = parametros.getQuantidadeCasas();
		Integer quantidadeJogadores = parametros.getQuantidadeJogador();
		Tema tema = (Tema) gerente.getTemaDao().buscar(parametros.getTema());
		if (tema == null) 
			tema = new Tema();
		AvatarFactory af = AvatarFactory.getAvatarFactory();
		ListaCasasFacade cf = new ListaCasasFacade(gerente.GetConfiguracoesGerais().getMensagensUltimaCasa(), quantidadeCasas);
		QuestoesFactory qf = QuestoesFactory.getQuestoesFactory();
		List<Avatar> avatarList;
		List<Casa> casas =  cf.getListaCasas(3, 2, 2);
		List<Questao> questoes = qf.retornaQuestoes(tema);
		avatarList =  af.getListaAvatar(gerente.GetConfiguracoesGerais().getCoresAvatar(), quantidadeJogadores);
		JogoBuilder jb = new JogoBuilder();
		Jogo jogo = jb.casas(casas)
								.nome(parametros.getNome())
								.perguntas(questoes)
								.tema(tema)
								.avatares(avatarList)
								.build();
		return jogo;

	}

}
