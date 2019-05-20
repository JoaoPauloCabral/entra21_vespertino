package atividade09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {


		int [][] num = new int [2][3];
		int [][] num1 = new int [3][2];
		int contador = 1;
		int numero;
		String sair;
		String sair1 ="";
		String sair2;
		String sair3 ="";
		
		
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				
				numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+contador+ "º número"));
				contador++;
				num[linha][coluna] = numero;
				num1[coluna][linha] = numero;
				
			}
		}
		
		
		for(int linha=0; linha<2; linha++) {
			sair="\n";
		for(int coluna=0; coluna<3; coluna++) {
			sair+=num[linha][coluna]+ " ";
		}
		
		sair1+=sair;
		}
		
	
		for(int linha=0; linha<3; linha++) {
			sair2="\n";
		for(int coluna=0; coluna<2; coluna++) {
			sair2+=num[coluna][linha]+ " ";
		}
		
		sair3+=sair2;
		}
		
		
		
		JOptionPane.showMessageDialog(null, sair1);
		JOptionPane.showMessageDialog(null, sair3);
	}

}
