package split;

public class Split {

	public static void main(String[] args) {

		//Criando uma variavel do tipo String e atribuido valores separados por v�rgula
		String linguagens = "Java, C#, PHP, Delphi, VBA, Python";
		
		//Separando ad linguagens contidas na variavel acima e adicionando em uma posi��o do array
		String vetor[] = linguagens.split(", ");
		
		//Exibindo as linguagens separadamente em suas devidas posi��es
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
		System.out.println(vetor[5]);


		
	}

}
