package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import formulario.FormularioPrincipal;
import principal.Principal;

public class Acao {

	//Cadastrar jogo
	public void cadastrar(Jogo j) {
				Principal.vetorJogos.add(j);
	}
	
	//Selecionar jogos
	public DefaultTableModel selecionar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Genero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
				Principal.vetorJogos.get(i).getNome(),
				Principal.vetorJogos.get(i).getGenero(),
				Principal.vetorJogos.get(i).getPlataforma(),
				Principal.vetorJogos.get(i).getClassificacao(),
				Principal.vetorJogos.get(i).getValor()
	
			});
		}
		
	return dadosTabela;
	}
	
	//Excluir jogo
	public void excluir (int indice) {
		
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice, Jogo j) {
		
		Principal.vetorJogos.set(indice, j);
		
	}
	//Estatisticas
	//Atributo
    private static int ps4 = 0;
	
	//Construtor
	public Acao() {
		ps4++;
		System.out.println(ps4);
	}
		
		
	
	
	
}
