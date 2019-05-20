package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome1 = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade onde você mora");
	
		JOptionPane.showMessageDialog(null, "Olá "+nome1+  "você tem "+idade+  "de idade e mora em  "+cidade);
		JOptionPane.showMessageDialog(null, "Você tem "+idade);
		JOptionPane.showMessageDialog(null, "E mora em "+cidade);
	}

}
