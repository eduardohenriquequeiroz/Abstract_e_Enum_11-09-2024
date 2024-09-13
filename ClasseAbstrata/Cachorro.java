package ClasseAbstrata;

public class Cachorro extends Animal {

	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O cachorro late.");
	}
	@Override
	public void dormir() {
		System.out.println("O cachorro dormi.");		
	}
	@Override
	public void caminhar() {
		System.out.println("O cachorro caminha.");		
	}
	@Override
	public void correr() {
		System.out.println("O cachorro corre.");		
	}
}

