package exemplo03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exemplo03 {

	public static void main(String[] args) {

	//Instanciar objeto contendo a data e a hora
		LocalDateTime tempo = LocalDateTime.now();
		
		//Extraindo apenas a data
		LocalDate data = tempo.toLocalDate();
		
		//Exibindo a dta
		System.out.println(data);
	
	
	
	}
}