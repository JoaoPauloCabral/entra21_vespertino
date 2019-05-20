package atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua primeira nota!"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua segunda nota!"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua terceira nota!"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua quarta nota!"));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		JOptionPane.showMessageDialog(null, "Sua média é: "+media);

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Você está aprovado");
		}else if (media >= 5 || (media <= 6.9)) {
			JOptionPane.showMessageDialog(null, "Você está em exame");
		}else if (media >= 0 || (media <= 4.9)) {
			JOptionPane.showMessageDialog(null, "Você está Reprovado");
		}
		
		
		
		
	}

}
