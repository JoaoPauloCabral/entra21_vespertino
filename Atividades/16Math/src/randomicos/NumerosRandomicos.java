package randomicos;

import max.MaxMin;

public class NumerosRandomicos {

	public static void main(String[] args) {

		//Variveis
		int limiteMinimo = 0;
		int limiteMaximo = 11;
		
		//Gerar rendom (Ira gerar um numero random quebrado)
		double gerarAleatorio = Math.random();
		
		//Atribuir um numero entre 0 e 10
		int numero = (int) Math.round(limiteMinimo + gerarAleatorio * limiteMaximo);
		
		//Exibir o numero aleatorio
		System.out.println(numero);		
	}

}
