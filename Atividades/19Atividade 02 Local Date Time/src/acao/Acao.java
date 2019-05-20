package acao;

import java.time.LocalDateTime;

import javax.swing.table.DefaultTableModel;

import beans.Estoque;
import principal.Principal;


public class Acao {

	//Cadastrar produto
	public void cadastrar(Estoque j) {
		Principal.vetorEstoque.add(j);
	}
	
	//Selecionar Produto
		public DefaultTableModel selecionar() {
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Nome do Produto");
			dadosTabela.addColumn("Valor R$");
			dadosTabela.addColumn("Quantidade em estoque");
			dadosTabela.addColumn("Data de cadastro");
			dadosTabela.addColumn("Hora de cadastro");

			for(int i=0; i <Principal.vetorEstoque.size(); i++) {
				dadosTabela.addRow(new Object[] {
						Principal.vetorEstoque.get(i).getNome(),
						Principal.vetorEstoque.get(i).getPreco(),
						Principal.vetorEstoque.get(i).getQtd(),
						Principal.vetorEstoque.get(i).getData(),
						Principal.vetorEstoque.get(i).getHora(),
						
				});
			}
					
			
			return dadosTabela;
		}
	
		public  String data() {
			LocalDateTime tempo = LocalDateTime.now();
			
			int dia = tempo.getDayOfMonth();
			int mes = tempo.getMonthValue();
			int ano = tempo.getYear();
			
			String datcom = dia+"/"+mes+"/"+ano;
			
			return datcom;
		}

		public  String hora() {
			LocalDateTime tempo = LocalDateTime.now();
			
			int hora = tempo.getHour();
			int minuto = tempo.getMinute();
			
			
			String datcom = hora+":"+minuto;
			
			return datcom;
		}

}
