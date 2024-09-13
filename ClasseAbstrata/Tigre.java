package ClasseAbstrata;

public class Tigre extends Animal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O tigre rugi.");
	}
	@Override
	public void dormir() {
		System.out.println("O tigre dormi.");		
	}
	@Override
	public void caminhar() {
		System.out.println("O tigre caminha.");		
	}
	@Override
	public void correr() {
		System.out.println("O tigre corre.");		
	}
}

