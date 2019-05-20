package exemplo02;

import java.util.Random;

public class Calculadora {

	//Metodo de gerar um numero
	public int gera() {
		Random a = new Random();
		
		int b = a.nextInt(9);
		
		return b;
	}
	
	//Método para somar
	public static void somar(int n1, String n2) {
		System.out.println(n1+" "+n2);
	}
		
	
	
}
