package atividade28;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número"));
		
		JOptionPane.showMessageDialog(null, num % 2 == 0 ? "Par" : "Ímpar");
		JOptionPane.showMessageDialog(null, num >  0 ? "Positivo" : "Negativo");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
