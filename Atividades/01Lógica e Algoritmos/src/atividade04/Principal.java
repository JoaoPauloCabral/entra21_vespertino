package atividade04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog(null, "Informe o Nome do Produto");
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Valor do Produto"));
		String forma = JOptionPane.showInputDialog(null, "Informe a forma de pagamento do Produto");
		
		if (forma.equals("à vista")) {
			
			if(valor > 500) {
				JOptionPane.showMessageDialog(null, "O produto "+produto);
				JOptionPane.showMessageDialog(null, "Custará com 10% de desconto: "+valor*0.9);
			}
			
			
		}else {
			if(valor < 500) {
				JOptionPane.showMessageDialog(null, "O produto "+produto);
				JOptionPane.showMessageDialog(null, "Custará "+valor);
			}
		
		}
			
		
	}

}
