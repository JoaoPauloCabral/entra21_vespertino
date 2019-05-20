package equals;

import javax.swing.JOptionPane;

public class Equals {

	public static void main(String[] args) {

		//Criar duas variáveis e realizar a captura de informações
		String nome1 = JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 = JOptionPane.showInputDialog("Informe o segundo nome");
	
		//Realizando o comparativo
		if(nome1.equals(nome2)) {
			JOptionPane.showMessageDialog(null, "São Iguais");
		}else {
			JOptionPane.showMessageDialog(null, "São diferentes");
		}
			
	}

}
