package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome; 
		int sexo;
		double nota1,nota2,nota3,nota4;
		double total; 
		int contador=0;
		int hom=0, mul=0;
		int bom=0, par=0, oti=0, sat=0, rec=0, rep=0; 
		
		do {
			
			nome = JOptionPane.showInputDialog("Informe o seu nome");
			
			
			if(!nome.equals("SAIR")) {	
				contador++;
				
				Object[] sexo1 = {"Masculino","Feminino"};
			
			sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo1, 0);
			
		switch(sexo) {
		case 0 :
			hom++;
		break;
		case 1:
			mul++;
		}
			
			
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
			nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
			
			total = (nota1+nota2+nota3+nota4)/4;
			
			if(total >= 10) {
				par++;
			JOptionPane.showMessageDialog(null, "Média: "+total+ ". Parabéns");
			}else if(total >= 9) {
				oti++;
				JOptionPane.showMessageDialog(null, "Média: "+total+ ". Ótimo");
			}else if(total >= 8) {
				bom++;
				JOptionPane.showMessageDialog(null, "Média: "+total+ ". Bom");
			}else if(total >= 7) {
				sat++;
				JOptionPane.showMessageDialog(null, "Média: "+total+ ". Satisfatório");
			}else if(total >= 5) {
				rec++;
				JOptionPane.showMessageDialog(null, "Média: "+total+ ". Recuperação");
			}else if (total < 5) {
				rep++;
				JOptionPane.showMessageDialog(null, "Média: "+total+ ". Reprovado");
			}
			
						
			}
		}while(!nome.equals("SAIR"));
		
		
		double media1 = (hom*100)/contador;
		double media2 = (mul*100)/contador;
		
		double media3 = (par*100)/contador;
		double media4 = (oti*100)/contador;
		double media5 = (bom*100)/contador;
		double media6 = (sat*100)/contador;
		double media7 = (rec*100)/contador;
		double media8 = (rep*100)/contador;
		
		JOptionPane.showMessageDialog(null, "Quantidade de pessoas de cada gênero: "
											+ "\nHomens: " +hom+ ". Equivale em % à " +media1+ 
											"\nMulheres: " +mul+ ". Equivale em % à " +media2);
	
		JOptionPane.showMessageDialog(null, "Quantidade de pessoas de cada nota: "
											+ "\nNota 10: " +par+ ". Equivale em % à " +media3+ 
											"\nNota entre 9.0 e 9.9: " +oti+ ". Equivale em % à " +media4+
											"\nNota entre 8.0 e 8.9: " +bom+ ". Equivale em % à " +media5+	
											"\nNota entre 7.0 e 7.9: " +sat+ ". Equivale em % à " +media6+
											"\nNota entre 5.0 e 6.9: " +rec+ ". Equivale em % à " +media7+
											"\nNota abaixo de 5.0: " +rep+ ". Equivale em % à " +media8);
	
	
	
	
	}

}
