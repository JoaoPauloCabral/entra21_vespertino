package atividade30;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor ganho por hora"));
		int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas"));
		int horas2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas com 100% de acréscimo"));
		double media = valor*horas;
		double media2 = (valor*2) * horas2;
		double media3 = media + media2; 
		
		JOptionPane.showMessageDialog(null, "Salário bruto de R$ "+media3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
