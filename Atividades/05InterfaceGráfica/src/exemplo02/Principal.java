package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {


		//Criar um formul�rio
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formul�rio"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localiza��o
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Fechar totalmente ao ser finalizado
		formulario.setVisible(true); 										//Deixar visivel
		
		//Bot�o
		JButton botao = new JButton();
		botao.setText("Enviar");					//Texto no botao
		//botao.setSize(100, 30); 					//Definir o tamanho do bot�o 
		botao.setBounds(180, 100, 100, 30);		    //Definir o posicionamento do botao
		
		
		//A�ao no botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ol�");
				
				
			}
		});
		
		//Adicionar botao no formul�rio
		formulario.add(botao);
		
	}

}
