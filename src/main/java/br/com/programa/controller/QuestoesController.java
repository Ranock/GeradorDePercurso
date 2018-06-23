package br.com.programa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.dto.QuestaoDto;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.enumerados.Cor;
import br.com.programa.model.enumerados.NivelDeDificuldade;
import br.com.programa.model.gerente.Gerente;
import br.com.programa.service.QuestaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="API das Questoes")
@RestController
@RequestMapping(value="/programa/questoes")
@CrossOrigin("*")
public class QuestoesController {
	
	@Autowired
	private QuestaoService questaoservice;

	@ApiOperation(value="cadastra as Questoes que o jogo terá")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity salvarQuestao(@RequestBody QuestaoDto questaoDto) {
		Questao questao = AtribuirQuestao(questaoDto);
		if(questaoservice.salvarQuestao(questao))
			return new ResponseEntity(HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@ApiOperation(value="Retorna as Dificuldades")
	@RequestMapping(value="/dificuldades", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retornaDificuldades() {
		return new ResponseEntity(NivelDeDificuldade.values(), HttpStatus.OK);
	}

	private Questao AtribuirQuestao(QuestaoDto questaoDto) {
		Questao questao = new Questao();
		Gerente gerente = Gerente.GetInstance();
		questao.setDificuldade(NivelDeDificuldade.values()[questaoDto.getDificuldade()]);
		questao.setEnunciado(questaoDto.getEnunciado());
		questao.setOpcoes(questaoDto.getOpcoes());
		questao.setTema(gerente.getTemaDao().buscar(questaoDto.getTema()));
		return questao;
	}
}
