package atividade07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int erros = 0;
		String letra;
		boolean e=false, s=false, t=false, u=false, d=false, a=false, r=false;
		boolean passou = false;
		
		
		
		JOptionPane.showMessageDialog(null, "Escolha as letras certas para ganhar. "
					+	"\n\nMais de 5 erros o jogo será finalizado");
		
		do {
			
		letra =	JOptionPane.showInputDialog("Escolha uma letra");
			
		
		if (letra.equals("E")) {
			e = true;
			JOptionPane.showMessageDialog(null, "'E - - - - - -'");
				
			
		}else if	(letra.equals("S")) {
			s = true;
			JOptionPane.showMessageDialog(null, "'- S - - - - -'");
			
		}else if	(letra.equals("T")) {
			t = true;
			JOptionPane.showMessageDialog(null, "'- - T - - - -'");
			
		}else if	(letra.equals("U")) {	
			u = true;
			JOptionPane.showMessageDialog(null, "'- - - U - - -'");
			
		}else if	(letra.equals("D")) {	
			d = true;
			JOptionPane.showMessageDialog(null, "'- - - - D - -'");
			
		}else if	(letra.equals("A")) {
			a = true;
			JOptionPane.showMessageDialog(null, "'- - - - - A -'");
			
		}else if	(letra.equals("R")) {
			r = true;
			JOptionPane.showMessageDialog(null, "'- - - - - - R'");
			
		
		
		
		
		
		
		}else {
			erros++;
		
			
		
		}if ((e == true) && (s == true) && (t == true) && (u == true) && (d == true) && (a == true) && (r == true)) {
			passou = true;
		
		}	
			
			
		}while((erros < 5) && (passou == false));
		 
		
		
		if (erros >= 5) {
			JOptionPane.showMessageDialog(null, "Você perdeu");
		
		}else if (passou == true) { 
			 JOptionPane.showMessageDialog(null, "Você ganhou");
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
