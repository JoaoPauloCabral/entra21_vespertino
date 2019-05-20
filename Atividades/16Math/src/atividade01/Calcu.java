package atividade01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Calcu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu frame = new Calcu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 505);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 401, 119);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(10, 129, 171, 109);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBounds(240, 129, 171, 109);
		contentPane.add(button);
		
		JButton button_1 = new JButton("/");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_1.setBounds(10, 296, 171, 109);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.setBounds(240, 296, 171, 109);
		contentPane.add(button_2);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(165, 248, 88, 39);
		contentPane.add(btnNewButton_1);
	}
}
