package equals;

import javax.swing.JOptionPane;

public class Equals {

	public static void main(String[] args) {

		//Criar duas vari�veis e realizar a captura de informa��es
		String nome1 = JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 = JOptionPane.showInputDialog("Informe o segundo nome");
	
		//Realizando o comparativo
		if(nome1.equals(nome2)) {
			JOptionPane.showMessageDialog(null, "S�o Iguais");
		}else {
			JOptionPane.showMessageDialog(null, "S�o diferentes");
		}
			
	}

}
