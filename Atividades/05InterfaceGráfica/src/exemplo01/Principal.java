package exemplo01;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		//Criar um formul�rio
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formul�rio"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localiza��o
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Fechar totalmente ao ser finalizado
		formulario.setVisible(true); 										//Deixar visivel
		
		
	}

}
