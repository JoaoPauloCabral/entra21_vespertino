package atividade11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua quarta nota"));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de faltas"));
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(faltas > 15) {
			JOptionPane.showMessageDialog(null, "Reprovado por falta");
		}
		
		
		
		if(media >= 10) {
			JOptionPane.showMessageDialog(null, "Parabéns");
	}else if ((media >= 9) && (media <= 9.9)) {
			JOptionPane.showMessageDialog(null, "Ótimo");
		}else if ((media >= 7) && (media <= 8.9)) {
			JOptionPane.showMessageDialog(null, "Bom");
		}else if ((media >= 5.1) && (media <= 6.9)) {
			JOptionPane.showMessageDialog(null, "Em exame");
		}else if ((media >= 1) && (media <= 5)) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
		
		
		
		
		
		
	}

}
