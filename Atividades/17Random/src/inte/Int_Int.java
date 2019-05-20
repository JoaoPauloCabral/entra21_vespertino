package inte;

import java.util.Random;

public class Int_Int {

	public static void main(String[] args) {

		//Instanciando um objeto
		Random gerador = new Random();
		
		//Criando uma variavel e adicionando um valor numerico randomico
		int resultado = gerador.nextInt();
		
		//Exibindo o valor da variavel resultado
		System.out.println(resultado);
		
		
		//---------------------------------------------------------------
		
		//Gerar um numero aleatorio mas com um limite entre 0 e  o numero escolhido:
		
		//Instanciando um objeto
		Random gerador1 = new Random();
				
		//Criando uma variavel e adicionando um valor numerico randomico
		int resultado1 = gerador1.nextInt(9);
				
		//Exibindo o valor da variavel resultado
		System.out.println(resultado1);
				
		
	}

}
