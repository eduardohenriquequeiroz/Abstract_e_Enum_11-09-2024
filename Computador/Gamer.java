package Computador;

public class Gamer implements Computador {

	@Override
	public void ligar() {
		System.out.println("O computador gamer liga");

	}

	@Override
	public void reiniciar() {
		System.out.println("O computador gamer reinicia");		
	}

	@Override
	public void desligar() {
		System.out.println("O computador gamer desliga");	
	}

	@Override
	public void carregandoSistema() {
		System.out.println("O computador gamer carrega o sistema");

	}

}
