package br.com.programa.model.factory;

import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.UltimaCasa;
import br.com.programa.model.enumerados.TipoCasa;
import br.com.programa.model.interfaces.ICasa;

public class CasaFimFactory implements ICasa {
	@Override
	public Casa criaCasa(Integer numero) {
		return null;
	}

	@Override
	public Casa criaCasa(Integer numero, String mensagem) {
		UltimaCasa casa = new UltimaCasa();
		casa.setNumero(numero);
		casa.setTipo(TipoCasa.CASA_FIM);
		casa.setMensagemConclusao(mensagem);
		return casa;
	}
}
