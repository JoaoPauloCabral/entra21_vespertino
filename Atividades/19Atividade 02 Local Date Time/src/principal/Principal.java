package principal;

import java.util.ArrayList;

import beans.Estoque;
import formulario.Formulario;
import imagem.Imagem;

public class Principal {

	//ArrarList
	public static ArrayList<Estoque> vetorEstoque = new ArrayList<Estoque>();
	
	//Iniciar sistema
	public static void main(String[] args) {
		
		Formulario frame = new Formulario();
		frame.setVisible(true);
		
		//Adicionar a imagem ao formulario
		Imagem i = new Imagem();
		frame.add(i.ima());
	}

}
