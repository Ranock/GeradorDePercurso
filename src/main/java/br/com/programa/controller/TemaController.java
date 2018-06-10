package br.com.programa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.dto.TemaDto;
import br.com.programa.gerente.Gerente;
import br.com.programa.model.Questao;
import br.com.programa.model.Tema;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API do Tema")
@RestController
@RequestMapping(value="/programa/tema")
public class TemaController {

	@ApiOperation(value="Cadastra os temas do jogo")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity CadastrarTema(@RequestBody TemaDto temaDto) {
		
		Gerente gerente = Gerente.GetInstance();				
		Tema tema = AtribuirTema(temaDto);
		gerente.getTemaDao().salvar(tema);
		return new ResponseEntity(HttpStatus.CREATED);		
	}
	
//	public ResponseEntity<List<Questao>> RetornarQuestoesTema(Long id){
//		Tema tema = (Tema) Gerente.getTemaDao().buscar(id);
//		return new ResponseEntity<List<Questao>>(tema.getQuestoes(), HttpStatus.OK);
//	}

	private Tema AtribuirTema(TemaDto temaDto) {
		Tema tema = new Tema();
		tema.setNome(temaDto.getNome());
		return tema;
	}
}
