package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import formulario.Formulario;
import principal.Principal;

public class Acao {

	//Cadastrar jogo
	public void cadastrar(Jogo j) {
		Principal.vetorJogos.add(j);
	
	}
	
	public boolean Analisar(String n, String p ) {
		boolean valida = true;
		
		for(int i=0; i < Principal.vetorJogos.size(); i++) {
			
			String nome2 = Principal.vetorJogos.get(i).getNome();
			String plat2 = Principal.vetorJogos.get(i).getPlataforma();
			
			if(n.equals(nome2) && (p.equals(plat2))) {
				valida = false;	
			}
			
			
			
		}
		
		return valida;
	}
	
	//Atualizar tabela jogos
	public DefaultTableModel selecionar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Genero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificacao");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {Principal.vetorJogos.get(i).getNome(),Principal.vetorJogos.get(i).getGenero(),Principal.vetorJogos.get(i).getPlataforma(),Principal.vetorJogos.get(i).getClassificacao(),Principal.vetorJogos.get(i).getValor()});
		}
		return dadosTabela;
	}
	
	
	//Excluir Jogo
	public void excluir (int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice, Jogo j) {
		Principal.vetorJogos.set(indice, j);
	}
	
	//Fazer a contagem
	
	int ps41=0, xbox1=0, pc1=0, aven1=0, susp1=0, acao1=0;
	
	
	public int ps4(boolean j) {
		
		if(j ==  true) {
			ps41++;
		}else if(j == false) {
			ps41--;
		}
		return ps41;
	}
	
	public int xbox(boolean j) {
		if(j ==  true) {
			xbox1++;
		}else if(j == false) {
			xbox1--;
		}
		return xbox1;
	}
	public int pc(boolean j) {
		if(j ==  true) {
			pc1++;
		}else if(j == false) {
			pc1--;
		}
		return pc1;
	}
	public int aven(boolean j) {
		if(j ==  true) {
			aven1++;
		}else if(j == false) {
			aven1--;
		}
		return aven1;
	}
	public int susp(boolean j) {
		if(j ==  true) {
			susp1++;
		}else if(j == false) {
			susp1--;
		}
		return susp1;
	}
	public int acao(boolean j) {
		if(j ==  true) {
			acao1++;
		}else if(j == false) {
			acao1--;
		}
		return acao1;
	}
	
}
