package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Formulario3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario3 frame = new Formulario3();
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
	public Formulario3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVocEstLogado = new JLabel("Voc\u00EA est\u00E1 logado como: SIMPLES");
		lblVocEstLogado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVocEstLogado.setBounds(10, 11, 348, 52);
		contentPane.add(lblVocEstLogado);
		
		JLabel label = new JLabel("Escolha uma Op\u00E7\u00E3o");
		label.setFont(new Font("Tahoma", Font.ITALIC, 14));
		label.setBounds(10, 58, 125, 27);
		contentPane.add(label);
		
		JButton button = new JButton("Alterar dados ");
		button.setBounds(10, 144, 125, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Alterar usu\u00E1rios");
		button_1.setBounds(171, 144, 125, 33);
		contentPane.add(button_1);
	}

}
