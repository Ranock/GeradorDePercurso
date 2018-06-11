package br.com.programa.model.factory;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.enumerados.TipoCasa;

public class CasaFactory {
	public Casa CriaCasa(int numero) {
		Casa casa = new Casa();
		casa.setNumero(numero);
		casa.setTipo(TipoCasa.CASA_NORMAL);
		return casa;		
	}
}
