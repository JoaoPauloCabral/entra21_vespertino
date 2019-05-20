package atividade16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int pedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do pedido"));
		double pag = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o pagamento"));
		double troco1 = pag-5;
		double troco2 = pag-4.50;
		double troco3 = pag-8;
		double troco4 = pag-12;
		double troco5 = pag-16.50;
		double troco6 = pag-1;
		double troco7 = pag-2.50;
		
		
		
		
		
		
		if(pedido == 1) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$5.00.O troco é de R$ "+troco1);
			
		}if(pedido == 2) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$4.50.O troco é de R$ "+troco2);
		
		}if(pedido == 3) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$8.00.O troco é de R$ "+troco3);
		}if(pedido == 4) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$12.00.O troco é de R$ "+troco4);
		}if(pedido == 5) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$16.50.O troco é de R$ "+troco5);
		}if(pedido == 6) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$1.00.O troco é de R$ "+troco6);
		}if(pedido == 7) {
			JOptionPane.showMessageDialog(null, "Pedido número: "+pedido+ ", valor R$2.50.O troco é de R$ "+troco7);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
