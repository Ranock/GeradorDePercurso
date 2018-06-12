package br.com.programa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.asm.Opcodes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.model.classes.Avatar;
import br.com.programa.model.classes.Bonus;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.CasaBonus;
import br.com.programa.model.classes.ConfiguracoesGerais;
import br.com.programa.model.classes.Jogo;
import br.com.programa.model.classes.OpcaoDaResposta;
import br.com.programa.model.classes.ParametrosJogo;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;
import br.com.programa.model.enumerados.Cor;
import br.com.programa.model.enumerados.NivelDeDificuldade;
import br.com.programa.model.enumerados.TipoBonus;
import br.com.programa.model.gerente.Gerente;
import br.com.programa.service.JogoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API do Jogo")
@RestController
@RequestMapping(value="/programa/jogo")
@CrossOrigin("*")
public class JogoController {

	@ApiOperation(value="Realiza a criação dos jogos passando o parametro a ser considerado na geração")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornarJogo(@RequestBody ParametrosJogo parametros) {
		Gerente gerente = Gerente.GetInstance();
		Jogo jogo = jogoAleatorio(parametros);
		Map<Integer, Object> retorno = new HashMap<Integer, Object>();
		retorno.put(0, jogo);
		retorno.put(1, gerente.GetConfiguracoesGerais());
		return new ResponseEntity<Map<Integer, Object>>(retorno,HttpStatus.OK );
	}
	
//	private List<Questao> questoes(){
//		List<Questao> questoes = new ArrayList<Questao>();
//		Questao questao = new Questao();
//		questao.setEnunciado("Dormir ou não dormir?");
//		questao.setDificuldade(NivelDeDificuldade.FACIL);
//		questao.setId(1L);
//		OpcaoDaResposta resposta = new OpcaoDaResposta();
//		resposta.setResposta("não");
//		resposta.setRespostaCerta(true);
//		questao.getOpcoes().add(resposta);
//		resposta = new OpcaoDaResposta();
//		resposta.setResposta("sim");
//		resposta.setRespostaCerta(false);
//		questao.getOpcoes().add(resposta);
//		questoes.add(questao);
//		
//		questao = new Questao();
//		questao.setEnunciado("Cansou?");
//		questao.setDificuldade(NivelDeDificuldade.FACIL);
//		questao.setId(1L);
//		resposta = new OpcaoDaResposta();
//		resposta.setResposta("não");
//		resposta.setRespostaCerta(false);
//		questao.getOpcoes().add(resposta);
//		resposta = new OpcaoDaResposta();;
//		resposta.setResposta("sim");
//		resposta.setRespostaCerta(true);
//		questao.getOpcoes().add(resposta);
//		questoes.add(questao);
//		return questoes;
//	}
	private ConfiguracoesGerais config() {
		ConfiguracoesGerais conf = new ConfiguracoesGerais();
		for(Cor cor : Cor.values()) {
			conf.getCoresAvatar().add(cor);
			conf.setCoresTabuleiro(cor);
			conf.getMensagensUltimaCasa().add(String.valueOf(cor.getValor()));
		}
		return conf;
		
	}
	private Jogo jogoAleatorio(ParametrosJogo parametros) {
		JogoService jogoService = new JogoService();
		
		Jogo jogo =jogoService.geraJogo(parametros); // new Jogo();
//		Avatar avatar  = new Avatar();
//		avatar.setCor(Cor.AZUL);
//		avatar.setId(1L);
//		List<Avatar> avatares = new ArrayList<Avatar>();
//		avatares.add(avatar);
//		jogo.setAvatares( avatares);
//		Casa casa = new Casa();
//
//			casa.setNumero(1);
//				jogo.getCasa().add(casa);
//				casa = new Casa();
//				casa.setNumero(2);
//				jogo.getCasa().add(casa);
//				CasaBonus casab = new CasaBonus();
//				casab.setNumero(3);
//				casab.setBonus(new Bonus().setTipoBonus(TipoBonus.PERGUNTA_BONUS));
//				
//				jogo.getCasa().add(casab);
//				casab = new CasaBonus();
//				casab.setNumero(4);
//				casab.setBonus(new Bonus().setTipoBonus(TipoBonus.AVANCA_CASA));
//				jogo.getCasa().add(casab);
//				jogo.setQuestoes(questoes());
//				jogo.setTema(new Tema());
				return jogo;
	}	
}
