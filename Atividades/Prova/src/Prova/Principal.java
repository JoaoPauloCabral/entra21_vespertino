package Prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

 int resposta = JOptionPane.showConfirmDialog(null, "Quer utilizar o software?");
		
		String nome;
		int sexo;
		int idade;
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
		double comped1=0, comped2=0, comped3=0, comped4=0, comped5=0, comped6=0, comped7=0, comped8=0, comped9=0, comped10=0, comped11=0, comped12=0, comped13=0, comped14=0, comped15=0, comped16=0, comped17=0, comped18=0;
		double total;
		
		do {
			nome = JOptionPane.showInputDialog("Informe seu nome");
			
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
			
 		idade =	Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
			
 		if(idade <= 17)  {
			idade1++;
		}if ((idade >= 18) && (idade <= 30)) {
			idade2++;
		}if ((idade >= 31) && (idade <= 50)) {
			idade3++;
		}if (idade > 50) {
			idade4++;
		}if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Conforme o estatuto da criança e adolescente (ECA), no artigo 2, trabalho infantil é crime. Por favor registre uma pessoa maior que 18 anos");
		}
			
		//Produtos
		
		do {
			
			Object[] dep1 = {"Áudio/Vídeo","Informática", "Vestuário"};
			
			
			dep = JOptionPane.showOptionDialog(null, "Escolha um departamento", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, dep1, 0);
			
		switch(dep) {
			
			case 0:
				
				Object[] sub1 = {"TVs","Aparelhos de Som"};
				
				
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
					JOptionPane.showMessageDialog(null, "Adicionado à sacola");
					
				}else {
					
				}
						
					
					
					break;
					
					case 1:
						comp2 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp2 == 0) {
							comped2++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp3 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp3 == 0) {
							comped3++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;	
				
				}break;
					
				//Aparelhos de Som
				case 1:
				
					Object[] som1 = {"Semp Toshiba Áudio Bright - R$599.99","Mini System LG - R$512.00", "Mini System Philco - R$499.99"};
					
					
					som = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, som1, 0);
					
				switch(som) {
					
					case 0:
						comp4 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp4 == 0) {
							comped4++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp5 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp5 == 0) {
							comped5++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp6 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp6 == 0) {
							comped6++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
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
					Object[] hard1 = {"Placa Mãe Asus - R$2000.00","Memória Ram Corsair - R$500.00", "Multilaser - R$59.90"};
					
					
					hard = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, hard1, 0);
					
				switch(hard) {
					
					case 0:
						comp7 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp7 == 0) {
							comped7++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp8 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp8 == 0) {
							comped8++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp9 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp9 == 0) {
							comped9++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
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
							comped10++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 1:
						comp11 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp11 == 0) {
							comped11++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 2:
						comp12 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp12 == 0) {
							comped12++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
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
					
Object[] masc1 = {"Camisa Social Lacoste - R$200.00","Calça Jeans Calvin Klein - R$230.00", "Camisa Social Dudalina - R$130.00"};
					
					
					mascu = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, masc1, 0);
					
				switch(mascu) {
					
					case 0:
						
						comp13 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp13 == 0) {
							comped13++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
					break;
					
					case 1:
						comp14 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp14 == 0) {
							comped14++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}	
					break;
					
					case 2:
						comp15 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp15 == 0) {
							comped15++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
				break;		
					
			}break;
			
		
				case 1:
			// Feminino
				
Object[] femi1 = {"Camisa Social Dudalina - R$170.00","Calça Jeans Miss Masi - R$99.90", "Bermuda Jeans - R$74.40"};
					
					
					femin = JOptionPane.showOptionDialog(null, "Escolha um produto", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, femi1, 0);
					
				switch(femin) {
					
					case 0:
						comp16 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp16 == 0) {
							comped16++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
						
					break;
					
					case 1:
						comp17 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp17 == 0) {
							comped17++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
						
					break;
		
					
					case 2:
						comp18 = JOptionPane.showConfirmDialog(null, "Quer comprar esse produto?");
						if (comp18 == 0) {
							comped18++;
							JOptionPane.showMessageDialog(null, "Adicionado à sacola");
						}else {
							
						}
				}break;
					
				
			}break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
			confirm2 = JOptionPane.showConfirmDialog(null, "Deseja comprar mais produtos?");
		}while (confirm2 == 0);	
		
		total = (comped18*74.40) + (comped17*99.90) + (comped16*170) + (comped15*130) + (comped14*230) + (comped13*200) + (comped12*899.50) + (comped11*399.99) + (comped10*500) + (comped9*59.90) + (comped8*500) + (comped7*2000) + (comped6*499.99) + (comped5*512) + (comped4*599.99) + (comped3*1710) + (comped2*7499) + (comped1*4999.99);
		
		
		JOptionPane.showMessageDialog(null, "O valor a pagar a prazo é: R$ "+total);
		
		
		
		
		confirm = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais clientes?");
		
		
		}while (confirm == 0);
		
		
			break;	
		
		
		case 1:
		JOptionPane.showMessageDialog(null, "Não foi realizada nenhuma venda");	
		break;
		
		}
		
		
			
		
		
		
		
		
		
	
	}

}
