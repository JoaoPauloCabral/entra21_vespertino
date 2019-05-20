package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabExpander;

import acao.Acao;
import beans.Jogo;
import principal.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	public JTextField txtNome;
	private JTextField txtClassificacao;
	private JTextField txtValor;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar um objeto da classe Acao
		Acao a = new Acao();
		
		
		
		JLabel lblNomeDoJogo = new JLabel("Nome do Jogo");
		lblNomeDoJogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomeDoJogo.setBounds(10, 21, 126, 32);
		contentPane.add(lblNomeDoJogo);
		
		JLabel lblGenro = new JLabel("Gen\u00EAro");
		lblGenro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGenro.setBounds(10, 77, 126, 32);
		contentPane.add(lblGenro);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlataforma.setBounds(10, 138, 126, 32);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClassificao.setBounds(10, 203, 126, 32);
		contentPane.add(lblClassificao);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValor.setBounds(10, 264, 126, 32);
		contentPane.add(lblValor);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.addItem("Ação");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		cbxGenero.setBounds(129, 85, 295, 24);
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.addItem("PS4");
		cbxPlataforma.addItem("XBOX");
		cbxPlataforma.addItem("PC");
		cbxPlataforma.setBounds(129, 146, 295, 24);
		contentPane.add(cbxPlataforma);
		
		int ps4=0, xbox=0, pc =0;
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Criar um objeto da classe jogo
				try {
					Jogo j = new Jogo();
					j.setNome(txtNome.getText());
					j.setGenero(cbxGenero.getSelectedItem().toString());
					j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
					j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
					j.setValor(Double.parseDouble(txtValor.getText()));
				
					if(cbxGenero.getSelectedIndex() == 0) {
					ps4++;
						
					}
					
					//Realizar o cadastro
					a.cadastrar(j);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
					//Mensagem
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar tente, novamente");
				}
						
				//Limpar os campos
				txtNome.setText("");
				cbxGenero.setSelectedItem(0);
				cbxPlataforma.setSelectedItem(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				//Cursor no campo nome jogo
				txtNome.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(35, 322, 101, 32);
		contentPane.add(btnCadastrar);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNome.setBounds(129, 30, 295, 23);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(129, 212, 295, 23);
		contentPane.add(txtClassificacao);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtValor.setColumns(10);
		txtValor.setBounds(129, 273, 295, 23);
		contentPane.add(txtValor);
		
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(11, 4, 48, 14);
		contentPane.add(lblIndice);
		lblIndice.setVisible(false);
		
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//obter indice
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Chamar o metodo de exclusao
				a.excluir(indice);
			
				//Atualizar tabela
				table.setModel(a.selecionar());
			
				//Limpar campos
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				lblIndice.setText("");
				
				//Cursor no campo nome
				txtNome.requestFocus();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Jogo excluido com sucesso");
				
				//Ativar botoes de alterar e excluir e desativar o botao cadastrar
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(323, 322, 101, 32);
		contentPane.add(btnExcluir);
		
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Obter o indice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Instanciar um objeto da classe jogo
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				//Realizar a alteração
				a.alterar(indice, j);
				
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				//Limpar os campos
				txtNome.setText("");
				cbxGenero.setSelectedItem(0);
				cbxPlataforma.setSelectedItem(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				//Ativar botao cadastrar e desabilitar os demais
				btnCadastrar.setEnabled(true);
				btnExcluir.setEnabled(false);
				btnAlterar.setEnabled(false);
				
				//Cursor no campo nome jogo
				txtNome.requestFocus();
				
				//Mensagem 
				JOptionPane.showMessageDialog(null, "Jogo alterado com sucesso");
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(183, 322, 101, 32);
		contentPane.add(btnAlterar);
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 382, 414, 235);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter o indice selecionado
				int indice = table.getSelectedRow();
				
				//Obtendo os dados de cada coluna
				String nome = table.getValueAt(indice, 0).toString();
				String genero = table.getValueAt(indice, 1).toString();
				String plataforma = table.getValueAt(indice, 2).toString();
				int classificacao = Integer.parseInt(table.getValueAt(indice, 3).toString());
				double valor = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				//Enviando ao formulario
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtClassificacao.setText(String.valueOf(classificacao));
				txtValor.setText(String.valueOf(valor));
				
				switch(genero) {
				case "Ação":
					cbxGenero.setSelectedIndex(0);
					break;
				case "Aventura":
					cbxGenero.setSelectedIndex(1);
					break;
				case "Suspense":
					cbxGenero.setSelectedIndex(2);
					break;
				}
				
				switch(plataforma) {
									
				case "PS4":
					cbxPlataforma.setSelectedIndex(0);
					break;
					
				case "XBOX":
					cbxPlataforma.setSelectedIndex(1);
					break;
					
				case "PC":
					cbxPlataforma.setSelectedIndex(2);
					break;
				}
				
				//Ativar botoes de alterar e excluir e desativar o botao cadastrar
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
		});
	}
}
