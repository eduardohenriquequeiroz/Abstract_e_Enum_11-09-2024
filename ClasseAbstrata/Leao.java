package ClasseAbstrata;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O leão rugi.");
	}
	@Override
	public void dormir() {
		System.out.println("O leão dormi.");		
	}
	@Override
	public void caminhar() {
		System.out.println("O leão caminha.");		
	}
	@Override
	public void correr() {
		System.out.println("O leão corre.");		
	}
}