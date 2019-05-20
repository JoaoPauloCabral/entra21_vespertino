package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Setimo formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Campo
		JTextArea campo = new JTextArea();
		
		//Barra de Rolagem
		JScrollPane barraRolagem = new JScrollPane(campo);
		barraRolagem.setBounds(10, 10, 470, 250);
		
		//Adicionar ao formulário
		formulario.add(barraRolagem);
		
		//Exibir componentes
		formulario.setVisible(true);
	}

}
