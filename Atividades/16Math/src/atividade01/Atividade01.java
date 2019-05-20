package atividade01;

import javax.swing.JOptionPane;

public class Atividade01 {

	public static void main(String[] args) {

int cal1;	
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		
		Object[] cal = {"Soma","Subtracao","Multiplicacao","Divisao","Seno","Cosseno","Tangente","Log","Raiz Quadrada","Raiz Cubica"};
	
	cal1 = JOptionPane.showOptionDialog(null, "Escolha uma operacao", "Escolha uma operacao", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cal, 0);
	
	
	switch(cal1) {
	
	case 0:
		
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero a ser somado"));
		double res = num1+num2;
		JOptionPane.showMessageDialog(null, "O resultado da soma e: " +res);
	
	break;
	
	case 1:
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero a ser subtraido do " +num1));
		double res2 = num1-num3;
		JOptionPane.showMessageDialog(null, "O resultado da subtracao e: " +res2);
	
	break;
	
	case 2:
		double num4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero a ser multiplicado"));
		double res3 = num1*num4;
		JOptionPane.showMessageDialog(null, "O resultado da multiplicacao e: " +res3);
	
	break;	
	
	case 3:
		double num5 = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero a pelo qual sera dividido o " +num1));
		double res4 = num1/num5;
		JOptionPane.showMessageDialog(null, "O resultado da divisao e: " +res4);
	
		break;
		
	case 4:	
	JOptionPane.showMessageDialog(null, "O seno de " +num1+ " e " +Math.sin(num1)) ;
	
	break;
	
	case 5:	
		JOptionPane.showMessageDialog(null, "O cosseno de " +num1+ " e " +Math.cos(num1)) ;
		
		break;
	case 6:	
		JOptionPane.showMessageDialog(null, "A tangente de " +num1+ " e " +Math.tan(num1)) ;
		
	break;
	
	case 7:	
		JOptionPane.showMessageDialog(null, "O logaritmo simples de " +num1+ " e " +Math.log(num1+1)) ;
		
		break;
		
		case 8:	
			JOptionPane.showMessageDialog(null, "A raiz quadrada de " +num1+ " e " +Math.sqrt(num1)) ;
			
			break;
		case 9:	
			JOptionPane.showMessageDialog(null, "A raiz cubica de " +num1+ " e " +Math.cbrt(num1)) ;
			
		break;
	
	
	
	}
	}

}
