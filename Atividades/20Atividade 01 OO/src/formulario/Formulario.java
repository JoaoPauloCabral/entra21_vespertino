package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Jogo;
import principal.Principal;
import javax.swing.SwingConstants;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtClassificacao;
	private JTextField txtValor;
	private JTable table;
	
	
	String genero1;
	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	
		//Instanciar um objeto da classe 'Acao'
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
		cbxGenero.addItem("A��o");
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

		JLabel cont = new JLabel("0");
		cont.setBounds(63, 627, 39, 24);
		contentPane.add(cont);
		
		JLabel lblPs = new JLabel("Ps4: ");
		lblPs.setBounds(35, 633, 46, 14);
		contentPane.add(lblPs);
		
		JLabel Xboxlbl = new JLabel("Xbox:");
		Xboxlbl.setBounds(106, 633, 46, 14);
		contentPane.add(Xboxlbl);
		
		JLabel lblPc = new JLabel("Pc:");
		lblPc.setBounds(183, 633, 46, 14);
		contentPane.add(lblPc);
		
		JLabel cont2 = new JLabel("0");
		cont2.setBounds(143, 628, 39, 24);
		contentPane.add(cont2);
		
		JLabel cont3 = new JLabel("0");
		cont3.setBounds(205, 628, 39, 24);
		contentPane.add(cont3);
		
		JLabel Acaoo = new JLabel("Acao:");
		Acaoo.setBounds(35, 679, 46, 14);
		contentPane.add(Acaoo);
		
		JLabel cont4 = new JLabel("0");
		cont4.setBounds(71, 674, 39, 24);
		contentPane.add(cont4);
		
		JLabel cont5 = new JLabel("0");
		cont5.setBounds(147, 674, 39, 24);
		contentPane.add(cont5);
		
		JLabel cont6 = new JLabel("0");
		cont6.setBounds(229, 674, 39, 24);
		contentPane.add(cont6);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				//Criar um objeto da classe jogo
				try {
					//Instanciar objeto da classe Jogo
					Jogo b = new Jogo();
					b.setNome(txtNome.getText());
					b.setGenero(cbxGenero.getSelectedItem().toString());
					b.setPlataforma(cbxPlataforma.getSelectedItem().toString());
					b.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
					b.setValor(Double.parseDouble(txtValor.getText()));
					
					String nome = txtNome.getText();
					String plat = cbxPlataforma.getSelectedItem().toString();

					
					if(a.Analisar(nome, plat) == true) {
						a.cadastrar(b);
						table.setModel(a.selecionar());
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
						
						
						//Contaagem das plataformas
						if(cbxPlataforma.getSelectedItem().toString().equals("PS4")) {
							cont.setText(String.valueOf(a.ps4(true)));
						
						}else if(cbxPlataforma.getSelectedItem().toString().equals("XBOX")) {
							cont2.setText(String.valueOf(a.xbox(true)));
						
						}else if(cbxPlataforma.getSelectedItem().toString().equals("PC")){
							
							cont3.setText(String.valueOf(a.pc(true)));
						}
						
						//Contagem de genero
						if(cbxGenero.getSelectedItem().toString().equals("A��o")) {
							cont4.setText(String.valueOf(a.acao(true)));
						
						}else if(cbxGenero.getSelectedItem().toString().equals("Aventura")) {
							cont5.setText(String.valueOf(a.aven(true)));
						
						}else if (cbxGenero.getSelectedItem().toString().equals("Suspense")){
							cont6.setText(String.valueOf(a.susp(true)));;
						}
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Usuario ja existe");
					}
					
					
					
					//Mensagem
				
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar tente, novamente");
				}
		
				//limpar os campos
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
		txtValor.setBounds(139, 269, 295, 23);
		contentPane.add(txtValor);
		
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(11, 4, 48, 14);
		contentPane.add(lblIndice);
		lblIndice.setVisible(false);
			
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		//Acao do botao excluir
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//obter indice
				int indice = Integer.parseInt(lblIndice.getText());				
				
				
				//Chamar o metodo de exclusao
				a.excluir(indice);
			
				
				
				//Contaagem das plataformas
				if(cbxPlataforma.getSelectedItem().toString().equals("PS4")) {
					cont.setText(String.valueOf(a.ps4(false)));
				
				}else if(cbxPlataforma.getSelectedItem().toString().equals("XBOX")) {
					cont2.setText(String.valueOf(a.xbox(false)));
				
				}else if(cbxPlataforma.getSelectedItem().toString().equals("PC")){
					
					cont3.setText(String.valueOf(a.pc(false)));
				}
				
				//Contagem de genero
				if(cbxGenero.getSelectedItem().toString().equals("A��o")) {
					cont4.setText(String.valueOf(a.acao(false)));;
				
				}else if(cbxGenero.getSelectedItem().toString().equals("Aventura")) {
					cont5.setText(String.valueOf(a.aven(false)));;
				
				}else if (cbxGenero.getSelectedItem().toString().equals("Suspense")){
					cont6.setText(String.valueOf(a.susp(false)));;
				}
				
				
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
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(323, 322, 101, 32);
		contentPane.add(btnExcluir);
		
		
		
		//Acao do botao alterar
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Obter o indice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				String plataforma = table.getValueAt(indice, 2).toString();				
				String genero = table.getValueAt(indice, 1).toString();
				
				
				//Instanciar um objeto da classe jogo
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				
				//Verfificar a existencia de usuarios iguais
				String nome = txtNome.getText();
				String plat = cbxPlataforma.getSelectedItem().toString();
				

				if(a.Analisar(nome, plat) == true) {
					a.alterar(indice, j);
					table.setModel(a.selecionar());
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				
				
					
				if(plataforma.equals("PS4"))	{
					cont.setText(String.valueOf(a.ps4(false)));
				}else if(plataforma.equals("XBOX")) {
					cont2.setText(String.valueOf(a.xbox(false)));
				}else if(plataforma.equals("PC")) {
					cont3.setText(String.valueOf(a.pc(false)));
				}
				
				
				if(cbxPlataforma.getSelectedItem().equals("XBOX"))  {
					cont2.setText(String.valueOf(a.xbox(true)));
				}else if(cbxPlataforma.getSelectedItem().equals("PS4"))  {
					cont.setText(String.valueOf(a.ps4(true)));
				}else if(cbxPlataforma.getSelectedItem().equals("PC"))  {
					cont3.setText(String.valueOf(a.pc(true)));
				}
					
				
				
				//----------------
				
				if(genero.equals("A��o"))	{
					cont4.setText(String.valueOf(a.acao(false)));
				
				}else if(genero.equals("Aventura")) {
					cont5.setText(String.valueOf(a.aven(false)));
				
				}else if(genero.equals("Suspense")) {
					cont6.setText(String.valueOf(a.susp(false)));
				}
				
				
				if(cbxGenero.getSelectedItem().equals("A��o"))  {
					cont4.setText(String.valueOf(a.acao(true)));
				
				}else if(cbxGenero.getSelectedItem().equals("Aventura"))  {
					cont5.setText(String.valueOf(a.aven(true)));
				
				}else if(cbxGenero.getSelectedItem().equals("Suspense"))  {
					cont6.setText(String.valueOf(a.susp(true)));
				}	
				
				
				
				
				
				//------------------------------
				}else {
					JOptionPane.showMessageDialog(null, "Usu�rio j� existe");
				}

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
		
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(183, 322, 101, 32);
		contentPane.add(btnAlterar);
		
		//Faz com que o indice receba um numero ao clicar
				//em alguma linha
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 382, 414, 235);
				contentPane.add(scrollPane);
				
				table = new JTable(a.selecionar());
				scrollPane.setViewportView(table);
				
				JLabel Aventura = new JLabel("Aventura:");
				Aventura.setBounds(90, 679, 62, 14);
				contentPane.add(Aventura);
				
				JLabel Suspense = new JLabel("Suspense:");
				Suspense.setBounds(166, 679, 63, 14);
				contentPane.add(Suspense);
				
				
				
				
				
				
				
				//Adicionar a opcao ao clicar com o mouse
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
						case "A��o":
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
