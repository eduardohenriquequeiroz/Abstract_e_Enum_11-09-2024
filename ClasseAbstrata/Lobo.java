package ClasseAbstrata;

public class Lobo extends Animal {
	
	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O lobo uiva.");
	}
	@Override
	public void dormir() {
		System.out.println("O lobo caminha");
		
	}
	@Override
	public void caminhar() {
		System.out.println("O lobo caminha");
		
	}
	@Override
	public void correr() {
		System.out.println("O lobo corre");
	}
}

