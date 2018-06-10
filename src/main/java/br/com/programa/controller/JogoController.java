package br.com.programa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.asm.Opcodes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.enumerados.Cor;
import br.com.programa.enumerados.NivelDeDificuldade;
import br.com.programa.enumerados.TipoBonus;
import br.com.programa.model.Bonus;
import br.com.programa.model.Casa;
import br.com.programa.model.CasaBonus;
import br.com.programa.model.ConfiguracoesGerais;
import br.com.programa.model.Jogo;
import br.com.programa.model.OpcaoDaResposta;
import br.com.programa.model.ParametrosJogo;
import br.com.programa.model.Questao;
import br.com.programa.model.Tema;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API do Jogo")
@RestController
@RequestMapping(value="/programa/jogo")
public class JogoController {

	@ApiOperation(value="Cadastra realiza a requisição dos jogos passando o parametro a ser considerado na geração")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornarJogo(@RequestBody ParametrosJogo parametros) {
		Jogo jogo = jogoAleatorio();
		Map<Integer, Object> retorno = new HashMap<Integer, Object>();
		retorno.put(0, jogo);
		retorno.put(1, config());
		retorno.put(3, questoes());
		return new ResponseEntity<Map<Integer, Object>>(retorno,HttpStatus.OK );
	}
	
	private List<Questao> questoes(){
		List<Questao> questoes = new ArrayList<Questao>();
		Questao questao = new Questao();
		questao.setEnunciado("Dormir ou não dormir?");
		questao.setDificuldade(NivelDeDificuldade.FACIL);
		questao.setId(1L);
		OpcaoDaResposta resposta = new OpcaoDaResposta();
		resposta.setResposta("não");
		resposta.setRespostaCerta(true);
		questao.getOpcoes().add(resposta);
		resposta = new OpcaoDaResposta();
		resposta.setResposta("sim");
		resposta.setRespostaCerta(false);
		questao.getOpcoes().add(resposta);
		questoes.add(questao);
		
		questao = new Questao();
		questao.setEnunciado("Cansou?");
		questao.setDificuldade(NivelDeDificuldade.FACIL);
		questao.setId(1L);
		resposta = new OpcaoDaResposta();
		resposta.setResposta("não");
		resposta.setRespostaCerta(false);
		questao.getOpcoes().add(resposta);
		resposta = new OpcaoDaResposta();;
		resposta.setResposta("sim");
		resposta.setRespostaCerta(true);
		questao.getOpcoes().add(resposta);
		questoes.add(questao);
		return questoes;
	}
	private ConfiguracoesGerais config() {
		ConfiguracoesGerais conf = new ConfiguracoesGerais();
		for(Cor cor : Cor.values()) {
			conf.getCoresAvatar().add(cor);
			conf.setCoresTabuleiro(cor);
			conf.getMensagensUltimaCasa().add(String.valueOf(cor.getValor()));
		}
		return conf;
		
	}
	private Jogo jogoAleatorio() {
		Jogo jogo = new Jogo();
		
		Casa casa = new Casa();
		casa.setId(1L);
		casa.setNumero(1);
		jogo.getCasa().add(casa);
		casa = new Casa();
		casa.setId(2L);
		casa.setNumero(2);
		jogo.getCasa().add(casa);
		CasaBonus casab = new CasaBonus();
		casab.setId(3L);
		casab.setNumero(3);
		casab.setBonus(new Bonus().setTipoBonus(TipoBonus.PERGUNTA_BONUS));
		
		jogo.getCasa().add(casab);
		casab = new CasaBonus();
		casab.setId(4L);
		casab.setNumero(4);
		casab.setBonus(new Bonus().setTipoBonus(TipoBonus.AVANCA_CASA));
		jogo.getCasa().add(casab);
		Tema tema = new Tema();
		tema.setNome("Tema inutil");
		
		
		jogo.setId(1L);
		jogo.setNome("Jogo inutil");
		jogo.setTema(tema);
		return jogo;
	}
	
}
