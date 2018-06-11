package br.com.programa.model.factory;

import java.util.Random;

import br.com.programa.model.classes.Bonus;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.CasaBonus;
import br.com.programa.model.enumerados.TipoBonus;
import br.com.programa.model.enumerados.TipoCasa;

public class CasaBonusFactory {
	
	public Casa CriaCasaBonus(int numero) {
		CasaBonus casaBonus = new CasaBonus();
		Integer tipoBonus;
		Random rand = new Random();
		casaBonus.setNumero(numero);
		casaBonus.setTipo(TipoCasa.CASA_BONUS);
		Bonus bonus = new Bonus();
		
		tipoBonus = rand.nextInt(1); 
		bonus.setTipoBonus(TipoBonus.values()[tipoBonus]);
		casaBonus.setBonus(bonus);
		return casaBonus;
	}

}
