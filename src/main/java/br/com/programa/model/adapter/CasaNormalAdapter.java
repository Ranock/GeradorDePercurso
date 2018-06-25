package br.com.programa.model.adapter;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.factory.CasaFactory;
import br.com.programa.model.interfaces.ICasaAdapter;

public class CasaNormalAdapter implements ICasaAdapter {

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		CasaFactory cf = new CasaFactory();
		return cf.criaCasa(numero);
	}
	
}
