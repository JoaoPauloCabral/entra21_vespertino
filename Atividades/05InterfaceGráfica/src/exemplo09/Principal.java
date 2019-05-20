package exemplo09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Meu Setimo formulário"); 					//Definir titulo
		formulario.setSize(500, 300);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setLayout(null);											//Fazer com que os botao nao sobreponha outra coisa
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// DefaultTableModel (Englobar os dados)
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addRow(new Object[] {"Yara", "26"});
		dados.addRow(new Object[] {"Tayler", "18"});
		dados.addRow(new Object[] {"Vanessa", "22"});
		dados.addRow(new Object[] {"Roan", "14"});
		
		// JTable (Exibir os dados)
		JTable tabela = new JTable(dados);
		
		// JScrollPane (Barra de Rolagem)
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 465, 230);
		
		//Adicionar ao Formulario
		formulario.add(barraRolagem);
		
		//Exibir componentes
				formulario.setVisible(true);
	
	
	
	
	}

}
