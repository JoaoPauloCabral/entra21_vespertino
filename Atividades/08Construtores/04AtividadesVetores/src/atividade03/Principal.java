package atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] num = new int[5];
			for(int i=0; i<5; i++) {
				num [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero"));
			}
		if (num[0] == 10) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o 1 do vetor");
		}
		if (num[1] == 10) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o 2 do vetor");
		}
		if (num[2] == 10) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o 3 do vetor");
		}
		if (num[3] == 10) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o 4 do vetor");
		}
		if (num[4] == 10) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o 5 do vetor");
		}if ((num[0] != 10) && (num[1] != 10) && (num[2] != 10) && (num[3] != 10) && (num[4] != 10)) {
			JOptionPane.showMessageDialog(null, "N�o foi encontrado nenhum n�mero 10");
		}
	
	/*//Verificar se h� algum n�mero 10 informado
	   boolean existe10 = false;
	 
	//Obter os cinco n�meros 
	  int[] numeros = new int[5];
	  
	  	  
	  	 for(int i=0; i<5; i++) {
	  	 numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1)); 
	  	  if(numeros[i] == 10) {
	   	  	existe10 = true;
		
	}
	 }
	 
	 //Condicional
	
	 
	 if (existe10 == false) {
	 	JOptionPane.showMessageDialog(null, "N�o foi encontrado nenhum n�mero 10"); 
	 
	 
	 }else {
	 	String msg = "O n�mero 10 est� no(s) indice(s): ";
	 	for(int i=0; i<5; i++) {
	 		if(num[i] == 10) {
	 			msg+="\n"+(i+1);
		}
	 }
	 
	 JOptionPane.showMessageDialog(null, msg);
	 */
	
	}

}
