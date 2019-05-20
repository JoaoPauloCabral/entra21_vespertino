package principal;

import java.util.ArrayList;

import beans.Jogo;
import formulario.FormularioPrincipal;

public class Principal {
	
	//ArrayList
	public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
	
	//Iniciar o sistema
	
	public static void main(String[] args) {
		
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				
	}

}