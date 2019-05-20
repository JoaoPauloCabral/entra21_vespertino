package atividade24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o terceiro valor"));
		
		if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num1+ " O segundo é " +num2+ " O terceiro é "+num3 );
		}if ((num2 < num1) && (num2 < num3) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num2+ " O segundo é " +num1+ " O terceiro é "+num3 );
		}if ((num3 < num1) && (num3 < num2) && (num1 < num2)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num3+ " O segundo é " +num1+ " O terceiro é "+num2 );
		
		}if ((num3 < num1) && (num3 < num2) && (num2 < num1)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num3+ " O segundo é " +num2+ " O terceiro é "+num1 );
		}if ((num2 < num1) && (num2 < num3) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num2+ " O segundo é " +num3+ " O terceiro é "+num1 );
		}if((num1 < num2) && (num1 < num3) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro número é: "+num1+ " O segundo é " +num3+ " O terceiro é "+num2 );
		}

		
		
			
		
		
		
		
		
		
		
	}

}
