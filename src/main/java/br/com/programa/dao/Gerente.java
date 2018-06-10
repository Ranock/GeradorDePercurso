package br.com.programa.dao;

import br.com.programa.model.ConfiguracoesGerais;

public class Gerente {
	private static ConfiguracoesGerais conf;
	private static QuestoesDao questoesDao;
	private static TemaDao temaDao;
	
	public static boolean atribuirConfiguracao(ConfiguracoesGerais config) {
		if (conf == null) {
			conf = new ConfiguracoesGerais();
		}
		conf = config;
		return true;
	}
	public static ConfiguracoesGerais GetConfiguracoesGerais() {
		return conf;
	}
	public static QuestoesDao getQuestoesDao() {
		if (questoesDao == null)
			questoesDao = new QuestoesDao();
		return questoesDao;
	}
	public static TemaDao getTemaDao() {
		if (temaDao  == null)
			temaDao = new TemaDao();
		return temaDao;
	}

	
	
}
