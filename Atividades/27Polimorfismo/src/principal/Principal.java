package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	 public static void main(String[] args) {
		
		 //Poli -> Varias/Muitas
		 //Morphus -> Formas
		 
		 //Objeto
		 Debito d = new Credito();
		 d.tributos(1000);
		 d.msg();
	
		 /*Exemplo de Polimorfismo da classe Java.util
		 List<String> nomes = new ArrayList<String>();
		 List<String> cidades = new LinkedList<String>();*/
	 
	 }
	
}
