package atividade02;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Atividade02 {

	public static void main(String[] args) {

		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> valor = new ArrayList<String>();
		ArrayList<String> qtd = new ArrayList<String>();
		ArrayList<String> hora = new ArrayList<String>();
		ArrayList<String> data = new ArrayList<String>();
		
		
		String sair, sair1 ="";
		int continuar;
		
		
		do {
		String nome1 = JOptionPane.showInputDialog("Informe o nome do produto");
		nome.add(nome1);
		
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		valor.add("R$"+valor1);
		
		int qtdq = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque do produto " +nome1));
		qtd.add(""+qtdq);		
		
		
		LocalDateTime tempo = LocalDateTime.now();
		
		
		int hora1 = tempo.getHour();
		int hora2 = tempo.getMinute();	
		
		hora.add(hora1+":"+hora2);
		
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
			
		data.add(dia+"/"+mes+"/"+ano);
		
		
		
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais produtos?");
		}while (continuar == 0);
		
		
		for(int linha=0; linha<nome.size(); linha++) {
			sair="\n";
			
			sair+=nome.get(linha)+"    "+valor.get(linha)+"    "+qtd.get(linha)+"    "+data.get(linha)+"   "+hora.get(linha);
		
		sair1+=sair;
		}

		JOptionPane.showMessageDialog(null, sair1);
		
	}

}
