package atividade14;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		String[][] matriz = new String [5][15];
		Random gerar = new Random();
		String sair,sair1= "";
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<15; coluna++) {
				matriz[linha][coluna] = " ";
			}
		}
		
		
		
		for(int i=0; i<15; i++) {
			matriz[0][i] = "*";
			matriz[4][i] = "*";
		
			
		}
		for(int i=0; i<5; i++) {	
		matriz[i][0] = "*";
		matriz[i][14] = "*";
		}
		String num = ""+gerar.nextInt(10);
		
		matriz[2][7] = num;
	
		for(int linha=0; linha<5; linha++) {
			sair="\n";
		for(int coluna=0; coluna<15; coluna++) {
			sair+=matriz[linha][coluna]+ " ";
		}
		
		sair1+=sair;
		}
	
	
	System.out.println(sair1);
	
	
	}

}
