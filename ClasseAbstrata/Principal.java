package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {

		Carro ferrari = new Carro("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();

		System.out.println("---------------------------");


		Carro lamborghini = new Carro("00001", "Urus", "Amarelo", 2024);
		lamborghini.ligar();
		lamborghini.acelerar();
		lamborghini.virar();
		lamborghini.frear();

		System.out.println("---------------------------");


		Carro fusca = new Carro("33333", "VW", "Vermelho", 2024);
		fusca.ligar();
		fusca.acelerar();
		fusca.virar();
		fusca.frear();

		System.out.println("---------------------------");

		Onibus marcopolo = new Onibus("11111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();

		System.out.println("---------------------------");

		Moto bmw = new Moto("22222", "Biz", "Rosa", 2024);
		bmw.ligar();
		bmw.acelerar();
		bmw.virar();
		bmw.frear();
	}
}
