package atividade05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] numeros = new int[15];
		int soma = 0;
		double media;
		int maiornumero = 0;
		int menornumero = 2000000000;
		int nega=0, neu=0, posi=0;
		int par=0, impar=0;
		int menedia = 0;
		String resultado;
		
		for(byte i=0; i<15; i++) {
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+ "� n�mero"));
		
		
		soma+= numeros[i];
		
		if(numeros[i] < 0 ) {
			nega++;
		}else if (numeros[i] == 0) {
			neu++;
		}else if (numeros[i] > 0) {
			posi++;
		}
		if (numeros[i] > maiornumero) {
			maiornumero = numeros[i];
		
		}else if (numeros[i] < menornumero) {
			menornumero = 0;
			menornumero+= numeros[i];
		}
			
		if (numeros[i] % 2 == 0) {
			par++;
		}else if (numeros[i] % 2 != 0) {
			impar++;
		}
		
		
		}
		
		media = soma/15;
		for (int i=0; i<15; i++) {
			
			if (numeros[i] >= media) {
				menedia++;
			}
			
		}
		
	
		resultado = "A soma dos n�meros �: "+soma;
		 resultado+="\nM�dia dos n�meros �: " +media;
		 resultado+="\nA Quantidade de n�meros maiores ou iguais a m�dia �: " +menedia;
		 resultado+="\nA quantidade n�meros negativos �: " +nega+ ". Positivos: " +posi+ ". Neutros: "+neu;
		 resultado+="\nO maior n�mero �: " +maiornumero;
		 resultado+="\nO menor n�mero �: " +menornumero;
		 resultado+="\nN�meros pares: " +par;
		 resultado+="\nN�meros �mpares: " +impar;
	
		 JOptionPane.showMessageDialog(null, resultado);
		 
	}

}
