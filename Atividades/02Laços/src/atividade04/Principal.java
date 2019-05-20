package atividade04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int idade, idade1=0, idade2=0, idade3= 0;
		int exc=0, oti=0, bom=0, regular=0, ruim=0;
		int continuar=0;
		int nota1, contador1=0;
		String nome;
		
		do {
			
			nome = 	JOptionPane.showInputDialog("Informe o seu nome");
			contador1++;
			
			do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
			
			}while((idade < 0) || (idade > 100));	
				
			if((idade > 0) && (idade <= 9)) {
				idade1++;
			}if ((idade > 10) && (idade <= 17)) {
				idade2++;
			}if (idade > 17) {
				idade3++;
			}
			
			
			
			
			Object[] nota = {"Excelente","Ótimo", "Bom", "Regular", "Ruim"};
		
			nota1 = JOptionPane.showOptionDialog(null, "Qual a sua avaliação?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, nota, 0);
		
		switch(nota1) {
		
		case 0:
			exc++;
		break;
		
		case 1:
			oti++;
		break;
			
		case 2:
			bom++;
		break;
			
		case 3:
			regular++;
		break;
		
		case 4:
			ruim++;
		break;
				
		}
			
		
		continuar =	JOptionPane.showConfirmDialog(null, "Fazer outra avaliação?");
		}while(continuar == 0);
	
		double total1 = (exc*100)/contador1;
		double total2 = (oti*100)/contador1;
		double total3 = (bom*100)/contador1;
		double total4 = (regular*100)/contador1;
		double total5 = (ruim*100)/contador1;
	
		
		JOptionPane.showMessageDialog(null, "O percentual de votos é: "
				+ "\nExcelente: "+total1+
				 "\nÓtimo: "+total2+
				 "\nBom: "+total3+
				 "\nRegular: "+total4+
				 "\nRuim: "+total5);
		
				
				
		
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas de cada faixa etária é: "
											+ "\nCrianças: "+idade1+
											 "\nAdolescentes: "+idade2+					
											 "\nAdulto: "+idade3);
		
		


	
	
	}

}
