package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo n�mero"));
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, num1+num2);
		
		}else if(num1 != num2) {
			JOptionPane.showMessageDialog(null, num1*num2);
		}
		
		
	}

}
