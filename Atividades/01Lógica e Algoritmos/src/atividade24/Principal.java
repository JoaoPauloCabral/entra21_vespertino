package atividade24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o terceiro valor"));
		
		if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num1+ " O segundo � " +num2+ " O terceiro � "+num3 );
		}if ((num2 < num1) && (num2 < num3) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num2+ " O segundo � " +num1+ " O terceiro � "+num3 );
		}if ((num3 < num1) && (num3 < num2) && (num1 < num2)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num3+ " O segundo � " +num1+ " O terceiro � "+num2 );
		
		}if ((num3 < num1) && (num3 < num2) && (num2 < num1)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num3+ " O segundo � " +num2+ " O terceiro � "+num1 );
		}if ((num2 < num1) && (num2 < num3) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num2+ " O segundo � " +num3+ " O terceiro � "+num1 );
		}if((num1 < num2) && (num1 < num3) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero �: "+num1+ " O segundo � " +num3+ " O terceiro � "+num2 );
		}

		
		
			
		
		
		
		
		
		
		
	}

}
