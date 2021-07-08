package projeto.cartas.efeitos;

import java.util.ArrayList;
import java.util.Scanner;

import projeto.Jogador;
import projeto.cartas.Carta;
import projeto.cartas.Unidade;

//Efeito 9
public class MorreuComprou extends Efeito {

int duracao = 1;

	public MorreuComprou(){
		super.nome = "Morreu Comprou";
	}

	private void imprimeEvocadas(Jogador jogador) {
		ArrayList<Carta> aux = jogador.getEvocadas();
		for(int i = 0; i < aux.size(); i++) {
	   		System.out.printf("[%d] - %s\n", i + 1, aux.get(i).getNome());
	   	}
	   	System.out.println("");
	}
	
	@Override
	public void aplicarEfeito(Jogador atacante, Jogador defensor, Unidade escolhida) {
		escolhida.addEfeito(this);
	}
	
	@Override
	public void ativarEfeitoMorte(Jogador jogador) {
		System.out.printf("O jogador %s ganhou uma carta devido ao efeito Morreu Comprou! \n",jogador.getNome());
		System.out.println();
		jogador.pegarCarta();
	}
	
	public void ativarEfeitoKill(Jogador jogador) {
	}
	
	@Override
	public void removerEfeito(Unidade unidade) {
		unidade.removerEfeito(this);
	}

	@Override
	public void passouRodada(Unidade unidade) {
		this.duracao -=1;
		if (this.duracao == 0) {
			removerEfeito(unidade);
		}
		
	}

}
