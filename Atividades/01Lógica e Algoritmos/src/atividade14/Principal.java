package atividade14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

	
	double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do ve�culo"));
	double val1 = valor*0.10;
	double val2 = valor*0.15;
	double media1 = valor - (val1 + val2);
	
	
	
	
	
	if(valor < 12000) {
		JOptionPane.showMessageDialog(null, "O valor do ve�culo sem a % do distribuidor �: "+valor*0.95);
		JOptionPane.showMessageDialog(null, "Foi arrecadado "+valor*0.05+ "para o distribuidor");
		JOptionPane.showMessageDialog(null, "O ve�culo est� isento de impostos");
	
	}if((valor > 12001) && (valor < 25000)); {
		JOptionPane.showMessageDialog(null, "O valor do ve�culo sem a % do distribuidor e sem impostos �: "+media1);
		JOptionPane.showMessageDialog(null, "Foi arrecadado "+val1+ "para o distribuidor");
		JOptionPane.showMessageDialog(null, "Foi arrecadado "+val2+ "de impostos");
		
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
