package atividade31;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome1 = JOptionPane.showInputDialog(null, "Informe o primeiro nome");
		
		int idade1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade de "+nome1));
		
		String nome2 = JOptionPane.showInputDialog(null, "Informe o segundo nome");
		
		int idade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade de "+nome2));
		
		String nome3 = JOptionPane.showInputDialog(null, "Informe o terceiro nome");
		
		int idade3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade de "+nome3));
		
		if ((idade3 > idade1) && (idade3 > idade2)) {
			JOptionPane.showMessageDialog(null, "A pessoa mais velha é "+nome3+ " com "+idade3+ " anos de idade");
		
		}if ((idade2 > idade1) && (idade2 > idade1)) {
			JOptionPane.showMessageDialog(null, "A pessoa mais velha é "+nome2+ " com "+idade2+ " anos de idade");
		
		}if ((idade1 > idade2) && (idade1 > idade1)) {
			JOptionPane.showMessageDialog(null, "A pessoa mais velha é "+nome1+ " com "+idade1+ " anos de idade");
		}
		
		
		
		
		
		
		
	}

}
