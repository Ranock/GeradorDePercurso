package br.com.programa.model.adapter;


import br.com.programa.model.classes.Casa;
import br.com.programa.model.factory.CasaBonusFactory;
import br.com.programa.model.interfaces.ICasaAdapter;

public class CasaBonusAdapter implements ICasaAdapter {

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		CasaBonusFactory cbf = new CasaBonusFactory();
		return cbf.criaCasa(numero);
	}

}
