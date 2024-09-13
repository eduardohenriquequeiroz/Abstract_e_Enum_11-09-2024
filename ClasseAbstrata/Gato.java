package ClasseAbstrata;

public class Gato extends Animal {

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato mia.");
	}
	@Override
	public void dormir() {
		System.out.println("O gato dormi.");		
	}
	@Override
	public void caminhar() {
		System.out.println("O gato caminha.");		
	}
	@Override
	public void correr() {
		System.out.println("O gato corre.");		
	}
}

