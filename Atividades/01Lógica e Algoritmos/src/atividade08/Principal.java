package atividade08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
		String operaçao = JOptionPane.showInputDialog(null, "Informe a operação");
		
		
		if((operaçao.equals("/")) || (operaçao.equals("*")) || (operaçao.equals("+")) || (operaçao.equals("-"))) {
			double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número"));
			
			if(operaçao.equals("*")) {
				JOptionPane.showMessageDialog(null, num1*num2);
				
			}else
				if(operaçao.equals("+")) {
					JOptionPane.showMessageDialog(null, num1+num2);
					
				}else
					if(operaçao.equals("-")) {
						JOptionPane.showMessageDialog(null, num1-num2);
						
					}else
						if(operaçao.equals("/")) {
							JOptionPane.showMessageDialog(null, num1/num2);
						}
			
		
		}else {	
			JOptionPane.showMessageDialog(null, "Erro", "Título", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Informe uma operação existente");
		
	}
	}

}
