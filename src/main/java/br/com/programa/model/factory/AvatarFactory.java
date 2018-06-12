package br.com.programa.model.factory;

import java.util.ArrayList;
import java.util.List;

import br.com.programa.model.classes.Avatar;
import br.com.programa.model.enumerados.Cor;

public class AvatarFactory {
	public static AvatarFactory getAvatarFactory() {
		return new AvatarFactory();
	}
	public List<Avatar> getListaAvatar(List<Cor> cores, int quantidade){
		if (quantidade > cores.size()) {
			quantidade = cores.size();
		}
		List<Avatar> avatares = new ArrayList<Avatar>();
		Avatar avatar;
		Long id;
		for (Integer i = 0;  i <= quantidade-1; i++ ) {
			avatar = new Avatar();
			avatar.setCor(cores.get(i));
			id = Long.valueOf(i);
			avatar.setId(id);
			avatares.add(avatar);
		}
		return avatares;
	}
	
}
