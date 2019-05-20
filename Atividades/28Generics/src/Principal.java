
public class Principal {

	/*
	 E: Elemntos da classe(String, Double, Integer, ArrayList) 
	 T: Elementor de tipo(char, int, double, float, short, long)
	 K: Chaves (HashMap) 
	 V: Valor (HashMap)
	  */
	
	//Metodo generico
	public static <E> void listar(E[] vetor) {
		for(E elemento : vetor) {
			System.out.print(elemento+" ");
		}
		System.out.println();
	}
	
	//Metodo principal
	public static void main(String[] args) {

		//Vetores
		String[] nomes = {"Suellen", "Cleiton", "Paloma"};
		Integer[] idades = {22,30,17};
		Double[] alturas = {1.70, 1.77, 1.64};
		
		//Chamar o metodo de listar
		listar(idades);
		listar(alturas);
		listar(nomes);
	}

}