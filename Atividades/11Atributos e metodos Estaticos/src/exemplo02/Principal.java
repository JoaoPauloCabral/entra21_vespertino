package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe calculadora
		Calculadora a = new Calculadora();
		
		//a.gera() == adiciona o objeto e a seu metodo
		Calculadora.somar(a.gera(),"Esse é seu numero");
		
	}

}
