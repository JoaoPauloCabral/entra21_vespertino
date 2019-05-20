package atividade07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número"));
		
		JOptionPane.showMessageDialog(null, "0x "+num+ "= "+num*0);
		JOptionPane.showMessageDialog(null, "1x "+num+ "= "+num*1);
		JOptionPane.showMessageDialog(null, "2x "+num+ "= "+num*2);
		JOptionPane.showMessageDialog(null, "3x "+num+ "= "+num*3);
		JOptionPane.showMessageDialog(null, "4x "+num+ "= "+num*4);
		JOptionPane.showMessageDialog(null, "5x "+num+ "= "+num*5);
		JOptionPane.showMessageDialog(null, "6x "+num+ "= "+num*6);
		JOptionPane.showMessageDialog(null, "7x "+num+ "= "+num*7);
		JOptionPane.showMessageDialog(null, "8x "+num+ "= "+num*8);
		JOptionPane.showMessageDialog(null, "9x "+num+ "= "+num*9);
		JOptionPane.showMessageDialog(null, "10x "+num+ "= "+num*10);
	
	
	
	}

}
