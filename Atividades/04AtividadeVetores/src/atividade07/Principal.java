package atividade07;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Random gerar = new Random();
		int[] num = new int [5];
		
		num [0] = gerar.nextInt(10);
		
		do {
			num[1] = gerar.nextInt(10);
		}while (num[1] == num[0]);
	
		do {
			num[2] = gerar.nextInt(10);
		}while ((num[2] == num[0]) || (num[2] == num[1]));
	
		do {
			num[3] = gerar.nextInt(10);
		}while ((num[3] == num[0]) || (num[3] == num[1]) || (num[3] == num[2]));
	
		do {
			num[4] = gerar.nextInt(10);
		}while ((num[4] == num[3]) || (num[4] == num[0]) || (num[4] == num[1]) || (num[4] == num[2]));
	
 	JOptionPane.showMessageDialog(null, num[0]+ " " +num[1]+ " " +num[2]+ " " +num[3]+ " " +num[4]);
		
	}

}
