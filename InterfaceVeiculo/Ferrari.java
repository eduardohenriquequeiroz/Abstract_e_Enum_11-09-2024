package InterfaceVeiculo;

public class Ferrari implements Veiculo {

	@Override
	public void ligar() {
		System.out.println("A ferrari liga");
	}
	@Override
	public void desligar() {
		System.out.println("A ferrari desliga");
	}
	@Override
	public void manobrar() {
		System.out.println("A ferrari manobra");
	}
	@Override
	public void engatar() {
		System.out.println("A ferrari engata");
	}
	@Override
	public void acelerar() {
		System.out.println("A ferrari acelera");
	}
	@Override
	public void frear() {
		System.out.println("A ferrari freia");
	}
}
