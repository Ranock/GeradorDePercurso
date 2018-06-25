package br.com.programa.model.factory;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.enumerados.TipoCasa;
import br.com.programa.model.interfaces.ICasa;

public class CasaFactory implements ICasa {
	
	@Override
	public Casa criaCasa(Integer numero) {
		Casa casa = new Casa();
		casa.setNumero(numero);
		casa.setTipo(TipoCasa.CASA_NORMAL);
		return casa;	
	}

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		// TODO Auto-generated method stub
		return null;
	}
}
