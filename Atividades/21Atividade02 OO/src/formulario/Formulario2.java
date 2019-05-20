package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Formulario2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 frame = new Formulario2();
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
	public Formulario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVocEstLogado = new JLabel("Voc\u00EA est\u00E1 logado como: ADMINISTRADOR");
		lblVocEstLogado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVocEstLogado.setBounds(27, 11, 348, 52);
		contentPane.add(lblVocEstLogado);
		
		JLabel lblEscolhaUmaOpo = new JLabel("Escolha uma Op\u00E7\u00E3o");
		lblEscolhaUmaOpo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblEscolhaUmaOpo.setBounds(27, 56, 125, 27);
		contentPane.add(lblEscolhaUmaOpo);
		
		JButton btnCriarNovoUsurio = new JButton("Criar novo usu\u00E1rio");
		btnCriarNovoUsurio.setBounds(27, 132, 125, 33);
		contentPane.add(btnCriarNovoUsurio);
		
		JButton btnAlterarUsurios = new JButton("Alterar usu\u00E1rios");
		btnAlterarUsurios.setBounds(168, 132, 125, 33);
		contentPane.add(btnAlterarUsurios);
		
		JButton btnAlterarDadosPrprios = new JButton("Alterar dados ");
		btnAlterarDadosPrprios.setBounds(308, 132, 125, 33);
		contentPane.add(btnAlterarDadosPrprios);
		
		JButton button_2 = new JButton("Criar novo usu\u00E1rio");
		button_2.setBounds(447, 132, 125, 33);
		contentPane.add(button_2);
	}

}
