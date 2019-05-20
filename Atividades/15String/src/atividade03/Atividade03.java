package atividade03;

import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {
		String verbo = "";
		String verboa = "";
		
		do {
		 verbo = JOptionPane.showInputDialog("Informe um verbo termina em AR");
		
		}while((!verbo.endsWith("ar")) || (verbo.equals("ar")));
	
		
		
		if(verbo.length() > 0) {
			verbo = verbo.substring(0, verbo.length() - 2);
		}
		
		verboa+= "Eu " +verbo+ "o"; 
		verboa+= "\nTu " +verbo+ "as"; 
		verboa+= "\nEle " +verbo+ "a";
		verboa+= "\nNos " +verbo+ "amos"; 
		verboa+= "\nVos " +verbo+ "ais";
		verboa+= "\nEles " +verbo+ "am";
		
		JOptionPane.showMessageDialog(null, verboa);
		//-------------------------------------------------------------------
		
		
		/*
		String nova = verbo.replace("ar", "");
		
		System.out.println(nova);
			
		*/
		
		
		if((verbo.charAt(verbo.length()-1) == 'R') && (verbo.charAt(verbo.length()-2) == 'A')) {
			for(int i=0; i< (verbo.length()-2); i++) {
				
				verboa+= verbo.charAt(i);
			}
		}
		
		
		
	}

}
