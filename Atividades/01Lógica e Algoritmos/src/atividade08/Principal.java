package atividade08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero"));
		String opera�ao = JOptionPane.showInputDialog(null, "Informe a opera��o");
		
		
		if((opera�ao.equals("/")) || (opera�ao.equals("*")) || (opera�ao.equals("+")) || (opera�ao.equals("-"))) {
			double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo n�mero"));
			
			if(opera�ao.equals("*")) {
				JOptionPane.showMessageDialog(null, num1*num2);
				
			}else
				if(opera�ao.equals("+")) {
					JOptionPane.showMessageDialog(null, num1+num2);
					
				}else
					if(opera�ao.equals("-")) {
						JOptionPane.showMessageDialog(null, num1-num2);
						
					}else
						if(opera�ao.equals("/")) {
							JOptionPane.showMessageDialog(null, num1/num2);
						}
			
		
		}else {	
			JOptionPane.showMessageDialog(null, "Erro", "T�tulo", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Informe uma opera��o existente");
		
	}
	}

}
