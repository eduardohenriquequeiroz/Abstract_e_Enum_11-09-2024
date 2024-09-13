package ClasseAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {

		Lobo hunter = new Lobo("Hunter", "Macho", "Husky");
		hunter.emitirSom();

		System.out.println("---------------------------");

		Leao mufasa = new Leao("Mufasa", "Macho", "Leão-africano");
		mufasa.emitirSom();

		System.out.println("---------------------------");

		Tigre simba = new Tigre("Simba", "Macho", "Siberiano");
		simba.emitirSom();

		System.out.println("---------------------------");

		Cachorro blake = new Cachorro("Blake", "Macho", "Chow-chow");
		blake.emitirSom();

		System.out.println("---------------------------");

		Gato nix = new Gato("Nix", "Macho", "Siamês");
		nix.emitirSom();
	}
}
