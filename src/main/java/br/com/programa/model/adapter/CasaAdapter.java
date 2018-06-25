package br.com.programa.model.adapter;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.enumerados.TipoCasa;

public class CasaAdapter  {
	
	public Casa retornaCasa(Integer numero, String mensagem, TipoCasa tipoCasa) {
		switch (tipoCasa) {
		case CASA_BONUS:
			CasaBonusAdapter cba = new CasaBonusAdapter();
			return cba.criaCasa(numero, mensagem);
		case CASA_FIM: 
			CasaFinalAdapter cfa = new CasaFinalAdapter();
			return cfa.criaCasa(numero, mensagem);
		case CASA_NORMAL:
			CasaNormalAdapter cna = new CasaNormalAdapter();
			return cna.criaCasa(numero, mensagem);
		}
		return null;

	}

}
