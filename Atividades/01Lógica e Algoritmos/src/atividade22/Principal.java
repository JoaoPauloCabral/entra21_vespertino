package atividade22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double lado1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do primeiro lado"));
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do segundo lado"));
		double lado3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do terceiro lado"));
		double lado4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do quarto lado"));
		
		if((lado1 == lado2) && (lado3 == lado4) && (lado2 == lado4) && (lado1 == lado4) && (lado1 == lado3))  {
			JOptionPane.showMessageDialog(null, "Objeto analisado é um quadrado");
	
    }else {
    	JOptionPane.showMessageDialog(null, "Objeto analisado não é um quadrado");
    }

		
		
		
		
		
}
}