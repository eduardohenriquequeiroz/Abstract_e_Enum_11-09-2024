package Funcionario;

public class Horista implements Funcionario {

	@Override
	public long id() {
		System.out.println(001);
		return 0;
	}

	@Override
	public void nome() {
		System.out.println("Eduardo");
		
	}

	@Override
	public void telefone() {
		System.out.println(99145-5581);
		
	}

	@Override
	public int matricula() {
		System.out.println(6120);
		return 0;
	}

	@Override
	public void endereco() {
		System.out.println("Rua Ronald Otto Jorge");
	}
	@Override
	public void calculaSalario() {
		System.out.println(80);
	}
}
