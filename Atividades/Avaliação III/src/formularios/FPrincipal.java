package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



import acao.Acao;
import beans.Beans;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class FPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtBruto;
	private JTextField txtTransporte;
	private JTextField txtImposto;
	private JTable table;

	public FPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar objeto da classe a��o
		Acao a = new Acao();
		
		//Criar os botoes-------------------------------------------
		JButton btnEstatisticas = new JButton("Estat\u00EDsticas");	
		btnEstatisticas.setEnabled(false);
		txtNome = new JTextField();
		JCheckBox chkTransporte = new JCheckBox("");	
		JSpinner spnFaltas = new JSpinner();		
		JPanel panel = new JPanel();
		JButton btnCadastrar = new JButton("Cadastrar Colaborador");
		JComboBox cbxCargo = new JComboBox();	
		JCheckBox chkClube = new JCheckBox("Clube Fidelidadade");
		JCheckBox chkSaude = new JCheckBox("Plano de Sa\u00FAde");
		JTextField txtLiquido = new JTextField();
		txtLiquido.setText("0");
		JScrollPane scrollPane = new JScrollPane();
		txtBruto = new JTextField();
		txtBruto.setText("0");
		txtTransporte = new JTextField();
		txtTransporte.setText("0");
		txtImposto = new JTextField();
		txtImposto.setText("0");
		//-------------------------------------------------------------
		
		table = new JTable(a.atualizar());
		scrollPane.setViewportView(table);
		
		
		//Inicio----------------
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 651, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 11, 92, 25);
		panel.add(lblColaborador);
		
		
		txtNome.setBounds(103, 12, 227, 23);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSalrioBruto = new JLabel("Sal\u00E1rio Bruto");
		lblSalrioBruto.setBounds(10, 58, 92, 25);
		panel.add(lblSalrioBruto);
		
		
		txtBruto.setEnabled(false);
		txtBruto.setColumns(10);
		txtBruto.setBounds(103, 59, 227, 23);
		panel.add(txtBruto);
		
		JLabel lblValeTransporte = new JLabel("Vale Transporte");
		lblValeTransporte.setBounds(10, 103, 92, 25);
		panel.add(lblValeTransporte);
			
		chkTransporte.setBounds(100, 104, 21, 23);
		panel.add(chkTransporte);
		
		txtTransporte.setEnabled(false);
		txtTransporte.setBounds(130, 103, 200, 23);
		panel.add(txtTransporte);
		txtTransporte.setColumns(10);
		
		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMs.setBounds(10, 151, 92, 25);
		panel.add(lblFaltasNoMs);
		
		spnFaltas.setModel(new SpinnerNumberModel(0, 0, 31, 1));
		spnFaltas.setBackground(Color.WHITE);
		spnFaltas.setBounds(103, 153, 49, 20);
		panel.add(spnFaltas);
		

		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(10, 203, 166, 49);
		panel.add(btnCadastrar);
		
		
		btnEstatisticas.setBackground(Color.WHITE);
		btnEstatisticas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEstatisticas.setBounds(196, 203, 166, 49);
		panel.add(btnEstatisticas);
		
		
		cbxCargo.addItem("Estagi�rio");
		cbxCargo.addItem("Desenvolvedor Jr");
		cbxCargo.addItem("Desenvolvedor Pleno");
		cbxCargo.addItem("Desenvolvedor S�nior");
		cbxCargo.addItem("Analista de Sistemas Jr");
		cbxCargo.addItem("Analista de Sistemas Pleno");
		cbxCargo.addItem("Analista de Sistemas S�nior");
		cbxCargo.addItem("Arquiteto de Software");
		cbxCargo.setBackground(Color.WHITE);
		cbxCargo.setBounds(412, 11, 229, 25);
		panel.add(cbxCargo);
		
		
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(367, 16, 35, 14);
		panel.add(lblCargo);

		
		chkClube.setBounds(367, 59, 133, 23);
		panel.add(chkClube);
		
		
		chkSaude.setBounds(521, 59, 120, 23);
		panel.add(chkSaude);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
		lblImpostoDeRenda.setBounds(367, 103, 104, 25);
		panel.add(lblImpostoDeRenda);
		
		
		txtImposto.setEnabled(false);
		txtImposto.setBounds(486, 105, 155, 23);
		panel.add(txtImposto);
		txtImposto.setColumns(10);
		
		JLabel lblSalrioLiqudo = new JLabel("Sal\u00E1rio Liqu\u00EDdo");
		lblSalrioLiqudo.setBounds(367, 139, 92, 25);
		panel.add(lblSalrioLiqudo);
		
		
		txtLiquido.setEnabled(false);
		txtLiquido.setColumns(10);
		txtLiquido.setBounds(486, 141, 155, 23);
		panel.add(txtLiquido);
		
		scrollPane.setBounds(10, 312, 651, 229);
		contentPane.add(scrollPane);
		
		
		//-----------------------------------------------------------------------------------------------------------------------
		//Acoes
		
		
		//Pega o salario bruto
		cbxCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtBruto.setText(String.valueOf(a.salario(cbxCargo.getSelectedIndex())));
			txtImposto.setText(String.valueOf(a.imposto(cbxCargo.getSelectedIndex())));
			
			int j = Integer.valueOf(String.valueOf(spnFaltas.getValue()));
			txtLiquido.setText(String.valueOf(a.liquido(cbxCargo.getSelectedIndex(), chkClube.isSelected(), chkSaude.isSelected(), j, chkTransporte.isSelected())));
			}
		});
		
		if(chkClube.isSelected()) {
			
		}
		
		
		
		//Pega o vale transporte
		chkTransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int h = Integer.valueOf(String.valueOf(spnFaltas.getValue()));
				txtLiquido.setText(String.valueOf(a.liquido(cbxCargo.getSelectedIndex(), chkClube.isSelected(), chkSaude.isSelected(), h, chkTransporte.isSelected())));
				
				
					double j = a.salario(cbxCargo.getSelectedIndex());
					
					
					if(chkTransporte.isSelected() == true)  {
					txtTransporte.setText(String.valueOf(a.vale(j)));
				}else {
				txtTransporte.setText("0");
				}
				
			}
			});
		
		
		
		//Atualizar Clube
		chkClube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int h = Integer.valueOf(String.valueOf(spnFaltas.getValue()));
				txtLiquido.setText(String.valueOf(a.liquido(cbxCargo.getSelectedIndex(), chkClube.isSelected(), chkSaude.isSelected(), h, chkTransporte.isSelected())));
			
			}
		});
		
		//Atualizar Saude
		chkSaude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int h = Integer.valueOf(String.valueOf(spnFaltas.getValue()));
				txtLiquido.setText(String.valueOf(a.liquido(cbxCargo.getSelectedIndex(), chkClube.isSelected(), chkSaude.isSelected(), h, chkTransporte.isSelected())));
			}
		});
		
		
		
		//Atualizar Faltas
		spnFaltas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
			
				int h = Integer.valueOf(String.valueOf(spnFaltas.getValue()));
				txtLiquido.setText(String.valueOf(a.liquido(cbxCargo.getSelectedIndex(), chkClube.isSelected(), chkSaude.isSelected(), h, chkTransporte.isSelected())));
			}
		});
		
		
		
		//Cadastra a pessoa
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Beans c = new Beans();
				
				//Pega as informa��es
				if(txtNome.getText().equals("") || (txtBruto.getText().equals("0"))){
					JOptionPane.showMessageDialog(null, "Espa�o 'Colaborador' est� em branco ou n�o foi selecionado um cargo");
				}else{
					try {
					c.setNome(txtNome.getText());
					c.setCargo(cbxCargo.getSelectedItem().toString());
					c.setFaltas(Integer.valueOf(String.valueOf(spnFaltas.getValue())));
					c.setImpostoRenda(Double.parseDouble(txtImposto.getText()));
					c.setSalarioBruto(Double.parseDouble(txtBruto.getText()));
					c.setValeTransporte(Double.parseDouble(txtTransporte.getText()));
					c.setPs(chkSaude.isSelected());
					c.setCf(chkClube.isSelected());
					c.setSalarioLiquido(Double.parseDouble(txtLiquido.getText()));
					a.cadastrar(c);
					btnEstatisticas.setEnabled(true);
					table.setModel(a.atualizar());
					}catch(Exception erro){
						JOptionPane.showMessageDialog(null, "Dados invalidos");
					}
					}
				
				//Limpar os espa�os em branco
				txtNome.setText("");
				cbxCargo.setSelectedIndex(0);
				spnFaltas.setValue(0);
				txtLiquido.setText("0");
				txtTransporte.setText("0");
				txtBruto.setText("0");
				chkClube.setSelected(false);
				chkSaude.setSelected(false);
				chkTransporte.setSelected(false);
				txtImposto.setText("0");
			
				//Fazer com que o ponteiro volte ao 'Nome'
				txtNome.requestFocus();
				
				
			}
		});
		
		
		
		//Exibir estatisticas
		btnEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Estatistica frame2 = new Estatistica();
			frame2.setVisible(true);
			}
		});
		
	}
}
