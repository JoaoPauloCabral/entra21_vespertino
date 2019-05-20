package atividade19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		
		
		
		
		double s = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o espaço percorrido em metros"));
		double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o tempo em segundos"));
		double vm = s/t;
		
		
		JOptionPane.showMessageDialog(null, "A velocidade média é "+vm+ "m/s");
		
		
		
		
		
		
		
		
	}

}
