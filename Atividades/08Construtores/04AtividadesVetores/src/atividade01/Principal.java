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
			num1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i+1)+"� n�mero"));
		}
	
		for(int i2=0; i2<10; i2++) {
			num2 [i2] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(i2+11)+"� n�mero"));
		}
	
		Object[] ope = {"Adi��o", "Subtra��o", "Multiplica��o", "Divis�o"};
			ope1 = JOptionPane.showOptionDialog(null, "Escolha uma opera��o", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, ope, 0);
	
	switch(ope1) {
	
	case 0:
	do {
		resultado = num1[i3] + num2[i3];
		total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Adi��o = " +resultado;
		i3++;
	}while(i3 < 10);
	break;
	
	case 1:
		do {
			resultado = num1[i3] - num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Subtra��o = " +resultado;
			i3++;
		}while(i3 < 10);
	break;
	case 2:
		do {
			resultado = num1[i3] * num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Multiplica��o = "+resultado;
			i3++;
		}while(i3 < 10);	
	break;
	case 3:
		do {
			resultado = num1[i3] / num2[i3];
			total+= "\n "+num1[i3]+ " || " +num2[i3]+ " || Divis�o = " +resultado;
			i3++;
		}while(i3 < 10);
	break;
	}
		
	JOptionPane.showMessageDialog(null, total);
	
	
	
	}

}
