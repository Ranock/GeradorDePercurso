package br.com.programa.model.factory;

import java.util.Random;

import br.com.programa.model.classes.Bonus;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.CasaBonus;
import br.com.programa.model.enumerados.TipoBonus;
import br.com.programa.model.enumerados.TipoCasa;
import br.com.programa.model.interfaces.ICasa;

public class CasaBonusFactory implements ICasa {

	@Override
	public Casa criaCasa(Integer numero) {
		CasaBonus casaBonus = new CasaBonus();
		Integer tipoBonus;
		Random rand = new Random();
		casaBonus.setNumero(numero);
		casaBonus.setTipo(TipoCasa.CASA_BONUS);
		Bonus bonus = new Bonus();
		
		tipoBonus = rand.nextInt(2); 
		bonus.setTipoBonus(TipoBonus.values()[tipoBonus]);
		casaBonus.setBonus(bonus);
		return casaBonus;
	}

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		// TODO Auto-generated method stub
		return null;
	}

}
