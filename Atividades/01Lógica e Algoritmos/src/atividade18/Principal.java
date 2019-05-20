package atividade18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de le"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de ld"));		
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de li"));
		
		if ((num1+num2 < num3) || (num1+num3 < num2) || (num3+num2 < num1)) {
			JOptionPane.showMessageDialog(null, "Não é Triangulo");
		
		
		}else if ((num1 == num2) && (num1 == num3)) {
			JOptionPane.showMessageDialog(null, "Triângulo equilátero");
		
		
		
		}else  if ((num1 != num2) || (num1 != num3) || (num2 != num3)) {
			JOptionPane.showMessageDialog(null, "Triângulo escaleno");
		
		
		
		}else if ((num2 == num3) || (num1 == num3) || (num2 == num1)) {
			JOptionPane.showMessageDialog(null, "Triângulo isósceles");
		
			
		
		
		
		
		
		
		
		
		
		
	}

}

}