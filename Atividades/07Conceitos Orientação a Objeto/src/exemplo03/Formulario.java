package exemplo03;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {

	//Metodo para exibir um Jframe
	void formulario() {
		
		JFrame f = new JFrame("Meu formulário");
		f.setSize(500, 300);
	    f.setLocationRelativeTo(null);
	    f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.add(painel1());
	    f.setVisible(true);
	
	
	}
	
	//Metodo para o JPanel
	JPanel painel1() {
		
		JPanel p =new JPanel();
		p.setBounds(10, 60, 464, 180);
		p.setBackground(Color.RED);
		p.setLayout(null);
	
		//Metodo JButton
		JButton btn;
		for(int i=0; i<3; i++) {
			btn = new JButton();
			btn.setBounds(i*120, 10, 100, 20);
			btn.setText("Botao: "+(i+1));
			p.add(btn);
		}
		return p;
		
		
		
		
		
	}
	
}
