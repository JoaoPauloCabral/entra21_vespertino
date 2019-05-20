package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número"));
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, num1+num2);
		
		}else if(num1 != num2) {
			JOptionPane.showMessageDialog(null, num1*num2);
		}
		
		
	}

}
