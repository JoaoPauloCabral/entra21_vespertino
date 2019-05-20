package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class FLista extends JFrame {

	private JPanel contentPane;

	public FLista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("FECHAR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			
			}
		});
		btnSair.setBounds(221, 11, 89, 23);
		contentPane.add(btnSair);
		
		Acao a = new Acao();
		
		JLabel lblQtdDeCada = new JLabel("QTD  de cada Produto");
		lblQtdDeCada.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblQtdDeCada.setBounds(10, 15, 201, 45);
		contentPane.add(lblQtdDeCada);
		
		JLabel lblFeijo = new JLabel("Feij\u00E3o: "+a.lista().get(3));
		lblFeijo.setBounds(10, 71, 136, 23);
		contentPane.add(lblFeijo);
		
		JLabel lblQueijo = new JLabel("Queijo: "+a.lista().get(5));
		lblQueijo.setBounds(10, 105, 136, 23);
		contentPane.add(lblQueijo);
		
		JLabel lblPresunto = new JLabel("Presunto: "+a.lista().get(6));
		lblPresunto.setBounds(10, 139, 136, 23);
		contentPane.add(lblPresunto);
		
		JLabel lblArroz = new JLabel("Arroz: "+a.lista().get(0));
		lblArroz.setBounds(10, 173, 136, 23);
		contentPane.add(lblArroz);
		
		JLabel lblBatata = new JLabel("Batata: "+a.lista().get(1));
		lblBatata.setBounds(10, 207, 136, 23);
		contentPane.add(lblBatata);
		
		JLabel lblMacarro = new JLabel("Macarr\u00E3o: "+a.lista().get(4));
		lblMacarro.setBounds(10, 241, 136, 23);
		contentPane.add(lblMacarro);
		
		JLabel lblCenoura = new JLabel("Cenoura: "+a.lista().get(2));
		lblCenoura.setBounds(10, 275, 136, 23);
		contentPane.add(lblCenoura);
		
		JLabel lblMa = new JLabel("Ma\u00E7\u00E3: "+a.lista().get(7));
		lblMa.setBounds(10, 309, 136, 23);
		contentPane.add(lblMa);
	}

}
