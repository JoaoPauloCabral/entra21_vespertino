package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Obter o número
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
		
		//Tabuada
		
		String tabuada = "A tabuda de "+numero+" é:";
		
		//Laço
		
		int indice = 0;
		while(indice <=10) {
			tabuada+= "\n"+numero*indice;
			indice++;
		}
		
		//Exibir
		
		JOptionPane.showMessageDialog(null, tabuada);
		
		
		
		
	}

}
