package booleane;

import java.util.Random;

public class Bolean {

	public static void main(String[] args) {

		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e adicionando um valor boolean randomico
		boolean resultado = gerador.nextBoolean();
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
		
	}

}
