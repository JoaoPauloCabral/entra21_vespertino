package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Setimo formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//JRadio Button
		JRadioButton rbt01 = new JRadioButton("Opção 01");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Opção 01 ativa");
		
		JRadioButton rbt02 = new JRadioButton("Opção 02");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Opção 02 ativa");
		
		JRadioButton rbt03 = new JRadioButton("Opção 03");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("Opção 03 ativa");
		
		//Agrupar JRadio Button
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		//Botao
		JButton botao = new JButton("Verificar");
		botao.setBounds(10, 110, 150, 20);
		
		//Ação do Botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter o comand
				String valor = bg.getSelection().getActionCommand();
				
				//Exibir o valor
				JOptionPane.showMessageDialog(null, valor);
			}
		});
		
		//Adicionar elementos ao formulario
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.add(botao);
		//Exibir componentes
				formulario.setVisible(true);
		
	}

}
