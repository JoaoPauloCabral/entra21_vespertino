package atividade26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Informe o Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Idade"));
		
		if(idade > 90) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � idoso III");
		
		}if((idade > 76) && (idade < 90)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � idoso II");
			
			
		
		}if((idade > 61) && (idade < 75)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � idoso I");
			
		}if((idade > 46) && (idade < 60)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � adulto");	
		
		}if((idade > 31) && (idade < 45)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � Maduro");
		
		}if((idade > 15) && (idade < 30)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � Jovem");
		
		}if((idade > 12) && (idade < 14)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � Adolescente");
			
		
		}if((idade > 5) && (idade < 11)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � Crian�a");
		
		}if((idade > 0) && (idade < 4)) {
			JOptionPane.showMessageDialog(null, "O "+nome+ " tem "+idade+ " anos de idade e � Beb�");
		
		
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
