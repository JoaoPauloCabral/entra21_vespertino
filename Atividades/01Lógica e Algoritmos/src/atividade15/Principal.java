package atividade15;

public class Principal {

	public static void main(String[] args) {

		
int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dias que estará hospedado no hotel"));
		
		
		Object[] hotel = {"Apto Simple", "Apartamento Duplo", "Suíte de Luxo"};
		
		int obter = JOptionPane.showOptionDialog(null, "Informe o tipo de de quarto", "Escolha o Ap",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, hotel, hotel[0]);
		
		
		
		switch(obter) {
		
		case 0:
			JOptionPane.showMessageDialog(null, "Deverá pagar R$ "+dia*45);
		break;
		
		case 1:
			JOptionPane.showMessageDialog(null, "Deverá pagar R$ "+dia*65);
		break;	
		
		case 2:
			JOptionPane.showMessageDialog(null, "Deverá pagar R$ "+dia*110);
		break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
