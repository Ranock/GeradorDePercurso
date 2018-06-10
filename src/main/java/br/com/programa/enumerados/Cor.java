package br.com.programa.enumerados;

public enum Cor {
	AZUL(0), VERMELHO(1), AMARELO(2), PRETO(3);
	
	private int valor;

	private Cor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
