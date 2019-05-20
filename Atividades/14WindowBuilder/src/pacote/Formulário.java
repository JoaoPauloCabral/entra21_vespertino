package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Formulário extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulário frame = new Formulário();
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
	public Formulário() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 553);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMudarDeCor = new JButton("Mudar de Cor");
		btnMudarDeCor.setBounds(220, 42, 129, 44);
		btnMudarDeCor.setForeground(Color.BLACK);
		btnMudarDeCor.setFont(new Font("Swis721 BlkCn BT", Font.PLAIN, 11));
		btnMudarDeCor.setBackground(Color.YELLOW);
		
		JButton btnVoltar = new JButton("VOltar");
		btnVoltar.setVisible(false);
		
			btnMudarDeCor.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				btnMudarDeCor.setVisible(false);
				btnVoltar.setVisible(true);
				contentPane.setBackground(Color.RED);
				}
			});
			contentPane.add(btnMudarDeCor);
			
			
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnMudarDeCor.setVisible(true);
					btnVoltar.setVisible(false);
				
				}
			});
			btnVoltar.setBounds(223, 199, 161, 78);
			contentPane.add(btnVoltar);
	}
	
	
		
		
	}

