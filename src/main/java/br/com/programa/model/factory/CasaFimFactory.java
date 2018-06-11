package br.com.programa.model.factory;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.UltimaCasa;
import br.com.programa.model.enumerados.TipoCasa;

public class CasaFimFactory {
	public Casa criaCasaFim(int numero, String mensagem) {
		UltimaCasa casa = new UltimaCasa();
		casa.setNumero(numero);
		casa.setTipo(TipoCasa.CASA_FIM);
		casa.setMensagemConclusao(mensagem);
		return casa;
		
	}
}
