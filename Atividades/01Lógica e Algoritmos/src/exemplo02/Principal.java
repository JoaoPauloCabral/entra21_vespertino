package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//N�meros inteiros
		byte numero1 = 10;    //-128 at� 127
		short numero2 = 33;   //-32.768 at� 32.767
		int numero3 = 50;     //-2.147.483.648 at� 2.147.438.647
		long numero4 = 100;   //-9.223.372.036.854.775.808 at� 9.223.372.036.854.775.808
		
		//n�meros reais
		float numero5 = 7.59f;  //Com at� 7 casas decimais
		double numero6 = 8.33;  //Com at� 15 csas decimais
		
		//L�gico
		boolean acao = true; //True or False
		
		//Letra
		char letra = 'a';   //Obter apenas uma letra
		char ascii = 65;   //Converter c�digo em uma tecla
		
		//Texto
		String texto = "Aprendendo Java na Proway!";
		
		//Concatena��o
		System.out.println("o valor da vari�vel byte � "+numero1);
		System.out.println("o valor da vari�vel short � "+numero2);
		System.out.println("o valor da vari�vel int � "+numero3);
		System.out.println("o valor da vari�vel long � "+numero4);
		System.out.println("o valor da vari�vel float � "+numero5);
		System.out.println("o valor da vari�vel double � "+numero6);
		System.out.println("o valor da vari�vel boolean � "+acao);
		System.out.println("o valor da vari�vel char � "+letra);
		System.out.println("o valor da vari�vel char � "+ascii);
		System.out.println("o valor da vari�vel String � "+texto);
		
		
	}
	
}
