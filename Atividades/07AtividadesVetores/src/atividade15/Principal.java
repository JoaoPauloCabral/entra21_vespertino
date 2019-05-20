package atividade15;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String[][] matriz = new String [10][10];
		String sair, sair1="";
		
		
		
		for(int linha = 0; linha <10; linha++) {
			for(int coluna = 0; coluna <10; coluna++) {
				matriz[linha][coluna] = "Agua";
			}
		}
		

		for(int linha=0; linha<10; linha++) {
			sair="\n";
		for(int coluna=0; coluna<10; coluna++) {
			sair+=matriz[linha][coluna]+ "     ";
		}
		
		sair1+=sair;
		}
		
		JOptionPane.showMessageDialog(null, sair1);
		
		//Variaveis que armazenarao as posicoes
		int linha1, linha2, linha3, linha4;
		int coluna1, coluna2, coluna3, coluna4;
		int agua = 0;
		int bomba = 0, navio = 0;
		
		//linha e colunas que serao gerada automaticamentes
		Random random = new Random();
		linha1 = random.nextInt(9);
		linha2 = random.nextInt(9);
		linha3 = random.nextInt(9);
		linha4 = random.nextInt(9);
		
		coluna1 = random.nextInt(9);
		coluna2 = random.nextInt(9);
		coluna3 = random.nextInt(9);
		coluna4 = random.nextInt(9);
		
		
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				matriz[i][j] = "Agua";
					
			 	}
			}
		
		
		
		
		
		matriz[linha1][coluna1] = "Bomba";
		matriz[linha2][coluna2] = "Bomba";
		matriz[linha3][coluna3] = "Bomba";
		matriz[linha4][coluna4] = "Navio";
		
		int linha= 0;
		int coluna = 0;
		boolean jogar = true;
		
		
		
		
		
		do {
			
			linha = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor para linha"));
			coluna = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor para coluna"));
			
			if (matriz[linha][coluna].equals("Bomba")) {
				bomba++;
				//matriz[linha][coluna] = "Bomba";
			}else if (matriz[linha][coluna].equals("Navio")) {
				navio++;
				//matriz[linha][coluna] = "Navio";
			}else if (matriz[linha][coluna].equals("Agua")) {
				agua++;
			}
			
			if((linha != -1) && (coluna != -1)) {
				JOptionPane.showMessageDialog(null, matriz[linha][coluna]);
				}else {
				jogar = true;
			}
		

			
			
			
		}while ((jogar == true) && (bomba < 3)  && (navio < 1));
			
		if (bomba == 3) {
			JOptionPane.showMessageDialog(null, "Voce perdeu por acertar a bomba 3 vezes");
		}if (navio == 1) {
			JOptionPane.showMessageDialog(null, "Voce ganhou por acertar o navio");
		}
	
		
	JOptionPane.showMessageDialog(null, "Voce acertou a agua " +agua+ " vezes" +
										"\nAcertou a bomba " +bomba+ " vezes");
			
			
	JOptionPane.showMessageDialog(null, "Fim de jogo");
	}

}
