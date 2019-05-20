package atividade12;

import java.util.Scanner;

import atividade11.JV;

public class A12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		JV jogo = new JV();
		String posicao;
		int valido = 0, jogadas=0;
		
		while(true) { //***************************************************
			System.out.println("    Jogo da Velha     ");
			jogo.Mostrar();
			
			do {// Inicia Jogador 1 
				System.out.print("Jogador 1, Informe uma posicao");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada invalida, tente novamente!");
					System.out.print("Jogador 1, Informe uma posicao");
					posicao = ler.next();
					valido = 0;
				
				}
				
				jogo.Jogada(posicao, "X");
				valido = 1;
				
			}while(valido == 0); //Fim jogador 1
				
			jogadas++;
			valido = 0;
			jogo.Mostrar();
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
			

			do {// Inicia Jogador 2 
				System.out.print("Jogador 2, Informe uma posicao");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada invalida, tente novamente!");
					System.out.print("Jogador 2, Informe uma posicao");
					posicao = ler.next();
					valido = 0;
				
				}
				
				jogo.Jogada(posicao, "O");
				valido = 1;
				
			}while(valido == 0); //Fim jogador 2
			jogadas++;
			jogo.Mostrar();
			valido = 0;
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
		
		
		}//******************************************************************
		
		System.out.println("O " +jogo.Ganhou(jogadas)+" venceu!");
	}

}
