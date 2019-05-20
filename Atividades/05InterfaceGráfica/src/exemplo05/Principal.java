package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	
		//Botoes
		JButton btn01 = new JButton("Caixa 01");
		btn01.setBounds(10, 10, 150, 20);
 		
		JButton btn02 = new JButton("Caixa 02");
		btn02.setBounds(190, 10, 150, 20);
		
		// Paineis
		JPanel caixa01 = new JPanel();
		caixa01.setBounds(10, 40, 330, 150);
		caixa01.setBackground(Color.YELLOW);	
		caixa01.setVisible(false);
		
		JPanel caixa02 = new JPanel();
		caixa02.setBounds(10, 40, 330, 150);
		caixa02.setBackground(Color.BLUE);
		
		//Adicionando botao na caixa 02
				JButton botao = new JButton("Enviar");
				botao.setSize(100, 30);
				caixa02.add(botao);
		
		//Açao nos botoes
		btn01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				caixa01.setVisible(true);
				caixa01.setVisible(false);
			
			}
		});
		
		btn02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				caixa01.setVisible(false);
				caixa01.setVisible(true);
			
			}
		});
		
		
		
		
		
		//Adicionar elementos ao formulario
		formulario.add(btn01);
		formulario.add(btn02);
		formulario.add(caixa01);
		formulario.add(caixa02);
		
		
		
		
		
		
		//Exibir componentes
				formulario.setVisible(true);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
