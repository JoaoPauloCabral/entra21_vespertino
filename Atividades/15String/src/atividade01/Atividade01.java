package atividade01;

import javax.swing.JOptionPane;

public class Atividade01 {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Informe uma palavra ou frase");
		String res ="";
		
		for(int i = 0; i < palavra.length(); i++) {
			
			if(i % 2 == 0) {
				String b = ""+palavra.charAt(i);
				res+= b.toUpperCase();
			}else {
				String c = ""+palavra.charAt(i);
				res+= c.toLowerCase();
			}
		}
		
		JOptionPane.showMessageDialog(null, res);
	}

}
