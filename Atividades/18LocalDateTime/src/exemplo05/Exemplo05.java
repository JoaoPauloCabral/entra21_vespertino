package exemplo05;

import java.time.LocalDateTime;

public class Exemplo05 {

	public static void main(String[] args) {

		//Instanciar objeto contendo a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
	
		//Obtendo dia mes e ano
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
		
		//Exibir data
		System.out.println(dia+"/"+mes+"/"+ano);
	
	
	}

}
