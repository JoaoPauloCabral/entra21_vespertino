package startwith;

public class StartwithEndwith {

	public static void main(String[] args) {

		//Criando uma variavel do tipo String e atribuindo um valor
		String texto = "Aprendendo JAVA no curso Entra21 com Ralf";
		String inicio = "Entendendo";
		String fim = "Ralf";
		
		//Verificando se texto inicia com o termo que conota na variavel inicio
		if(texto.startsWith(inicio)) {
			System.out.println("O texto inicia com o termo: " +inicio);
		}else {
			System.out.println("o texto não inicia com o termo: " +inicio);
		}
		
		//Verificando se texto finaliza com o termo que conota na variavel inicio
		if(texto.endsWith(fim)) {
			System.out.println("O texto finaliza com o termo: " +fim);
		}else {
			System.out.println("o texto não finaliza com o termo: " +fim);
		}
		
		
		
	}

}
