package br.com.programa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.dto.QuestaoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="API das Questoes")
@RestController
@RequestMapping(value="/programa/questoes")
public class QuestoesController {

	@ApiOperation(value="cadastra as Questoes que o jogo terá")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity salvarQuestao(@RequestBody QuestaoDto questaoDto) {
		return new ResponseEntity(HttpStatus.OK);
	}
}
