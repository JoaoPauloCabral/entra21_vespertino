package atividade04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	String [] gaba = new String[10];	
	String nome;
	String [] respostas = new String[10];
	String [] nomes = new String[10];
	String sair = "";
	int[] erro = new int[10];
	int[] acertos = new int[10];
	int indice = 0;
	
	for(byte i=0; i<10; i++) {
		do {
		gaba [i] = JOptionPane.showInputDialog("Informe a resposta da "+(i+1)+ "ª questão");
		}while (((!gaba[i].equals ("A")) && (!gaba[i].equals ("B")) && (!gaba[i].equals ("C")) && (!gaba[i].equals("D"))));
		}
	
	
	//Laço
	
	nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");	
	
	while(!nome.equals("SAIR")) {
		
		//Atribuir o nome do aluno no vetor
		nomes[indice] = nome;
		
		
		//Respostas do aluno
		for (int i=0; i<10; i++) {
			do {
			respostas[i] = JOptionPane.showInputDialog((i+1)+"ª resposta");
			}while (((!respostas[i].equals ("A")) && (!respostas[i].equals ("B")) && (!respostas[i].equals ("C")) && (!respostas[i].equals("D"))));
			}
	
	 //Contagem
	 for(int i=0; i<10; i++) {
		 if(gaba[i].equals(respostas[i])) {
			 acertos[indice]++;
		 }else {
			 erro[indice]++;
		 }
	 }
	 JOptionPane.showMessageDialog(null, nomes[indice]+" Acertos: "+acertos[indice]+ " Erros: "+erro[indice]);
		//Incrementar o índice
	 	indice++;
		
	 	//Nome
	 	nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
	}
	
	//Exibir dados
	for(int i=0; i<10; i++) {
		if(nomes[i] != null) {
			
			sair+= nomes[i]+" Acertos: "+acertos[i]+ " Erros: "+erro[i];
			sair+="\n";
			
		}
	}
	JOptionPane.showMessageDialog(null, sair);
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
