package atividade12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double vei = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade do veículo em km/h"));
		double max = Double.parseDouble(JOptionPane.showInputDialog(null, "Velocidade máxima permitida em km/h"));
		
		if(vei > max+30) {
			JOptionPane.showMessageDialog(null, "Deverá pagar R$200");
		
		}else if(vei > max+11) {
			JOptionPane.showMessageDialog(null, "Deverá pagar R$100");
				
			}else if(vei > max+10) {
				JOptionPane.showMessageDialog(null, "Deverá pagar R$50");
		
		    }else if(vei < max) {
		    	JOptionPane.showMessageDialog(null, "Bom Motorista");
		    }
		
		
	}

}

	