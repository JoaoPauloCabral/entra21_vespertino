package atividade05;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

				String nome = JOptionPane.showInputDialog("Informe o nome do produto");
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
				int mult = 1;
				double mult2 = 0.05;
				String total = "a";
				double tap = valor*mult;
				
			
				
				double val1 = valor*0.95*1;
				double val2 = valor*0.90*2;
				double val3 = valor*0.85*3;
				double val4 = valor*0.80*4;
				double val5 = valor*0.75*5;
				double val6 = valor*0.70*6;
				double val7 = valor*0.65*7;
				double val8 = valor*0.60*8;
				double val9= valor*0.55*9;
				double val10 = valor*0.50*10;
				
				double val11 = valor*0.95;
				double val12 = valor*0.90;
				double val13 = valor*0.85;
				double val14 = valor*0.80;
				double val15 = valor*0.75;
				double val16 = valor*0.70;
				double val17 = valor*0.65;
				double val18 = valor*0.60;
				double val19= valor*0.55;
				double val20 = valor*0.50;
		
				
				DecimalFormat format = new DecimalFormat("#.00"); 
				
				
				
				JOptionPane.showMessageDialog(null, "Produto: "+nome+ 
										"\nValor: "+valor+
										"\n1 x R$ " +format.format(val11)+ " = R$ "+format.format(val1)+
										"\n2 x R$ " +format.format(val12)+ " = R$ "+format.format(val2)+
										"\n3 x R$ " +format.format(val13)+ " = R$ "+format.format(val3)+
										"\n4 x R$ " +format.format(val14)+ " = R$ "+format.format(val4)+
										"\n5 x R$ " +format.format(val15)+ " = R$ "+format.format(val5)+
										"\n6 x R$ " +format.format(val16)+ " = R$ "+format.format(val6)+
										"\n7 x R$ " +format.format(val17)+ " = R$ "+format.format(val7)+
										"\n8 x R$ " +format.format(val18)+ " = R$ "+format.format(val8)+
										"\n9 x R$ " +format.format(val19)+ " = R$ "+format.format(val9)+
										"\n10 x R$ " +format.format(val20)+ " = R$ "+format.format(val10));
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
