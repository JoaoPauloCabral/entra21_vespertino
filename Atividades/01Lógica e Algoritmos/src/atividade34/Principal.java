package atividade34;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double aplic = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da aplica��o"));
		double poup = aplic*0.044;
		double cdb = aplic*0.0465;
		double lci = aplic*0.058;
		
		JOptionPane.showMessageDialog(null, "Poupan�a: R$ "+poup+ 
											"\nCDB: R$ "+cdb+
											 "\nLDI: R$ "+lci);
											
		
		
		
		
		
		
		
	}

}
