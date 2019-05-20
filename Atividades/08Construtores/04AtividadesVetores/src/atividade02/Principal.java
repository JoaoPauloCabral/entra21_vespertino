package atividade02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] num1 = new int[10];
		int[] num2 = new int[10];
		String total = "";
		
		for(int i=0; i<10; i++) {
			num1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+"º número"));
		
			
		}for(int i=0, i2=9; i < 10; i++, i2--) {
			total+= num2 [i] = num1 [i2];
			total+="\n";
		}
	JOptionPane.showMessageDialog(null, total);
	
	
		
		
		
	}

}
