package colaborador;

public class Colaborador extends Pessoa {

	//Atributos
	private String cargoColaborador;
	private double salarioColaborador;
	
	//Metodo para exibir dados do colaborador
	public Colaborador(String nomePessoa, String enderecoPessoa, int idadePessoa, String cargoColaborador, double salarioColaborador) {
		super(nomePessoa, enderecoPessoa, idadePessoa);
	
		this.cargoColaborador = cargoColaborador;
		this.salarioColaborador = salarioColaborador;
		
		
		exibirDadosColaborador();
		
	}
	
	//Metodo para exibir dados do colaborador
	public void exibirDadosColaborador() {
		System.out.println();
		System.out.println("Cargo: "+cargoColaborador);
		System.out.println("Salário: "+salarioColaborador);
	}
	
}
