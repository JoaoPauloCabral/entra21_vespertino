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
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+ "º número"));
		
		
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
		
	
		resultado = "A soma dos números é: "+soma;
		 resultado+="\nMédia dos números é: " +media;
		 resultado+="\nA Quantidade de números maiores ou iguais a média é: " +menedia;
		 resultado+="\nA quantidade números negativos é: " +nega+ ". Positivos: " +posi+ ". Neutros: "+neu;
		 resultado+="\nO maior número é: " +maiornumero;
		 resultado+="\nO menor número é: " +menornumero;
		 resultado+="\nNúmeros pares: " +par;
		 resultado+="\nNúmeros ímpares: " +impar;
	
		 JOptionPane.showMessageDialog(null, resultado);
		 
	}

}
