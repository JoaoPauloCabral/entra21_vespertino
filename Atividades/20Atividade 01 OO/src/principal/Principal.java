package principal;

import java.util.ArrayList;

import beans.Jogo;
import formulario.Formulario;

public class Principal {

	//ArrayList
	public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
	
	public static void main(String[] args) {

		Formulario frame = new Formulario();
		frame.setVisible(true);
		
	}

}
