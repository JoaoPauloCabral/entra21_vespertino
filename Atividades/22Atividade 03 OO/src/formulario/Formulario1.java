package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario1 extends JFrame {

	private JPanel contentPane;

	public Formulario1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaODia = new JLabel("Escolha o dia e o horario da peca");
		lblEscolhaODia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEscolhaODia.setBounds(10, 11, 387, 57);
		contentPane.add(lblEscolhaODia);
		
		
		//Segunda 2
		JButton btnSegunda1 = new JButton("Segunda: 2HRS");
		btnSegunda1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			
			FormularioS1 segunda1 = new FormularioS1();
			segunda1.setVisible(true);
			
			}
		});
		btnSegunda1.setBounds(38, 131, 123, 44);
		contentPane.add(btnSegunda1);
		
		//Segunda 20
		JButton btnSegunda2 = new JButton("Segunda: 20HRS");
		btnSegunda2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				setVisible(false);
			
			
			
			}
		});
		btnSegunda2.setBounds(274, 131, 129, 44);
		contentPane.add(btnSegunda2);
		
		//Quinta 2
		JButton btnQuinta1 = new JButton("Quinta: 2HRS");
		btnQuinta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			setVisible(false);
			
			}
		});
		btnQuinta1.setBounds(38, 206, 123, 44);
		contentPane.add(btnQuinta1);
		
		//Quinta 20
		JButton btnQuinta2 = new JButton("Quinta: 20HRS");
		btnQuinta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			setVisible(false);
			}
		});
		btnQuinta2.setBounds(274, 206, 123, 44);
		contentPane.add(btnQuinta2);
	}
}
