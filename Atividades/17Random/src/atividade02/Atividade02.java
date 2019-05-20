package atividade02;

import java.util.Random;

public class Atividade02 {

	public static void main(String[] args) {

		String[][] matriz = new String[5][30];
		Random gerar = new Random();
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<30; coluna++) {
				matriz[linha][coluna] = ""+gerar.nextInt(10); 
			}
			
		}
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<30; coluna++) {
				if((linha != 2) || (coluna != 15)) {
					matriz[linha][coluna] = " ";
				}
				 
			}
			
		}
		
		for(int coluna=0; coluna<30; coluna++) {
			matriz[0][coluna] = "*";
			matriz[4][coluna] = "*";
			}
		for(int linha=0; linha<5; linha++) {
			matriz[linha][0] = "*";
			matriz[linha][29] = "*";
		
		}
		
		String resultado = "";
		
		for (int linha =0; linha<5; linha++) {
			resultado+="\n";
			for(int coluna=0; coluna<30; coluna++) {
				resultado+=matriz[linha][coluna]+"";
			}
		}
		
		System.out.println(resultado);
		
	}

}
