package doubla;

import java.util.Random;

public class Doubla {

	public static void main(String[] args) {

		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e adicionando um valor numerico randomico
		double resultado = gerador.nextDouble();
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
		
	}

}
