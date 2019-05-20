package pagamento;

public class Credito extends Debito {

	//Metodo de tributos
	public void tributos(double valor) {
		System.out.println(valor*0.04);
	}
	
	//Metodo msg
	public void msg() {
		System.out.println("Sobreposição de classes");
	}
}
