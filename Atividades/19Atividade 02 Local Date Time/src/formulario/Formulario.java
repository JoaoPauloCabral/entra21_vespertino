package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Estoque;
import imagem.Imagem;
import principal.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtvalor;
	private JTextField txtQtd;
	private JTable table;
	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
	/*	JLabel lblIma = new JLabel("");
		lblIma.setBounds(419, 17, 245, 176);
		contentPane.add(lblIma);
		lblIma.add(i.ima());*/
		
		
		
		
		//Instanciar um objeto da classe Acao
		Acao a = new Acao();
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto");
		lblNomeDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoProduto.setBounds(10, 11, 129, 35);
		contentPane.add(lblNomeDoProduto);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(149, 20, 235, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblValorDoProduto = new JLabel("Valor do Produto");
		lblValorDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorDoProduto.setBounds(10, 57, 129, 35);
		contentPane.add(lblValorDoProduto);
		
		txtvalor = new JTextField();
		txtvalor.setColumns(10);
		txtvalor.setBounds(149, 66, 235, 20);
		contentPane.add(txtvalor);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque");
		lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidadeEmEstoque.setBounds(10, 103, 176, 35);
		contentPane.add(lblQuantidadeEmEstoque);
		
		txtQtd = new JTextField();
		txtQtd.setColumns(10);
		txtQtd.setBounds(196, 112, 188, 20);
		contentPane.add(txtQtd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 215, 667, 185);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
	
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
				//Criar um objeto da classe jogo
				try {
					
					Acao b = new Acao();
					Acao c = new Acao();
					Estoque j = new Estoque();
					j.setNome(txtProduto.getText());
					j.setPreco(Double.parseDouble(txtvalor.getText()));
					j.setQtd(Integer.parseInt(txtQtd.getText()));
					j.setData(b.data());
					j.setHora(c.hora());
					
					//Realizar o cadastro
					a.cadastrar(j);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar tente, novamente");
				}
			
				//Limpar os campos
				txtProduto.setText("");
				txtvalor.setText("");
				txtQtd.setText("");
				
				//Cursor no campo produto
				txtProduto.requestFocus();
				
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(149, 166, 99, 23);
		contentPane.add(btnCadastrar);
		
		
		
	}		
		
}
