package atividade32;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double orca = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do orçamento"));
		
		double dia1 = orca*0.05 + orca;
		double dia2 = orca*0.10	+ orca;
		double dia3 = orca*0.20 + orca;
		double dia4 = orca*0.30 + orca;
		double dia5 = orca*0.40 + orca;
		double dia6 = orca*0.50 + orca;
		
		JOptionPane.showMessageDialog(null, "5% - 30 dias "+dia1+ 
											"\n10% - 60 dias "+dia2+
											"\n20% - 90 dias "+dia3+
											"\n30% - 120 dias "+dia4+
											"\n40% - 180 dias "+dia5+
											"\n50% - 270 dias "+dia6);
		
		
		
		
		
		
		
		
		
		
	}

}
