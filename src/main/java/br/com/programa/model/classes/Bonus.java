package br.com.programa.model.classes;

import br.com.programa.model.enumerados.TipoBonus;

public class Bonus {
	private TipoBonus tipoBonus;

	public TipoBonus getTipoBonus() {
		return tipoBonus;
	}

	public Bonus setTipoBonus(TipoBonus tipoBonus) {
		this.tipoBonus = tipoBonus;
		return this;
	} 
	
	
}
