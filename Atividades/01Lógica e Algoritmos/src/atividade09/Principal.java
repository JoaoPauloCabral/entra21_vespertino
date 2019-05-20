package atividade09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o primeiro número"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o segundo número"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o terceiro número"));
		
		if((num1 < num2) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null,"O menor número é: "+num1);
		}else if((num2 < num1) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null,"O menor número é: "+num2);
		
		}else if((num3 < num2) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null,"O menor número é "+num3);
		
		}
		
		}
		

}
