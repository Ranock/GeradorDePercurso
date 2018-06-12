package br.com.programa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.dto.TemaDto;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;
import br.com.programa.model.gerente.Gerente;
import br.com.programa.service.TemaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API do Tema")
@RestController
@RequestMapping(value="/programa/tema")
@CrossOrigin("*")
public class TemaController {
	@Autowired
	private TemaService temaservice;

	@ApiOperation(value="Cadastra os temas do jogo")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity CadastrarTema(@RequestBody TemaDto temaDto) {
						
		Tema tema = AtribuirTema(temaDto);
		if(temaservice.salvaTema(tema)) 
			return new ResponseEntity(HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
				
	}
	
	@ApiOperation(value="Retorna os temas do jogo")
	@RequestMapping(method=RequestMethod.GET, value="/temas", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tema>> RetornaTemas(){
		List<Tema> temas = temaservice.retornaTemas();
		return new ResponseEntity<List<Tema>>(temas, HttpStatus.OK);
	}

	private Tema AtribuirTema(TemaDto temaDto) {
		Tema tema = new Tema();
		tema.setNome(temaDto.getNome());
		return tema;
	}
}
