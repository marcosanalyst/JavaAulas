package oo.heranca.desafio;

public class TestarVelocidade {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Genérico");
		Carro carroGenerico = new Carro();
		carroGenerico.acelerar();
		System.out.println(carroGenerico);
		carroGenerico.acelerar();
		System.out.println(carroGenerico);
		carroGenerico.acelerar();
		System.out.println(carroGenerico);
		carroGenerico.acelerar();
		System.out.println(carroGenerico);
		carroGenerico.frear();
		System.out.println(carroGenerico);
		carroGenerico.frear();
		System.out.println(carroGenerico);
		carroGenerico.frear();
		System.out.println(carroGenerico);
		carroGenerico.frear();
		System.out.println(carroGenerico);
		carroGenerico.frear();
		System.out.println(carroGenerico);
		carroGenerico.acelerar();
		System.out.println(carroGenerico);
		
		System.out.println("Ferrari");
		
		Ferrari ferrariDaBraba = new Ferrari();
		ferrariDaBraba.acelerar();
		ferrariDaBraba.acelerar();
		ferrariDaBraba.acelerar();
		ferrariDaBraba.acelerar();
		System.out.println(ferrariDaBraba);
		ferrariDaBraba.frear();
		ferrariDaBraba.frear();
		System.out.println(ferrariDaBraba);
		
		System.out.println("Civic");
		
		Civic civicao = new Civic();
		civicao.acelerar();
		civicao.acelerar();
		civicao.acelerar();
		civicao.acelerar();
		civicao.acelerar();
		System.out.println(civicao);
		civicao.frear();
		civicao.frear();
		System.out.println(civicao);
		
	}

}
