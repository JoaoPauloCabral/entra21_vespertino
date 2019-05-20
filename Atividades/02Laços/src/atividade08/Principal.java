package atividade08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		long valor = Long.parseLong(JOptionPane.showInputDialog("Informe um número"));
		long ant = valor;
		long num1;
		String tabuada = "A tabuda de "+valor+" é:";
		tabuada+= "\n";
		
		do {
			
			
			
				ant--;
				num1 = valor*ant;
				
				tabuada+= "\n"+valor+ " X " +ant+ " = "+num1;
				valor = num1;
				
			
		}while  (ant > 1);
		
		JOptionPane.showMessageDialog(null, tabuada);
	}

}
