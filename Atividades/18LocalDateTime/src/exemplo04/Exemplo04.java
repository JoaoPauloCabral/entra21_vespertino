package exemplo04;

import java.time.LocalDateTime;

public class Exemplo04 {

	public static void main(String[] args) {

		//Instanciar objeto contendo a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
		
		//Obtendo a hora, minuto e segundo
		int segundo = tempo.getSecond();
		int minuto = tempo.getMinute();
		int hora = tempo.getHour();
	
		System.out.println(hora+":"+minuto+":"+segundo);
	}

}
