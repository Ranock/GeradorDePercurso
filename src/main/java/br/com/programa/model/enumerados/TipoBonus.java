package br.com.programa.model.enumerados;

public enum TipoBonus {
	PERGUNTA_BONUS(0), AVANCA_CASA(1);
	
	private int valor;
	

	private TipoBonus(int valor) {
		this.valor = valor;
	}


	public int getValor() {
		return valor;
	}
	
	
}
