package atividade09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o menor n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o maior n�mero"));
		int meio = numero1;
		int impar=0, par=0;
		int positivo=0, negativo=0;
		
		if (numero1 >= 0) {
			positivo++;
		}else {
			negativo++;
		}
		
		if (numero1 % 2 == 0) {
			par++;
		}else {
			impar++;
		}

		
		String resultado = ""+numero1;
		do {
			meio++;
			
			if (meio >= 0) {
				positivo++;
			}else {
				negativo++;
			}
			
			if (meio % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
			resultado+= "\n"+meio;
		}while (meio < numero2); 
		
		resultado+= "\n";
		resultado+= "\nTotal de n�meros pares: "+par;
		resultado+= "\nTotal de n�meros �mpares: "+impar;
		resultado+= "\n";
		resultado+= "\nTotal de n�meros positivos (+0): "+positivo;
		resultado+= "\nTotal de n�meros negativos: "+negativo;
		
		JOptionPane.showMessageDialog(null, resultado);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
