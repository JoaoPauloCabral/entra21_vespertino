package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] num1 = new int[10];
		int[] num2 = new int[20];
		int ope1;
		double resultado;
		int i3 = 0;
		String total = "";
		
		for(int i=0; i<10; i++) {
			num1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+"º número"));
		}
	
		for(int i2=0; i2<10; i2++) {
			num2 [i2] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i2+11)+"º número"));
		}
	
		Object[] ope = {"Adição", "Subtração", "Multiplicação", "Divisão"};
			ope1 = JOptionPane.showOptionDialog(null, "Escolha uma operação", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, ope, 0);
	
	switch(ope1) {
	
	case 0:
	do {
		resultado = num1[i3] + num2[i3];
		total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Adição = " +resultado;
		i3++;
	}while(i3 < 10);
	break;
	
	case 1:
		do {
			resultado = num1[i3] - num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Subtração = " +resultado;
			i3++;
		}while(i3 < 10);
	break;
	case 2:
		do {
			resultado = num1[i3] * num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Multiplicação = "+resultado;
			i3++;
		}while(i3 < 10);	
	break;
	case 3:
		do {
			resultado = num1[i3] / num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Divisão = " +resultado;
			i3++;
		}while(i3 < 10);
	break;
	}
		
	JOptionPane.showMessageDialog(null, total);
	
	
	
	}

}
