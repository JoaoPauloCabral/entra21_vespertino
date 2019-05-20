package atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int continuar=0;
		int pratos1, contador=0, continuar1=0;
		int ham=0, san=0, dia=0, pizza=0, lasanha=0, queijo=0, bolo=0;
		
		do {
			
			Object[] pratos = {"Hambúrguer + Suco de Laranja","Sanduíche natural + Suco de Uva", "Prato do dia", "Pizza", "Lasanha", "Pão de queijo", "Bolo"};
			
			
			
			pratos1 = JOptionPane.showOptionDialog(null, "Qual seu pedido?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, pratos, 0);
		
		switch(pratos1) {
		
		case 0:
			ham++;
		break;
		
		case 1:
			san++;
		break;	
		
		case 2:
			dia++;
		break;
		
		case 3:
			pizza++;
		break;	
		
		case 4:
			lasanha++;
		break;	
		
		case 5:
			queijo++;
		break;
		
		case 6:
			bolo++;
		break;	
		
		}
			
		contador++;	
			
					continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer mais pedidos?");	
		}while(continuar == 0);
		
		
		double total3 = pizza*12;
		double total1 = bolo*2.50;
		double total2 = queijo*1;
		double total4 = lasanha*16.50;
		double total5 = dia*8;
		double total6 = san*4.50;
		double total7 = ham*5;
		
		double total = total1+total2+total3+total4+total5+total6+total7;
		
		JOptionPane.showMessageDialog(null, "O preço final é de R$ "+total);
		
		
		
		double troco = 0;
		double pag = 0;
		
		do {
			pag = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pagamento"));
			troco = pag-total;
		
			if (troco < 0) {
				JOptionPane.showMessageDialog(null,"Insira um valor válido");
				}
			
		}while (troco < 0);
		
		if (pag == total) {
			JOptionPane.showMessageDialog(null,"Pagamento Concluído");
		}else {
			JOptionPane.showMessageDialog(null, "Troco de R$ "+troco);
		}
			
		
	}

}
