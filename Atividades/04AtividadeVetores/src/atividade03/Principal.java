package atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] num = new int[5];
			for(int i=0; i<5; i++) {
				num [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"º número"));
			}
		if (num[0] == 10) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição 1 do vetor");
		}
		if (num[1] == 10) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição 2 do vetor");
		}
		if (num[2] == 10) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição 3 do vetor");
		}
		if (num[3] == 10) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição 4 do vetor");
		}
		if (num[4] == 10) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição 5 do vetor");
		}if ((num[0] != 10) && (num[1] != 10) && (num[2] != 10) && (num[3] != 10) && (num[4] != 10)) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum número 10");
		}
	
	/*//Verificar se há algum número 10 informado
	   boolean existe10 = false;
	 
	//Obter os cinco números 
	  int[] numeros = new int[5];
	  
	  	  
	  	 for(int i=0; i<5; i++) {
	  	 numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1)); 
	  	  if(numeros[i] == 10) {
	   	  	existe10 = true;
		
	}
	 }
	 
	 //Condicional
	
	 
	 if (existe10 == false) {
	 	JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum número 10"); 
	 
	 
	 }else {
	 	String msg = "O número 10 está no(s) indice(s): ";
	 	for(int i=0; i<5; i++) {
	 		if(num[i] == 10) {
	 			msg+="\n"+(i+1);
		}
	 }
	 
	 JOptionPane.showMessageDialog(null, msg);
	 */
	
	}

}
