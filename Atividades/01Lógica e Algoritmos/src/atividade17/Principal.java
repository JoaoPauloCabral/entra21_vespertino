package atividade17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

	Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primero n�mero"));
	Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo n�mero"));	
	double media = num1/num2;	
		
		JOptionPane.showMessageDialog(null, "O quociente �: "+media);
		
		
	}

}
