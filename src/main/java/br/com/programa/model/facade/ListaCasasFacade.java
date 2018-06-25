package br.com.programa.model.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.programa.model.adapter.CasaAdapter;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.enumerados.TipoCasa;

public class ListaCasasFacade {

	private String mensagemFim;
	private int quantidadeCasas;
	Random rand;
	private CasaAdapter ca;
	
	public  ListaCasasFacade (List<String> mensagemFim, int quantidadeCasas) {
		this.quantidadeCasas  = quantidadeCasas;
		this.rand = new Random();
		if(mensagemFim.size() <= 0) 
			this.mensagemFim = null;		
		else
			this.mensagemFim =  mensagemFim.get(this.rand.nextInt(mensagemFim.size()));
		this.ca = new CasaAdapter();

	}

	public List<Casa> getListaCasas(int intervalo, int random, int minimoEntreBonus){
		intervalo = rand.nextInt(random) + minimoEntreBonus;
		int i = 0;
		int proximoBonusPossivel= intervalo + i ;
		List<Casa> casas = new ArrayList<Casa>();
		for (i = 0; i <= quantidadeCasas; i++) {
			if(i < quantidadeCasas) {
				if (i < proximoBonusPossivel) {
					casas.add(ca.retornaCasa(i, "", TipoCasa.CASA_NORMAL));
				}else {
					if(rand.nextBoolean()) {
						casas.add(ca.retornaCasa(i, "", TipoCasa.CASA_BONUS));
						intervalo = rand.nextInt(3) + 2;
						proximoBonusPossivel = intervalo + i;					
					}else
						casas.add(ca.retornaCasa(i, "", TipoCasa.CASA_NORMAL));
				 }
			}else {
				casas.add(ca.retornaCasa(i, mensagemFim, TipoCasa.CASA_FIM));				
			}			
		}
		return casas;
	}
}
