package exemplo12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	//Criar um Objeto para armazenamento
	Scanner armazenar = new Scanner(System.in);
		
	//Pergunta
	System.out.println("Qual é o seu nome?");
	
	//Armazena
	String nome = armazenar.nextLine();
		
	//Exibir uma frase
	System.out.println("Boa tarde "+nome);
		
	}

}
