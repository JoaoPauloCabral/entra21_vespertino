package atividade10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double moe1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$0.01"));
		double moe2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$0.05"));
		double moe3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$0.10"));
		double moe4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$0.25"));
		double moe5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$0.50"));
		double moe6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de moedas de R$1.00"));
		double media = (moe1*0.01) + (moe2*0.05) + (moe3*0.10) + (moe4*0.25) + (moe5*0.50) + (moe6*1); 
		
		JOptionPane.showMessageDialog(null, "O total é de R$ "+media);
	
	
	
	
	
	
	}

}
