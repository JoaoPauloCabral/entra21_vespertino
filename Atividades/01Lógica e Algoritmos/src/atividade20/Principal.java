package atividade20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

Object[] estado = {"Santa Catarina", "Paraná", "Rio Grande do Sul"};
		
		int obter = JOptionPane.showOptionDialog(null, "Escolha um Estado", "Escolha um Estado",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, estado, estado[0]);
		
		switch (obter) {
		
		case 0:
			Object[] cidade1 = {"Blumenau", "Florianópolis", "Brusque"};
			
			int cidade = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "Escolha uma cidade",
					  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cidade1, cidade1[0]);
			
	switch (cidade) {
	
	case 0:
		JOptionPane.showMessageDialog(null, "Blumenau possui 352.460 mil habitantes");
	break;		
	
	case 1:
		JOptionPane.showMessageDialog(null, "Florianópolis possui 477.798 mil habitantes");
	break;
	
	case 2:
		JOptionPane.showMessageDialog(null, "Brusque possui 102.025 mil habitantes");
	
		break;
		
	}break;
		
		case 1:
			Object[] cidade2 = {"Curitiba", "Maringá", "Cascavél"};
			
			int cidade10 = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "Escolha uma cidade",
					  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cidade2, cidade2[0]);
		
		switch (cidade10) {
		
		case 0:
			JOptionPane.showMessageDialog(null, "Curitiba possui 1,765 milhão de habitantes");
		break;		
		
		case 1:
			JOptionPane.showMessageDialog(null, "Maringá possui 342.310 mil habitantes");
		break;
		
		case 2:
			JOptionPane.showMessageDialog(null, "Cascavél possui 266.835 mil habitantes");
		break;
		
		
		}break;
		
		
		
		case 2:
			
			Object[] cidade3 = {"Porto Alegre", "Uruguaiana", "Rio Grande"};
			
			int cidade11 = JOptionPane.showOptionDialog(null, "Escolha uma cidade", "Escolha uma cidade",
					  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cidade3, cidade3[0]);
		
		switch (cidade11) {
		case 0:
			JOptionPane.showMessageDialog(null, "Porto Alegre possui 1,409 milhão de habitantes");
		break;		
		
		case 1:
			JOptionPane.showMessageDialog(null, "Uruguaiana possui 116.276 mil habitantes");
		break;
		
		case 2:
			JOptionPane.showMessageDialog(null, "Rio Grande possui 198.048 mil habitantes");
		break;
		
		
		
		}break;
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
