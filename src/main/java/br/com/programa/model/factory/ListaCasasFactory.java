package br.com.programa.model.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.programa.model.classes.Casa;

public class ListaCasasFactory {

	private String mensagemFim;
	private int quantidadeCasas;
	Random rand;
	private CasaBonusFactory cbf;
	private CasaFactory cf;
	private CasaFimFactory cff;
	
	public static ListaCasasFactory getListaCasasFactory(List<String> mensagemFim, int quantidadeCasas) {
		ListaCasasFactory lista = new ListaCasasFactory();
		lista.quantidadeCasas  = quantidadeCasas;
		lista.rand = new Random();
		if(mensagemFim.size() <= 0) 
			lista.mensagemFim = null;		
		else
			lista.mensagemFim =  mensagemFim.get(lista.rand.nextInt(mensagemFim.size()));
		lista.cbf = new CasaBonusFactory();
		lista.cf = new CasaFactory();
		lista.cff = new CasaFimFactory();
		return lista;
	}

	public List<Casa> getListaCasas(int intervalo, int random, int minimoEntreBonus){
		intervalo = rand.nextInt(random) + minimoEntreBonus;
		int i = 0;
		int proximoBonusPossivel= intervalo + i ;
		List<Casa> casas = new ArrayList<Casa>();
		for (i = 0; i <= quantidadeCasas; i++) {
			if(i < quantidadeCasas) {
				if (i < proximoBonusPossivel) {
					casas.add(cf.CriaCasa(i));
				}else {
					if(rand.nextBoolean()) {
						casas.add(cbf.CriaCasaBonus(i));
						intervalo = rand.nextInt(3) + 2;
						proximoBonusPossivel = intervalo + i;					
					}else
						casas.add(cf.CriaCasa(i));
				 }
			}else {
				casas.add(cff.criaCasaFim(i,mensagemFim));				
			}			
		}
		return casas;
	}
}
