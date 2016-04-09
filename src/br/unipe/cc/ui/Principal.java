package br.unipe.cc.ui;

import br.unipe.cc.Brinquedo.brinquedos.Aviao;
import br.unipe.cc.Brinquedo.brinquedos.Carro;
import br.unipe.cc.Brinquedo.brinquedos.Navio;
import br.unipe.cc.controle.ControleRemoto;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Carro fuska = new Carro();
		@SuppressWarnings("unused")
		Navio solitario = new Navio();
		Aviao gundam = new Aviao();
		
		ControleRemoto controle = new ControleRemoto(gundam);
		
controle.acao();
	}

}
