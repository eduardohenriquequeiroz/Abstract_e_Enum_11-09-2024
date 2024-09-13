package Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Horista horista = new Horista();
		Jornada jornada = new Jornada();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		horista.id();
		horista.nome();
		horista.telefone();
		horista.matricula();
		horista.endereco();
		horista.calculaSalario();
		
		jornada.id();
		jornada.nome();
		jornada.telefone();
		jornada.matricula();
		jornada.endereco();
		jornada.calculaSalario();
		
		pessoaJuridica.id();
		pessoaJuridica.nome();
		pessoaJuridica.telefone();
		pessoaJuridica.matricula();
		pessoaJuridica.endereco();
		pessoaJuridica.calculaSalario();
	}
}
