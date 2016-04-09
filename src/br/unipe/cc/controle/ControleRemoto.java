package br.unipe.cc.controle;

import br.unipe.cc.Brinquedo.brinquedos.Brinquedo;

public class ControleRemoto {
	private Brinquedo brinquedo;

	public ControleRemoto(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}

	public void acao() {
		brinquedo.mover();
	}
}
