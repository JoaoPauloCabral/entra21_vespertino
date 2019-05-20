package exemplo02;

import javax.swing.JOptionPane;

public class Carro {

	//Atributos
	private String modelo, fabricante;
	private int ano;
	
	//Construtor
	public Carro(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		
		exibirDados();
	}
	
	//Exibir dados
	private void exibirDados() {
		JOptionPane.showMessageDialog(null, modelo);
		JOptionPane.showMessageDialog(null, fabricante);
		JOptionPane.showMessageDialog(null, ano);
		
	}
}
