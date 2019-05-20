package principal;

import java.util.ArrayList;

import beans.Usuarios;
import formulario.Formulario1;

public class Principal {

	public static ArrayList<Usuarios> array = new ArrayList<Usuarios>();
	
	public static void main(String[] args) {

		Formulario1 form = new Formulario1();
		form.setVisible(true);
		
	}

}
