package br.com.programa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.programa.dto.ConfiguracoesGeraisDto;
import br.com.programa.enumerados.Cor;
import br.com.programa.gerente.Gerente;
import br.com.programa.model.ConfiguracoesGerais;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API com Configuracoes")
@RestController
@RequestMapping("/programa/config")
public class ConfiguracoesController {

	@ApiOperation(value="Cadastra as Configurações gerais")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity salvarConfiguracao(@RequestBody ConfiguracoesGeraisDto configDto){
		Gerente gerente = Gerente.GetInstance();
		try {
			ConfiguracoesGerais config = atribuirConf(configDto);
			gerente.atribuirConfiguracao(config);
			return new ResponseEntity(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
	}

	private ConfiguracoesGerais atribuirConf(ConfiguracoesGeraisDto configDto) {
		ConfiguracoesGerais config = new ConfiguracoesGerais();
		List<Cor> corestab = new ArrayList<Cor>();
		List<Cor> coresAvatar = new ArrayList<Cor>();
		for (Cor cor : Cor.values()) {
			if (cor.getValor() == configDto.getCoresTabuleiro()) {
				config.setCoresTabuleiro(cor);
			}
			for(Integer corAvatar : configDto.getCoresAvatar()) {
				if (corAvatar == cor.getValor())
					coresAvatar.add(cor);
			}
		}
		config.setCoresAvatar(coresAvatar);
		config.setMensagensUltimaCasa(configDto.getMensagensUltimaCasa());
		return config;
	}	
	
}
