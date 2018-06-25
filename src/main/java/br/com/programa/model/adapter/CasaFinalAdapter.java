package br.com.programa.model.adapter;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.factory.CasaFimFactory;
import br.com.programa.model.interfaces.ICasaAdapter;

public class CasaFinalAdapter implements ICasaAdapter{

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		CasaFimFactory cff = new CasaFimFactory();
		return cff.criaCasa(numero, mensagem);
	}

}
