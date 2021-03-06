package projeto.cartas.efeitos;

import projeto.Jogador;
import projeto.cartas.Unidade;


// Efeito 5
public class Dobradinha extends Efeito {

	public Dobradinha(){
		super.nome = "Dobradinha";
	}

	
	@Override
	public void aplicarEfeito(Jogador atacante, Jogador defensor, Unidade escolhida, TipoChamada tipo) {
		escolhida.aumentarDano(escolhida.getDano());
		escolhida.aumentarVidaMaxima(escolhida.getVidaMaxima());
	}

	@Override
	public void removerEfeito(Unidade unidade) {}

	@Override
	public void ativarEfeitoKill(Jogador jogador) {}
	
	@Override
	public void ativarEfeitoMorte(Jogador jogador) {}


	@Override
	public void passouRodada(Unidade unidade) {
		// TODO Auto-generated method stub
		
	}

}
