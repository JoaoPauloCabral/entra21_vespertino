package exemplo10;

public class Principal {

	public static void main(String[] args) {

		/*
		  Operadores L�gicos
		  && = E
		  || = OU
		   | = N�o
		 */
		
		String segmento = "eletronico";
		double valor = 100;
		
		if((segmento.equals("eletronico")) && (valor > 100)) {
			System.out.println("Desconto de 10% - R$ "+valor*0.9);
		}else {
			System.out.println("Sem desconto - R$ "+valor);
		}
		
		
		
		
	}

}
