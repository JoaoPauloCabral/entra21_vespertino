package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Condiconal Simples
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
	
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "Maior de Idade");
	}else {
		JOptionPane.showMessageDialog(null, "Menor de Idade");
	}
	
	
	
	
	
	
	
	}

}
