package prova;

import javax.swing.JOptionPane;

import Prova.Object;
import Prova.String;

public class Prova {

	public static void main(String[] args) {

int resposta = JOptionPane.showConfirmDialog(null, "Quer utilizar o software?");
		boolean idades = false;
		boolean nomes = false;
		String nome;
		
		double pagamento1, pagamento2;
		int sexo;
		int idade = 0;
		int idade1=0, idade2=0, idade3=0, idade4=0;
		int confirm;
		int confirm2;
		int masc=0, femi=0;
		int dep;
		int subdep1, subdep2, subdep3;
		int tvs, som, hard, soft, mascu, femin;
 		switch(resposta) {
		case 0:
		int comp1, comp2, comp3, comp4, comp5, comp6, comp7, comp8, comp9, comp10, comp11, comp12, comp13, comp14, comp15, comp16, comp17, comp18;
		double nome2=0;
		double comped1=0, comped2=0, comped3=0, comped4=0, comped5=0, comped6=0, comped7=0, comped8=0, comped9=0, comped10=0, comped11=0, comped12=0, comped13=0, comped14=0, comped15=0, comped16=0, comped17=0, comped18=0;
		double total;
		double vista;
		int paga1;
		double dep10=0, dep20=0, dep30=0;
		
		do {
			
			
			do {
					
			nome = JOptionPane.showInputDialog("Informe seu nome");
			
			
			}while ((nome.equals("") && (nome.equals())); 	
			nome2++;
			
			Object[] sexo1 = {"Maculino","Feminino"};
			sexo = JOptionPane.showOptionDialog(null, "Qual o seu sexo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo1, 0);
		
		switch(sexo) {
		
		case 0:
			masc++;
		break;
		
		case 1:
			femi++;
		break;	
		}
	
		do {
		try {
			
		idade =	Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
		idades = true;
		}catch(Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Falha ao obter a idade: "+erro.getMessage());
			
		}
		
		}while (idades == false);
		
		
 		if(idade <= 17)  {
			idade1++;
		}if ((idade >= 18) && (idade <= 30)) {
			idade2++;
		}if ((idade >= 31) && (idade <= 50)) {
			idade3++;
		}if (idade > 50) {
			idade4++;
		}if (idade < 18) {
			
		}
			
		//Produtos
		
		do {
			
			Object[] dep1 = {"�udio/V�deo","Inform�tica", "Vestu�rio"};
			
			
			dep = JOptionPane.showOptionDialog(null, "Escolha um departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, dep1, 0);
			
		switch(dep) {
			
			case 0:
				
				Object[] sub1 = {"TVs","Aparelhos de Som", "Voltar"};
				
				
				subdep1 = JOptionPane.showOptionDialog(null, "Escolha um sub-departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sub1, 0);
				
			switch(subdep1) {
				
				//TVS
				case 0:
					Object[] tvs1 = {"Smart TV Led 49 Sansumg - R$4999.99","Smart TV 4k LG 60 - R$7499.00", "Smart TV Full HD 32 Sansumg - R$1710.00"};
					
					
					tvs = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, tvs1, 0);
					
				switch(tvs) {
					
					case 0:
						comp1 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
				if (comp1 == 0) {
					comped1++;
					dep10++;
					JOptionPane.showMessageDialog(null, "Adicionado � sacola");
					
				}else {
					
				}
						
					
					
					break;
					
					case 1:
						comp2 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp2 == 0) {
							comped2++;
							dep10++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp3 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp3 == 0) {
							comped3++;
							dep10++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;	
				
				}break;
					
				//Aparelhos de Som
				case 1:
				
					Object[] som1 = {"Semp Toshiba �udio Bright - R$599.99","Mini System LG - R$512.00", "Mini System Philco - R$499.99"};
					
					
					som = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, som1, 0);
					
				switch(som) {
					
					case 0:
						comp4 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp4 == 0) {
							dep10++;
							comped4++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp5 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp5 == 0) {
							dep10++;
							comped5++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp6 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp6 == 0) {
							dep10++;
							comped6++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;	
				
					
				
					
				}break;
				
				
			
			}break;
			
			
			
			
			case 1:
			
 Object[] sub2 = {"Hardware","Software"};
				
				
				subdep2 = JOptionPane.showOptionDialog(null, "Escolha um sub-departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sub2, 0);
				
			switch(subdep2) {
				
				case 0:

			//Hardware		
					Object[] hard1 = {"Placa M�e Asus - R$2000.00","Mem�ria Ram Corsair - R$500.00", "Multilaser - R$59.90"};
					
					
					hard = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, hard1, 0);
					
				switch(hard) {
					
					case 0:
						comp7 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp7 == 0) {
							dep20++;
							comped7++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp8 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp8 == 0) {
							dep20++;
							comped8++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp9 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp9 == 0) {
							dep20++;
							comped9++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;	
					
					
				}break;
				
				case 1:
		//Software	
				
Object[] sof1 = {"Windows 10 - R$500.00","Office 2019 - R$399.99", "AutoCard - R$899.50"};
					
					
					soft = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sof1, 0);
					
				switch(soft) {
					
					case 0:
						
						comp10 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp10 == 0) {
							dep20++;
							comped10++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 1:
						comp11 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp11 == 0) {
							dep20++;
							comped11++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp12 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp12 == 0) {
							dep20++;
							comped12++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;	
					
				}break;
				
			}break;
			
			
			
			
			case 2:
Object[] sub3 = {"Masculino","Feminino"};
				
				
				subdep3 = JOptionPane.showOptionDialog(null, "Escolha um sub-departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sub3, 0);
				
			switch(subdep3) {
				
				case 0:
			//Masculino
					
Object[] masc1 = {"Camisa Social Lacoste - R$200.00","Cal�a Jeans Calvin Klein - R$230.00", "Camisa Social Dudalina - R$130.00"};
					
					
					mascu = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, masc1, 0);
					
				switch(mascu) {
					
					case 0:
						
						comp13 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp13 == 0) {
							dep30++;
							comped13++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
					break;
					
					case 1:
						comp14 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp14 == 0) {
							dep30++;
							comped14++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}	
					break;
					
					case 2:
						comp15 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp15 == 0) {
							dep30++;
							comped15++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
				break;		
					
			}break;
			
		
				case 1:
			// Feminino
				
Object[] femi1 = {"Camisa Social Dudalina - R$170.00","Cal�a Jeans Miss Masi - R$99.90", "Bermuda Jeans - R$74.40"};
					
					
					femin = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, femi1, 0);
					
				switch(femin) {
					
					case 0:
						comp16 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp16 == 0) {
							dep30++;
							comped16++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp17 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp17 == 0) {
							dep30++;
							comped17++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
						
					break;
		
					
					case 2:
						comp18 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp18 == 0) {
							dep30++;
							comped18++;
							JOptionPane.showMessageDialog(null, "Adicionado � sacola");
						}else {
							
						}
				}break;
					
				
			}break;
			
		
		}	
		
		
			confirm2 = JOptionPane.showConfirmDialog(null, "Deseja comprar mais produtos?");
		}while (confirm2 == 0);	
		
		total = (comped18*74.40) + (comped17*99.90) + (comped16*170) + (comped15*130) + (comped14*230) + (comped13*200) + (comped12*899.50) + (comped11*399.99) + (comped10*500) + (comped9*59.90) + (comped8*500) + (comped7*2000) + (comped6*499.99) + (comped5*512) + (comped4*599.99) + (comped3*1710) + (comped2*7499) + (comped1*4999.99);
		
		vista = (comped18*74.40*0.85) + (comped17*99.90*0.85) + (comped16*170*0.85) + (comped15*130*0.85) + (comped14*230*0.85) + (comped13*200*0.85) + (comped12*899.50*0.90) + (comped11*399.99*0.90) + (comped10*500*0.90) + (comped9*59.90*0.90) + (comped8*500*0.90) + (comped7*2000*0.90) + (comped6*499.99*0.95) + (comped5*512*0.95) + (comped4*599.99*0.95) + (comped3*1710*0.95) + (comped2*7499*0.95) + (comped1*4999.99*0.95);
		
		JOptionPane.showMessageDialog(null, "O valor total a pagar � de: R$ "+total);
		JOptionPane.showMessageDialog(null, "� vista esse valor � de: R$ "+vista+
											"\nA prazo fica: R$ "+total);
		
		Object[] paga = {"� vista","A prazo"};
		paga1 = JOptionPane.showOptionDialog(null, "Qual a forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, paga, 0);
	
	switch(paga1) {
	
	case 0:
		do {
			pagamento1 = Double.parseDouble(JOptionPane.showInputDialog("O valor total a ser pago � de R$ "+vista+ "\n Quanto o cliente deseja pagar?"));
			}while (pagamento1 < vista);
		
		if (pagamento1 == total) {
			JOptionPane.showMessageDialog(null, "Transa��o conclu�da, troco n�o necess�rio");
		}else {
			JOptionPane.showMessageDialog(null, "O troco total a se pagar � de R$ "+(pagamento1 - total));
		}
		
		break;
	
	case 1:
		
		do {
			pagamento2 = Double.parseDouble(JOptionPane.showInputDialog("O valor total a ser pago � de R$ "+total+ "\n Quanto o cliente deseja pagar?"));
			}while (pagamento2 < total);
				
		if (pagamento2 == total) {
			JOptionPane.showMessageDialog(null, "Transa��o conclu�da, troco n�o necess�rio");
		}else {
			JOptionPane.showMessageDialog(null, "O troco total a se pagar � de R$ "+(pagamento2 - total));
		}
		
	break;	
	}
		
		
		confirm = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais clientes?");
		
		
		}while (confirm == 0);
		
		double per1 = (100/nome2)*masc;
		double per2 = (100/nome2)*femi;
		
		JOptionPane.showMessageDialog(null, "A quantidade de clientes a usar o sistema foram de: " +nome2);
		JOptionPane.showMessageDialog(null, "A quantidade de homens a se cadatrarem foram de: " +masc+ ". Corresponde �: "+per1+ "%"
											+"\nA quantidade de mulheres a se cadatrarem foram de: " +femi+ ". Corresponde �: "+per2+ "%");
		
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas por faixa et�ria foram:" 
				+							"\nAt� 17 anos: " +idade1+
											"\nDe 18 � 30 anos: " +idade2+
											"\nDe 31 � 50 anos: " +idade3+
											"\nAcima de 50 anos: " +idade4);
		
		JOptionPane.showMessageDialog(null, "A quantidade de produtos adquiridas por departamento foram: " 
				+							"\n�udio/V�deo: " +dep10+
											"\nInform�tica: " +dep20+
											"\nVestu�rio: " +dep30);	
		
		break;	
			
		case 1:
		JOptionPane.showMessageDialog(null, "N�o foi realizada nenhuma venda");	
		break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
