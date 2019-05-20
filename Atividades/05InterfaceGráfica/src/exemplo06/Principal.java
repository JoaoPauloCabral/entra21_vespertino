package exemplo06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Primerio formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	//JChecbox
		JCheckBox ckb01 = new JCheckBox("Opção 01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("Opção 02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("Opção 03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//Botão
		JButton botao = new JButton("Verificar opções ativas");
		botao.setBounds(10, 110, 200, 30);
		
		//Ação do botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				if(ckb01.isSelected()) {
					JOptionPane.showMessageDialog(null, "Primeira opção selecionada");
				}
				
				if(ckb02.isSelected()) {
					JOptionPane.showMessageDialog(null, "Segunda opção selecionada");
			
				}
				
				if(ckb03.isSelected()) {
					JOptionPane.showMessageDialog(null, "Segunda opção selecionada");
			
				}
			
			
			
			}
		});
		
		//Adicinar componentes ao formulário
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		formulario.add(botao);
		
		
		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
