package atividade02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nomevelho = "c";
		String nomealto = "b";
		String nome;
		String nomepes = "a";
		double maipeso=0;
		int idade, contador=0;
		int maisvelho = 0;
		double peso, altura, somaAlturas=0; 
		double maisalto = 0;
		
		do {
			
			nome = JOptionPane.showInputDialog("Informe o nome");
			
			if(!nome.equals("sair")) {
			
				contador++;
				
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
				peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
				somaAlturas+=altura;
				
			
				if (peso > maipeso) {
				maipeso = peso;
				nomepes = nome;		
			}
				
			if	(altura > maisalto) {
				maisalto = altura;
				nomealto = nome;
			}
			
			if	(idade > maisvelho) {
				maisvelho = idade;
				nomevelho = nome;
			}
			
					}		
			
		}while(!nome.equals("sair"));
		
		double media = somaAlturas/contador;
		
		JOptionPane.showMessageDialog(null, "O número de jogadores cadastrados são: "+contador);
		
		JOptionPane.showMessageDialog(null, "O jogador mais alto é: "+nomealto+ " com "+maisalto+ " metros de altura");
		
		JOptionPane.showMessageDialog(null, "O jogador mais velho é: "+nomevelho+ " com "+maisvelho+ " anos de idade");
		
		JOptionPane.showMessageDialog(null, "O jogador mais pesado é: "+nomepes+ " com "+maipeso+ " Kg");
		
		JOptionPane.showMessageDialog(null, "A média de alturas é: "+media);
		
		
		
		
		
	}

}
