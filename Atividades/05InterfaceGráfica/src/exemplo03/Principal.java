package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		 //Criar um formulário
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Fechar totalmente ao ser finalizado
				
	
		//Criar um rotulo
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30, 30, 150, 20);
		rotulo.setText("Informe seu nome");
		
		//Criar um campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(140, 30, 290, 20);
	
		//Criar botao
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(180, 70, 100, 30);
		
		//Açao do botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter o nome informado
				String nome = campo.getText();
				
				//Exibir uma Mensagem
				JOptionPane.showMessageDialog(null, "Olá " +nome);
				
				//Limpar o campo de texto
				campo.setText("");
				
				//Deixar o cursor selecionado no campo
				campo.requestFocus();
			}
		});
		
		//Adicionar elementos ao formulario
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir o formulario e seus componentes internos
		formulario.setVisible(true); 
		
	
	
	}

}
