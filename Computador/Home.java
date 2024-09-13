package Computador;

public class Home implements Computador {

	@Override
	public void ligar() {
		System.out.println("O computador home liga");

	}

	@Override
	public void reiniciar() {
		System.out.println("O computador home reinicia");		
	}

	@Override
	public void desligar() {
		System.out.println("O computador home desliga");	
	}

	@Override
	public void carregandoSistema() {
		System.out.println("O computador home carrega o sistema");

	}
}

