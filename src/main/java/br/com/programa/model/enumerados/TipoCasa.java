package br.com.programa.model.enumerados;

public enum TipoCasa {
	CASA_NORMAL(0), CASA_FIM(1), CASA_BONUS(2);
	
	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	private TipoCasa(Integer valor) {
		this.valor = valor;
	}
	
}
