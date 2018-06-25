package br.com.programa.model.interfaces;

import br.com.programa.model.classes.Casa;

public interface ICasa {
	
	public Casa criaCasa(Integer numero);
	public Casa criaCasa(Integer numero, String mensagem);
}
