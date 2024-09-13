package InterfaceAnimal;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo();
		Cachorro cachorro = new Cachorro();
		
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
	}
}
