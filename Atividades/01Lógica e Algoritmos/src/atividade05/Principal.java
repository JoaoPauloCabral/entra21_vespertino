package atividade05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um dia do mês"));
		
		if((dia<1) || (dia>28)) {
			
		}else if(dia == 3 || dia == 4 || dia == 10 || dia == 11 || dia == 17 || dia == 18 || dia == 24 || dia == 25) {
			JOptionPane.showMessageDialog(null, "Final de semana");
		
	}else {
		JOptionPane.showMessageDialog(null, "Dia de semana");
	

	}
}

}