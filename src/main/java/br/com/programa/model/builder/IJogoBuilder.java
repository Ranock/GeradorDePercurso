package br.com.programa.model.builder;

import java.util.List;

import br.com.programa.model.classes.Avatar;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.ConfiguracoesGerais;
import br.com.programa.model.classes.Jogo;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;

public interface IJogoBuilder {
public IJogoBuilder casas(List<Casa> casas );
public IJogoBuilder perguntas(List<Questao> questoes);
public IJogoBuilder nome(String nome);
public IJogoBuilder tema(Tema tema);
public IJogoBuilder avatares (List<Avatar> avatares);
public Jogo build();

}
