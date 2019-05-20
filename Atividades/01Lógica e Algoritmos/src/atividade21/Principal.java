package atividade21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Object[] produto = {"Calça", "Camisa", "Casaco", "Meias", "Paletó"};
		
		int obter = JOptionPane.showOptionDialog(null, "Escolha um Produto", "Escolha um Produto",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, produto, produto[0]);

		
		switch (obter) {

		case 0:
			Object[] pagamento = {"Á vista", "A prazo em 30 dias", "A prazo em 60 dias"};
	
			int pro1 = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "Escolha uma forma de pagamento",
			  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pagamento, pagamento[0]);

			
			switch (pro1) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "O produto custará RS150,00 ");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "O produto custará RS165,00 ");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "O produto custará RS180,00 ");
			break;
			
			}break;
			
		case 1:
			
			Object[] pagamento1 = {"Á vista", "A prazo em 30 dias", "A prazo em 60 dias"};
			
			int pro2 = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "Escolha uma forma de pagamento",
			  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pagamento1, pagamento1[0]);

			
			switch (pro2) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "O produto custará RS300,00 ");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "O produto custará RS330,00 ");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "O produto custará RS360,00 ");
			break;
			
			}break;
			
		case 2:
			
Object[] pagamento2 = {"Á vista", "A prazo em 30 dias", "A prazo em 60 dias"};
			
			int pro3 = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "Escolha uma forma de pagamento",
			  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pagamento2, pagamento2[0]);

			
			switch (pro3) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "O produto custará RS250,00 ");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "O produto custará RS275,00 ");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "O produto custará RS300,00 ");
			break;
			
			}break;
			
		case 3:
			
Object[] pagamento3 = {"Á vista", "A prazo em 30 dias", "A prazo em 60 dias"};
			
			int pro4 = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "Escolha uma forma de pagamento",
			  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pagamento3, pagamento3[0]);

			
			switch (pro4) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "O produto custará RS30,00 ");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "O produto custará RS33,00 ");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "O produto custará RS36,00 ");
			break;
			
			}break;
	
	
		case 4:
			
		
Object[] pagamento4 = {"Á vista", "A prazo em 30 dias", "A prazo em 60 dias"};
			
			int pro5 = JOptionPane.showOptionDialog(null, "Escolha uma forma de pagamento", "Escolha uma forma de pagamento",
			  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pagamento4, pagamento4[0]);

			
			switch (pro5) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "O produto custará RS450,00 ");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "O produto custará RS495,00 ");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "O produto custará RS540,00 ");
			break;
			
			}break;
	
	
	
	
	
	
	
	
	
	
	
}
		
		
			
	
	
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
