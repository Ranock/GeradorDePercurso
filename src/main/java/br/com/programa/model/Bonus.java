package br.com.programa.model;

import br.com.programa.enumerados.TipoBonus;

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
