package pacote;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Objetos - Jogadores
		Jogador j1 = new Jogador();
		j1.setNome("Alice");
		j1.setAcertos(5);
		
		Jogador j2 = new Jogador();
		j2.setNome("Jean");
		j2.setAcertos(8);
		
		Jogador j3 = new Jogador();
		j3.setNome("Vanessa");
		j3.setAcertos(7);
		
		Jogador j4 = new Jogador();
		j4.setNome("Liliane");
		j4.setAcertos(10);
		
		//ArrayList
		ArrayList<Jogador> dados = new ArrayList<Jogador>();
		
		//Adicionar jogadores
		dados.add(j1);
		dados.add(j2);
		dados.add(j3);
		dados.add(j4);
		
		//Método da bolha
		for(int i1 = 0; i1 < dados.size()-1; i1++) {
			
			for(int i2 = i1+1; i2 < dados.size(); i2++) {
				
				if(dados.get(i2).getAcertos() > dados.get(i1).getAcertos()) {
					
					Jogador jogMenor = new Jogador();
					jogMenor.setNome(dados.get(i1).getNome());
					jogMenor.setAcertos(dados.get(i1).getAcertos());
					
					Jogador jogMaior = new Jogador();
					jogMaior.setNome(dados.get(i2).getNome());
					jogMaior.setAcertos(dados.get(i2).getAcertos());

					dados.set(i2, jogMenor);
					dados.set(i1, jogMaior);
					
					
					
				}
				
			}
			
		}
		
		//Laço
		for(int i=0; i<dados.size(); i++) {
			System.out.println(dados.get(i).getNome()+" "+dados.get(i).getAcertos());
		}
		
		
	}
	
}





