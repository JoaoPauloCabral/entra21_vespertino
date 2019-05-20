package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

	public static void main(String[] args) {

		String pal = JOptionPane.showInputDialog("Insira uma palavra ou frase");
		int vogal = 0;
		
		for(int i = 0; i < pal.length(); i++) {
			
			if((pal.charAt(i) == 'a') || (pal.charAt(i) == 'e') || (pal.charAt(i) == 'i') || (pal.charAt(i) == 'o') || (pal.charAt(i) == 'u')) {
				vogal++;
			}
		
		}
		
		JOptionPane.showMessageDialog(null, vogal);
	}

}
