package atividade08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		int [][] num = new int [5][6];
		int contador = 1;
		int numero;
		int par=0, impar=0;
		double media;
		int soma = 0;
		int menedia = 0;
		String sair;
		String sair1 ="";
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				
				num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+contador+ "º número"));
				contador++;
				numero = num[linha][coluna];
				soma+=numero;
			
			if (numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
					
			
			
			}
		}
		
		media = soma/30;
		
		for (int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
			
				if (num[linha][coluna] >= media) {
				menedia++;
			}
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de números pares é: " +par+ ". Ímpares: " +impar+ 
											"\n\nA média dos números informados é: "+media+
											"\n\nA quantidade de números Maiores ou Iguais a média é: " +menedia); 
		
		for(int linha=0; linha<5; linha++) {
			sair="\n";
		for(int coluna=0; coluna<6; coluna++) {
			sair+=num[linha][coluna]+ " ";
		}
		
		sair1+=sair;
		}
		
		
		JOptionPane.showMessageDialog(null, sair1);
		
		
		
		
		
	}

}
