package exemplo01;

public class Pessoa {

	//M�todo Construtor
	Pessoa() {
		System.out.println("Construtor ok!");
	}
	
	//M�todo Construtor
		Pessoa(String nome) {
			System.out.println(nome);
		}
		
		//M�todo Construtor
		Pessoa(String nome, int idade, double preco) {
			System.out.println(nome+" "+idade+" "+preco);
		}
	/*Voce passa os valores que vc quer dentro do construtor ex: int, double, etc.
	 
	 Depois a mensagem que sera exibida com esses valores;
	 
	 E por fim voce instancia eles na classe principal trocando as variaveis por numeros ou palavras;
	 
	 */
}
