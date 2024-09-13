package Computador;

public class PrincipalComputador {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		Home home = new Home();

		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
	
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
	}
}
