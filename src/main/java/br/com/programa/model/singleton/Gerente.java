package br.com.programa.model.singleton;

import br.com.programa.dao.QuestoesDao;
import br.com.programa.dao.TemaDao;
import br.com.programa.model.classes.ConfiguracoesGerais;

public class Gerente {
	private  ConfiguracoesGerais conf;
	private  QuestoesDao questoesDao;
	private  TemaDao temaDao;
	private static Gerente instancia;
	private Gerente() {
		
	}
	
	public static Gerente GetInstance() {
		if 	(Gerente.instancia == null) 
			Gerente.instancia = new Gerente();
		return Gerente.instancia;
	}
	
	public  boolean atribuirConfiguracao(ConfiguracoesGerais config) {
		
		conf = config;
		return true;
	}
	public  ConfiguracoesGerais GetConfiguracoesGerais() {
		if (conf == null) {
			conf = new ConfiguracoesGerais();
		}
		return conf;
	}
	public  QuestoesDao getQuestoesDao() {
		if (questoesDao == null)
			questoesDao = new QuestoesDao();
		return questoesDao;
	}
	public  TemaDao getTemaDao() {
		if (temaDao  == null)
			temaDao = new TemaDao();
		return temaDao;
	}

	
	
}
