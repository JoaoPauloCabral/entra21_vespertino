package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		do {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade"));	
				System.out.println(idade);
				continuar = false;
			}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha!");
		}
		
	}while(continuar == true);
		
		
		
		
		
		
		
		
		
		
	}

}
