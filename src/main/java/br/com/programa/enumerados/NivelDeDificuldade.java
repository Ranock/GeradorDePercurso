package br.com.programa.enumerados;

public enum NivelDeDificuldade {
	FACIL(0), MEDIO(1), DIFICIL(2);
	
	private int valor;

	private NivelDeDificuldade(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
