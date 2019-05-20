package atividade01;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.jdi.Value;

import pacote.Jogador;

public class Atividade01 {

	public static void main(String[] args) {

String[][] questoes = new String[15][5];
		
		questoes[0][0] = "Qual a cor da laranja";
		questoes[0][1] = "A)Laranja";
		questoes[0][2] = "B)Amarela";
		questoes[0][3] = "C)Roxa";
		questoes[0][4] = "D)Verde";
		
		questoes[1][0] = "Qual a capital de paris";
		questoes[1][1] = "A)Paris";
		questoes[1][2] = "B)Londres";
		questoes[1][3] = "C)Não existe";
		questoes[1][4] = "D)Grecia";
		
		questoes[2][0] = "Qual a tradução de 'Not at all'?";
		questoes[2][1] = "A)'Obrigado'";
		questoes[2][2] = "B)'Licença'";
		questoes[2][3] = "C)'De nada'";
		questoes[2][4] = "D)'Bom dia'";
		
		questoes[3][0] = "Qual destes não é iluminista?";
		questoes[3][1] = "A)John Locke";
		questoes[3][2] = "B)Voltaire";
		questoes[3][3] = "C)Montesquie";
		questoes[3][4] = "D)Robespierre";
		
		questoes[4][0] = "Quem é o responsável pela Era de Terror na França?";
		questoes[4][1] = "A)John Locke";
		questoes[4][2] = "B)Robespierre";
		questoes[4][3] = "C)Luis Inacil Lula da Silva";
		questoes[4][4] = "D)Montesqui";
		
		questoes[5][0] = "O que significa a sigla 'EUA'";
		questoes[5][1] = "A)Era una vez";
		questoes[5][2] = "B)Estados Unidos da America";//2
		questoes[5][3] = "C)Ele uniu a America";
		questoes[5][4] = "D)Estava usando amarelo";
		
		questoes[6][0] = "A ordem dos ---- nao altera o resultado";
		questoes[6][1] = "A)Fatores";
		questoes[6][2] = "B)Parenteses";
		questoes[6][3] = "C)Colchetes";
		questoes[6][4] = "D)Sinais";
		
		questoes[7][0] = "Qual destes nao e um ser vivo?";
		questoes[7][1] = "A)Monera";
		questoes[7][2] = "B)Fungo";
		questoes[7][3] = "C)Bacteria";
		questoes[7][4] = "D)Virus";
		
		questoes[8][0] = "Na epoca do trovadorismo os poetas eram chamados de:";
		questoes[8][1] = "A)Poetas";
		questoes[8][2] = "B)NADA";
		questoes[8][3] = "C)Trovadores";
		questoes[8][4] = "D)Cruzadores";
	
		questoes[9][0] = "O que significa a sigla 'RGB'";
		questoes[9][1] = "A)Red, Green, Blue";
		questoes[9][2] = "B)Rota Gigante da Bolivia";
		questoes[9][3] = "C)Record Great Bat";
		questoes[9][4] = "D)Recognize Goal Basket";
		
		questoes[10][0] = "Codigos binarios sao representados por:";
		questoes[10][1] = "A)2-4";
		questoes[10][2] = "B)1-2";
		questoes[10][3] = "C)20-40";
		questoes[10][4] = "D)0-1";
		
		questoes[11][0] = "Quanto foi o placar da BrasilxAlemanha na copa do mundo de 2014?";
		questoes[11][1] = "A)7x1 Brasil";
		questoes[11][2] = "B)0x0";
		questoes[11][3] = "C)7x1 Alemanha";
		questoes[11][4] = "D)7x7";
		
		questoes[12][0] = "O significa a sigla 'RPM'?";
		questoes[12][1] = "A)Red, Purple, Marble";
		questoes[12][2] = "B)Rotacoes por minuto";
		questoes[12][3] = "C)Rota Para Marmia";
		questoes[12][4] = "D)Rotacoes por mes";
		
		questoes[13][0] = "Quem foi Jose de Alencar?";
		questoes[13][1] = "A)Poeta do Trovadorismo Brasileiro";
		questoes[13][2] = "B)Poeta do Comunismo Brasileiro";
		questoes[13][3] = "C)Poeta do Romantismo Brasileiro";
		questoes[13][4] = "D)Poeta do Barroco Brasileiro";
		
		questoes[14][0] = "Em que revolucao as palavras 'Liberte, Igualite, Fraternite' foram ditas:";
		questoes[14][1] = "A)Revolucao Francesa";
		questoes[14][2] = "B)Revolucao Americana";
		questoes[14][3] = "C)Revolucao Inglesa";
		questoes[14][4] = "D)Revolucao Agraria";
		
		String sair, sair1="";
		String nome;
		String nomeM;
		int erro = 0;
		int acerto = 0;
		int acertoM = 0;
		int continuar =0;
		int indice = 0;
		String pergunta;
		String resposta;
		
		ArrayList<String> nome1 = new ArrayList<String>();
		ArrayList<String> acerto1 = new ArrayList<String>();
		
		ArrayList<String> nome2 = new ArrayList<String>();
		ArrayList<String> acerto2 = new ArrayList<String>();
		
		nome2.add("NOME");
		acerto2.add("ACERTOS");
		do {
			 
			 nome= JOptionPane.showInputDialog("Informe o nome do jogador");
			 nome1.add(nome);
			
	    Random gerar = new Random();
		
	    //Armazena automaticamente os numeros ao Array
	    ArrayList<String> num = new ArrayList<String>();
		
		//Gerador
		do {
			String base = ""+gerar.nextInt(15);
			if (!num.contains(base)) {
				num.add(base);
			}
			
		}while (num.size() <15);
		
		
		//Faz com q 10 perguntas sejam selecionadas
		for (int i=0; i<10; i++) {
		
			
		do {	
		
		pergunta = questoes[Integer.parseInt(num.get(i))][0];
		resposta = JOptionPane.showInputDialog(pergunta+
										"\n\n"+questoes[Integer.parseInt(num.get(i))][1]+
										"\n" +questoes[Integer.parseInt(num.get(i))][2]+
										"\n" +questoes[Integer.parseInt(num.get(i))][3]+
										"\n" +questoes[Integer.parseInt(num.get(i))][4]);
				
		}while((!resposta.equals("A")) && (!resposta.equals("B")) && (!resposta.equals("C")) && (!resposta.equals("D")));		
		
		//Verifica se a resposata esta certa
		if((pergunta.equals(questoes[0][0])) && (resposta.equals("A")) || (pergunta.equals(questoes[1][0])) && (resposta.equals("C")) || (pergunta.equals(questoes[2][0])) && (resposta.equals("C")) || (pergunta.equals(questoes[3][0])) && (resposta.equals("D")) || (pergunta.equals(questoes[4][0])) && (resposta.equals("B")) || (pergunta.equals(questoes[5][0])) && (resposta.equals("B")) || (pergunta.equals(questoes[6][0])) && (resposta.equals("A")) || (pergunta.equals(questoes[7][0])) && (resposta.equals("D")) || (pergunta.equals(questoes[8][0])) && (resposta.equals("C")) || (pergunta.equals(questoes[9][0])) && (resposta.equals("A")) || (pergunta.equals(questoes[10][0])) && (resposta.equals("D")) || (pergunta.equals(questoes[11][0])) && (resposta.equals("C")) || (pergunta.equals(questoes[12][0])) && (resposta.equals("B")) || (pergunta.equals(questoes[13][0])) && (resposta.equals("C")) || (pergunta.equals(questoes[14][0])) && (resposta.equals("A"))) {
			acerto++;
		}else {
			erro++;
		}
		
	}
		acerto1.add(""+acerto);
			
			JOptionPane.showMessageDialog(null, "O jogador " +nome+ " acertou " +acerto+ " questoes!"
												+"\n\nForam erradas " +erro+ " questoes!");
				
			acerto=0;
			erro=0;
		
			
			
			indice++;
		continuar = JOptionPane.showConfirmDialog(null, "Alguem mais deseja jogar?");
		
		
		}while(continuar == 0);
		
	
		for(int i=0; i<acerto1.size()-1; i++) {	
			for(int i2=i+1; i2<acerto1.size(); i2++) {
				
				if(Integer.parseInt(acerto1.get(i)) > acertoM) {
					acertoM = Integer.parseInt(acerto1.get(i));
					acerto1.set(i, acerto1.get(i2));
					acerto1.set(i2, ""+acertoM);
					
					nomeM = nome1.get(i);
					nome1.set(i, nome1.get(i2));
					nome1.set(i2, nomeM);
					
						
				}
				
			} 
			
		}
	

		
		for(int linha=0; linha<acerto1.size(); linha++) {
			sair="\n";
			
			sair+=nome1.get(linha)+ "      "+acerto1.get(linha);
		
		sair1+=sair;
		}

		JOptionPane.showMessageDialog(null, sair1);
				
		
	}

}
