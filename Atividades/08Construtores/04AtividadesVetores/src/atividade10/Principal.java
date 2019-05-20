package atividade10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int contador = 1;
		int numero;
		int soma, soma2, soma3, soma4,soma5 =0;
		String sair,sair1="";
		
		int[] [] matriz = new int[5][5];
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+contador+ "º número"));
				contador++;
				  numero=matriz[linha][coluna];
				soma5+=numero;
				
			}
		}
		soma = matriz[3][0] +  matriz[3][1] + matriz[3][2] +  matriz[3][3] +  matriz[3][4]; 
		soma2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1];
		soma3 = matriz[0][0] +  matriz[1][1] + matriz[2][2] +  matriz[3][3] +  matriz[4][4]; 
		soma4 = matriz[4][0] + matriz[3][1] + matriz[2][2] + matriz[1][3] + matriz[0][4];
	
	
	
		JOptionPane.showMessageDialog(null, "A soma dos números informados na quarta linha é: " +soma+
											"\n\nA soma dos números informados na segunda coluna é: " +soma2+
											"\n\nA soma da diagonal pricipal é: " +soma3+	
											"\n\nA soma da diagonal secundária é: " +soma4+
											"\n\nA soma de todos os elementos da matriz é: " +soma5);
	
		for(int linha=0; linha<5; linha++) {
			sair="\n";
		for(int coluna=0; coluna<5; coluna++) {
			sair+=matriz[linha][coluna]+ "     ";
		}
		
		sair1+=sair;
		}
		
		
		JOptionPane.showMessageDialog(null,"Matriz informada: "  
											+"\n\n "+sair1);
	
	
	
	
	}

}
