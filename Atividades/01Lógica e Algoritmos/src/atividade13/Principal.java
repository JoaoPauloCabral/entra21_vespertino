package atividade13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o n�mero"));
		double media = (num1 + 1);
		double media2 = (num1 - 1);
		
		JOptionPane.showMessageDialog(null, "O sucessor do n�mero digitado �: "+media);
		JOptionPane.showMessageDialog(null, "O antecessor do n�mero digitado �: "+media2);
		
		
		
		
		
		
		
		
		
		
	}

}
