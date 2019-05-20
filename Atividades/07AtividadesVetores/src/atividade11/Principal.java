package atividade11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String[][] matriz = new String[20][6];
		int indice2 = 0;
		String nome;
		int indice = 1;
		int continuar = 0;
		int sexo1, femi=0,masc=0;
		double peso,altura;
		String genero="";
		String sair,sair1="";
		double imc;
		
		do {
		
			matriz[0][0] = "NOME";
			matriz[0][1] = "SEXO";
			matriz[0][2] = "PESO";
			matriz[0][3] = "Altura";
			matriz[0][4] = "IMC";
			matriz[0][5] = "SITUAÇÃO";
			
			nome = JOptionPane.showInputDialog("Informe seu nome");
			
			Object[] sexo = {"Masculino","Feminino"};
			
		sexo1 = JOptionPane.showOptionDialog(null, "Selecione o seu sexo", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo, 0);	
			
		switch(sexo1) {
		 
		case 0:
			femi++;
		break;
		case 1:
			masc++;
		break;
		}
		
			if (sexo1 == 0) {
				genero = "Masculino";
			}else
				genero = "Feminino";
		
		
		
		
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
			
			imc = peso / (altura*altura);
			
			
			matriz[indice][0] = "\n" +nome;	
			matriz[indice][1] =  genero;
			matriz[indice][2] =  ""+peso;
			matriz[indice][3] =  ""+altura;
			matriz[indice][4] =  ""+imc;
			
			indice++;
			continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais pessoas?");
		}while(continuar == 0);
		
		
		for(int linha=0; linha<20; linha++) {
			sair="\n";
		for(int coluna=0; coluna<6; coluna++) {
			sair+=matriz[linha][coluna]+ "     ";
		}
		
		sair1+=sair;
		}
				
		JOptionPane.showMessageDialog(null, sair1);	
			
	}

}
