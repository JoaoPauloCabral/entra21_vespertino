package atividade29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int hora1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora local"));
		int eua = hora1+1;
		int lon = hora1+4;
		int jap = hora1+12;
		int eua1 = eua-24;
		int lon2 = lon-24;
		int jap3 = jap-24;
		
		Object[] pais = {"Estados Unidos", "Inglaterra", "Jap�o"};
		
		int obter = JOptionPane.showOptionDialog(null, "Escolha um pa�s para ver a hora em outro pa�s", "Escolha um Pa�s",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pais, pais[0]);

		switch(obter) {
		
		case 0:
			
		if(eua > 24) {
			JOptionPane.showMessageDialog(null, "O hor�rio no EUA �: "+eua1);
		}else 
			JOptionPane.showMessageDialog(null, "O hor�rio no EUA �: "+eua);	
		break;
		
		case 1:	
			
			if(lon2 > 24) {
				JOptionPane.showMessageDialog(null, "O hor�rio na Inglaterra � "+lon);
			}else 	
				JOptionPane.showMessageDialog(null, "O hor�rio na Inglaterra � "+lon2);		
			break;	
		
		case 2:			
			if(lon2 > 24) {
				JOptionPane.showMessageDialog(null, "O hor�rio no Jap�o � "+jap);
			}else 		
				JOptionPane.showMessageDialog(null, "O hor�rio no Jap�o � "+jap3);		
			break;
			
			
		
		
		}
		
		
		
		
		
		
	}

}
