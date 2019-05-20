package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formul�rio"); 					//Definir titulo
		formulario.setSize(500, 100);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localiza��o
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	
		//Criar uma caixa de combina��o
		JComboBox<String> opcoes = new JComboBox<String>();
		opcoes.setBounds(10, 10, 300, 30);
		opcoes.addItem("Op��o 01");
		opcoes.addItem("Op��o 02");
		opcoes.addItem("Op��o 03");
		
		//Criar botao
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(330, 10, 140, 30);
		
		
		
		
		
		//A�ao do botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Obter a op�ao selecionada
				String opcao = opcoes.getSelectedItem().toString();
				
				//Exibir a op��o selecionada
				JOptionPane.showMessageDialog(null, opcao);
			}
		});
		
		
		
		
		//Adicionar elemento ao formulario
		formulario.add(opcoes);
		formulario.add(botao);
		
		
		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
