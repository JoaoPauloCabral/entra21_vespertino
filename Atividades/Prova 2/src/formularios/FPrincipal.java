package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Produtos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FPrincipal extends JFrame {

	private JPanel contentPane;

	public FPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArroz = new JLabel("Arroz");
		lblArroz.setHorizontalAlignment(SwingConstants.CENTER);
		lblArroz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArroz.setBounds(22, 9, 103, 55);
		contentPane.add(lblArroz);
		
		JLabel lblFeijo = new JLabel("Feij\u00E3o");
		lblFeijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeijo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFeijo.setBounds(149, 11, 103, 55);
		contentPane.add(lblFeijo);
		
		JLabel lblMacarro = new JLabel("Macarr\u00E3o");
		lblMacarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMacarro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMacarro.setBounds(294, 10, 103, 55);
		contentPane.add(lblMacarro);
		
		JLabel btnBatata2 = new JLabel("Batata");
		btnBatata2.setHorizontalAlignment(SwingConstants.CENTER);
		btnBatata2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBatata2.setBounds(454, 10, 103, 55);
		contentPane.add(btnBatata2);
		
		JLabel btnCenoura1 = new JLabel("Cenoura");
		btnCenoura1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCenoura1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCenoura1.setBounds(38, 117, 103, 55);
		contentPane.add(btnCenoura1);
		
		JLabel lblMa = new JLabel("Ma\u00E7\u00E3");
		lblMa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMa.setBounds(165, 113, 103, 55);
		contentPane.add(lblMa);
		
		JLabel lblQueijo = new JLabel("Queijo");
		lblQueijo.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueijo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQueijo.setBounds(296, 117, 103, 55);
		contentPane.add(lblQueijo);
		
		JLabel lblPresunto = new JLabel("Presunto");
		lblPresunto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresunto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPresunto.setBounds(449, 118, 103, 55);
		contentPane.add(lblPresunto);
		
		JLabel Qtd = new JLabel("0");
		Qtd.setHorizontalAlignment(SwingConstants.CENTER);
		Qtd.setBounds(571, 12, 56, 21);
		contentPane.add(Qtd);
		
		JButton btnArroz1 = new JButton("+");
		btnArroz1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnArroz1.setBounds(23, 53, 43, 40);
		contentPane.add(btnArroz1);
		
		JButton btnArroz2 = new JButton("-");
		
		btnArroz2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnArroz2.setBounds(75, 54, 43, 40);
		contentPane.add(btnArroz2);
		
		JButton btnFeij�o1 = new JButton("+");
		
		btnFeij�o1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFeij�o1.setBounds(152, 52, 43, 40);
		contentPane.add(btnFeij�o1);
		
		JButton btnFeij�o2 = new JButton("-");
		
		btnFeij�o2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFeij�o2.setBounds(202, 53, 43, 40);
		contentPane.add(btnFeij�o2);
		
		JButton btnMacarr�o1 = new JButton("+");
		
			
		btnMacarr�o1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMacarr�o1.setBounds(280, 52, 43, 40);
		contentPane.add(btnMacarr�o1);
		
		JButton btnMacarr�o2 = new JButton("-");
		
		btnMacarr�o2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMacarr�o2.setBounds(339, 51, 43, 40);
		contentPane.add(btnMacarr�o2);
		
		JButton btnBatata1 = new JButton("+");
		
		btnBatata1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBatata1.setBounds(449, 52, 43, 40);
		contentPane.add(btnBatata1);
		
		JButton batata2 = new JButton("-");
		
		batata2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		batata2.setBounds(506, 51, 43, 40);
		contentPane.add(batata2);
		
		JButton cenoura1 = new JButton("+");
		
		cenoura1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cenoura1.setBounds(16, 160, 43, 40);
		contentPane.add(cenoura1);
		
		JButton btnCenoura2 = new JButton("-");
		
		btnCenoura2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCenoura2.setBounds(74, 160, 43, 40);
		contentPane.add(btnCenoura2);
		
		JButton btnMaca1 = new JButton("+");
		
		btnMaca1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMaca1.setBounds(172, 160, 43, 40);
		contentPane.add(btnMaca1);
		
		JButton btnMaca2 = new JButton("-");
		
		btnMaca2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMaca2.setBounds(221, 160, 43, 40);
		contentPane.add(btnMaca2);
		
		JButton btnQueijo1 = new JButton("+");
		
		btnQueijo1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnQueijo1.setBounds(303, 157, 43, 40);
		contentPane.add(btnQueijo1);
		
		JButton btnQueijo2 = new JButton("-");
		
		btnQueijo2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnQueijo2.setBounds(356, 157, 43, 40);
		contentPane.add(btnQueijo2);
		
		JButton btnPresunto1 = new JButton("+");
		
		btnPresunto1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPresunto1.setBounds(441, 157, 43, 40);
		contentPane.add(btnPresunto1);
		
		JButton btnPresunto2 = new JButton("-");
		
		btnPresunto2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPresunto2.setBounds(499, 158, 43, 40);
		contentPane.add(btnPresunto2);
		
		JButton bntExibir = new JButton("Exibir lista de compras");
		
		bntExibir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bntExibir.setBounds(581, 41, 147, 23);
		contentPane.add(bntExibir);
	
	//Instanciar objeto da classe Acao
		Acao a = new Acao();
		Produtos b = new Produtos();
	
		//Arroz +
	
		btnArroz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.arroz(true);
				Qtd.setText(String.valueOf(a.somar()));
				b.setArroz(true);
				
			}
		});
		
		btnArroz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				b.setArroz(false);

				a.arroz(false);
				
				Qtd.setText(String.valueOf(a.somar()));
			}
		});
		
		
		
		//Feij�o
		btnFeij�o1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.feijao(true);
				Qtd.setText(String.valueOf(a.somar()));
				b.setFeijao(true);
				
			}
		});
		
		btnFeij�o2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setFeijao(false);
				
			a.feijao(false);
			
			}
		});
		
		
		
		//Macarrao
		btnMacarr�o1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		b.setMacarrao(true);
		a.feijao(true);
		Qtd.setText(String.valueOf(a.somar()));
	
		}
	});
		
		btnMacarr�o2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.feijao(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setMacarrao(false);
			
			
			
			}
		});
		
		
		
		//Batata
		btnBatata1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.batata(true);
				Qtd.setText(String.valueOf(a.somar()));
				b.setBatata(true);
				
			}
		});
		
		batata2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.batata(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setBatata(true);
			

			
			}
		});
		
		
		
		//Cenoura
		cenoura1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.cenoura(true);
			Qtd.setText(String.valueOf(a.somar()));
			b.setCenoura(true);
			
			}
		});
		
		
		btnCenoura2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.cenoura(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setCenoura(false);
			
			
			}
		});
		
		
		
		//Maca
		btnMaca1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.maca(true);
			Qtd.setText(String.valueOf(a.somar()));
			b.setMaca(true);
			
			}
		});
		
		btnMaca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.maca(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setMaca(false);
			
			}
		});
		
		
		
		//Queijo
		btnQueijo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			a.queijo(true);
			Qtd.setText(String.valueOf(a.somar()));
			b.setQueijo(true);
		
			
			}
		});
		
		btnQueijo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.queijo(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setQueijo(false);
			
			}
		});
		
		
		
		//Presunto
		btnPresunto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.presunto(true);
			Qtd.setText(String.valueOf(a.somar()));
			b.setPresunto(true);
			
			}
		});
		
		btnPresunto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a.presunto(false);
			Qtd.setText(String.valueOf(a.somar()));
			b.setPresunto(false);
			
			}
		});
		
		bntExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			FLista frame = new FLista();
			frame.setVisible(true);
			
			}
		});
		
	}
	
}