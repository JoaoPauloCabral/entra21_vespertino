package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

 
public class FormularioS1 extends JFrame {
	int i;
	boolean a = false;
	
	private JPanel contentPane;

	public FormularioS1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneUmAcento = new JLabel("Selecione um acento");
		lblSelecioneUmAcento.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSelecioneUmAcento.setBounds(29, 11, 259, 70);
		contentPane.add(lblSelecioneUmAcento);
		
		//VIP A!
		JButton VIPA1 = new JButton("VIP A1");
		VIPA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			i = JOptionPane.showConfirmDialog(null, "O acento VIP A1 custa 300R$. Deseja compra-lo?");
			
			switch(i) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado pela preferencia");
				VIPA1.setEnabled(false);
				a = true;
				break;	
			}
			
			
			
			}
		});
		VIPA1.setBackground(new Color(0, 255, 0));
		VIPA1.setBounds(29, 81, 71, 23);
		contentPane.add(VIPA1);
		
		JButton VIPA2 = new JButton("VIP A2");
		VIPA2.setBackground(new Color(0, 255, 0));
		VIPA2.setBounds(105, 81, 71, 23);
		contentPane.add(VIPA2);
		
		JButton VIPA3 = new JButton("VIP A3");
		VIPA3.setBackground(new Color(0, 255, 0));
		VIPA3.setBounds(181, 81, 71, 23);
		contentPane.add(VIPA3);
		
		JButton VIPA4 = new JButton("VIP A4");
		VIPA4.setBackground(new Color(0, 255, 0));
		VIPA4.setBounds(257, 81, 71, 23);
		contentPane.add(VIPA4);
		
		JButton VIPA5 = new JButton("VIP A5");
		VIPA5.setBackground(new Color(0, 255, 0));
		VIPA5.setBounds(333, 81, 71, 23);
		contentPane.add(VIPA5);
		
		JButton VIPA6 = new JButton("VIP A6");
		VIPA6.setBackground(new Color(0, 255, 0));
		VIPA6.setBounds(409, 81, 71, 23);
		contentPane.add(VIPA6);
		
		JButton VIPA7 = new JButton("VIP A7");
		VIPA7.setBackground(new Color(0, 255, 0));
		VIPA7.setBounds(485, 81, 71, 23);
		contentPane.add(VIPA7);
		
		JButton VIPA8 = new JButton("VIP A8");
		VIPA8.setBackground(new Color(0, 255, 0));
		VIPA8.setBounds(561, 81, 71, 23);
		contentPane.add(VIPA8);
		
		JButton VIPA9 = new JButton("VIP A9");
		VIPA9.setBackground(new Color(0, 255, 0));
		VIPA9.setBounds(637, 81, 71, 23);
		contentPane.add(VIPA9);
		
		JButton VIPA10 = new JButton("VIP A10");
		VIPA10.setBackground(new Color(0, 255, 0));
		VIPA10.setBounds(713, 81, 83, 23);
		contentPane.add(VIPA10);
		
		JButton SAIR = new JButton("SAIR");
		SAIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			setVisible(false);
			Formulario1 sair1 = new Formulario1();
			sair1.setVisible(true);
			
			}
		});
		SAIR.setBounds(682, 11, 89, 32);
		contentPane.add(SAIR);
		
		JButton btnCmtB = new JButton("CMT 1");
		btnCmtB.setBackground(Color.RED);
		btnCmtB.setBounds(29, 115, 71, 23);
		contentPane.add(btnCmtB);
		
		JButton btnCmt = new JButton("CMT 2");
		btnCmt.setBackground(Color.RED);
		btnCmt.setBounds(105, 115, 71, 23);
		contentPane.add(btnCmt);
		
		JButton btnCmt_1 = new JButton("CMT 3");
		btnCmt_1.setBackground(Color.RED);
		btnCmt_1.setBounds(181, 115, 71, 23);
		contentPane.add(btnCmt_1);
		
		JButton btnCmt_2 = new JButton("CMT 4");
		btnCmt_2.setBackground(Color.RED);
		btnCmt_2.setBounds(257, 115, 71, 23);
		contentPane.add(btnCmt_2);
		
		JButton btnCmt_3 = new JButton("CMT 5");
		btnCmt_3.setBackground(Color.RED);
		btnCmt_3.setBounds(333, 115, 71, 23);
		contentPane.add(btnCmt_3);
		
		JButton btnCmt_4 = new JButton("CMT 6");
		btnCmt_4.setBackground(Color.RED);
		btnCmt_4.setBounds(409, 115, 71, 23);
		contentPane.add(btnCmt_4);
		
		JButton btnCmt_5 = new JButton("CMT 7");
		btnCmt_5.setBackground(Color.RED);
		btnCmt_5.setBounds(485, 115, 71, 23);
		contentPane.add(btnCmt_5);
		
		JButton btnCmt_6 = new JButton("CMT 8");
		btnCmt_6.setBackground(Color.RED);
		btnCmt_6.setBounds(561, 115, 71, 23);
		contentPane.add(btnCmt_6);
		
		JButton btnCmt_7 = new JButton("CMT 9");
		btnCmt_7.setBackground(Color.RED);
		btnCmt_7.setBounds(637, 115, 71, 23);
		contentPane.add(btnCmt_7);
		
		JButton btnCmt_8 = new JButton("CMT 10");
		btnCmt_8.setBackground(Color.RED);
		btnCmt_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_8.setBounds(713, 115, 71, 23);
		contentPane.add(btnCmt_8);
		
		JButton btnCmt_9 = new JButton("CMT 11");
		btnCmt_9.setBackground(Color.RED);
		btnCmt_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_9.setBounds(29, 149, 71, 23);
		contentPane.add(btnCmt_9);
		
		JButton btnCmt_10 = new JButton("CMT 12");
		btnCmt_10.setBackground(Color.RED);
		btnCmt_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_10.setBounds(105, 149, 71, 23);
		contentPane.add(btnCmt_10);
		
		JButton btnCmt_11 = new JButton("CMT 13");
		btnCmt_11.setBackground(Color.RED);
		btnCmt_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_11.setBounds(181, 149, 71, 23);
		contentPane.add(btnCmt_11);
		
		JButton btnCmt_12 = new JButton("CMT 14");
		btnCmt_12.setBackground(Color.RED);
		btnCmt_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_12.setBounds(257, 149, 71, 23);
		contentPane.add(btnCmt_12);
		
		JButton btnCmt_13 = new JButton("CMT 15");
		btnCmt_13.setBackground(Color.RED);
		btnCmt_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_13.setBounds(333, 149, 71, 23);
		contentPane.add(btnCmt_13);
		
		JButton btnCmt_14 = new JButton("CMT 16");
		btnCmt_14.setBackground(Color.RED);
		btnCmt_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_14.setBounds(409, 149, 71, 23);
		contentPane.add(btnCmt_14);
		
		JButton btnCmt_15 = new JButton("CMT 17");
		btnCmt_15.setBackground(Color.RED);
		btnCmt_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_15.setBounds(485, 149, 71, 23);
		contentPane.add(btnCmt_15);
		
		JButton btnCmt_16 = new JButton("CMT 18");
		btnCmt_16.setBackground(Color.RED);
		btnCmt_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_16.setBounds(561, 149, 71, 23);
		contentPane.add(btnCmt_16);
		
		JButton btnCmt_17 = new JButton("CMT 19");
		btnCmt_17.setBackground(Color.RED);
		btnCmt_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_17.setBounds(637, 149, 71, 23);
		contentPane.add(btnCmt_17);
		
		JButton btnCmt_18 = new JButton("CMT 20");
		btnCmt_18.setBackground(Color.RED);
		btnCmt_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCmt_18.setBounds(713, 149, 71, 23);
		contentPane.add(btnCmt_18);
	}

}
