package atividade02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		
		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é "+valor*0.9);
		
		
	}

}
