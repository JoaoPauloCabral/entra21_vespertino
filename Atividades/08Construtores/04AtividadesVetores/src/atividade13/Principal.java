package atividade13;

public class Principal {

	public static void main(String[] args) {

		/*String [][] matriz = new String [21][3];
		int indice = 0;
		String sair, sair1 = "";
		double total;
		String escolha = "";
		int quantidade;
		int continuar;
		
		
		
		
		for(byte i=0; i<21; i++) {
			matriz[i][0] = ""+(i+1)+ " | ";
			
			
		}
				
		matriz[0][1] = "Arroz 5kg | R$"; matriz[0][2] = "9.50";
		matriz[1][1] = "Arroz 1kg | R$"; matriz[1][2] = "2.75";
		matriz[2][1] = "Feijão 3kg | R$"; matriz[2][2] = "5.60";
		matriz[3][1] = "Feijão 1kg | R$"; matriz[3][2] = "3.10";
		matriz[4][1] = "Macarrão 500gr | R$"; matriz[4][2] = "1.90";
		matriz[5][1] = "Arroz 1kg | R$"; matriz[5][2] = "9.50";
		matriz[6][1] = "Arroz 1kg | R$"; matriz[6][2] = "9.50";
		matriz[7][1] = "Arroz 1kg | R$"; matriz[7][2] = "9.50";
		matriz[8][1] = "Arroz 1kg | R$"; matriz[8][2] = "9.50";
		matriz[9][1] = "Arroz 1kg | R$"; matriz[9][2] = "9.50";
		matriz[10][1] = "Arroz 1kg | R$"; matriz[10][2] = "9.50";
		matriz[11][1] = "Arroz 1kg | R$"; matriz[11][2] = "9.50";
		matriz[12][1] = "Arroz 1kg | R$"; matriz[12][2] = "9.50";
		matriz[13][1] = "Arroz 1kg | R$"; matriz[13][2] = "9.50";
		matriz[14][1] = "Arroz 1kg | R$"; matriz[14][2] = "9.50";
		matriz[15][1] = "Arroz 1kg | R$"; matriz[15][2] = "9.50";
		matriz[16][1] = "Arroz 1kg | R$"; matriz[16][2] = "9.50";
		matriz[17][1] = "Arroz 1kg | R$"; matriz[17][2] = "9.50";
		matriz[18][1] = "Arroz 1kg | R$"; matriz[18][2] = "9.50";
		matriz[19][1] = "Arroz 1kg | R$"; matriz[19][2] = "9.50";
		matriz[20][1] = "Para sair digite : 0";
		
		
		
		 
		
		
		for(int linha=0; linha<21; linha++) {
			sair="\n";
		for(int coluna=0; coluna<3; coluna++) {
			sair+=matriz[linha][coluna]+ " ";
			
		}
		
		sair1+=sair;
		
		
		
		
		}
		
		do {
		escolha =  JOptionPane.showInputDialog(sair1);
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		total = Double.parseDouble(matriz[0][2]) * quantidade;
		
			continuar = JOptionPane.showConfirmDialog(null, "Deseja comprar mais?");
		}while(continuar == 0);
		
		
		JOptionPane.showMessageDialog(null, total);
		
		*/
		
		String[][] produtos = {
				{"Arroz 5kg 				| R$9.50","9.50"},
				{"Arroz 1kg  				| R$2.75","2.75"},			  
				{"Feijao 3kg 				| R$5.60","5.60"},
				{"Feijao 1kg 				| R$3.10","3.10"},
				{"Macarrao 500g 			| R$1.90","1.90"},
				{"Farinha de trigo 2kg 		| R$3.21","3.21"},
				{"Ketchup 370g 				| R$5.50","5.50"},			  
				{"Maionese 480g 			| R$7.30","7.30"},
				{"Gelatina 40g              | R$0.65","0.65"},
				{"Macarrao Instantaneo 120g | R$1.19","1.19"},
				{"Creme de Leite 150g       | R$1.89","1.89"},
				{"Leite condensado 150g 	| R$2.88","2.88"},			  
				{"Leite 1L 					| R$2.06","2.06"},
				{"Chocolate em po 500g 		| R$9.67","9.67"},
				{"Pepino em conserva 600g 	| R$11.99","11.99"},
				{"Vinagre 550g 				| R$1.94","1.94"},
				{"Sal 500g 					| R$3.34","3.34"},			  
				{"Açúcar 550g 				| R$4.89","4.89"},
				{"Fermento 150g 			| R$2.19","2.19"},
				{"Biscoito de Chocolate 70g | R$2.09","2.09"},
		};
			
	
	String menu = "Escolha uma opção:\n";	
	int i=0;
	for(i=0; i<produtos.length; i++)	{
		menu+="\n"+(i+1)+") "+produtos[i][0]; 
	}
			
		menu+="\n"+(i+1)+") Sair";	
		
		int opcao = 0;
		int quantidade = 0;
		double total = 0;
		
		int pro1=0, pro2 = 0,pro3=0, pro4 = 0,pro5=0, pro6 = 0,pro7=0, pro8 = 0,pro9=0, pro10 = 0,pro11=0, pro12 = 0,pro13=0, pro14 = 0,pro15=0, pro16 = 0,pro17=0, pro18 = 0,pro19=0, pro20 = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(opcao != 21) {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
			}
			switch(opcao ) {
			case 1:	
				total+= quantidade * Double.parseDouble(produtos[0] [1]);
				
				pro1++;
				pro1 = quantidade*pro1;
				
				
				break;
			
			case 2:	
				total+= quantidade * Double.parseDouble(produtos[1] [1]);
				pro2++;
				pro2 = quantidade*pro2;
				
				break;
			
			case 3:	
				total+= quantidade * Double.parseDouble(produtos[2] [1]);
				pro3++;
				pro3 = quantidade*pro3;
				
				break;
			
			case 4:	
				total+= quantidade * Double.parseDouble(produtos[3] [1]);
				pro4++;
				pro4 = quantidade*pro4;
				
				break;
			
			case 5:
				total+= quantidade * Double.parseDouble(produtos[4] [1]);
				pro5++;
				pro5 = quantidade*pro5;
				
				break;
			
			case 6:	
				total+= quantidade * Double.parseDouble(produtos[5] [1]);
				pro6++;
				pro6 = quantidade*pro6;
				
				break;
			
			case 7:	
				total+= quantidade * Double.parseDouble(produtos[6] [1]);
				pro7++;
				pro7 = quantidade*pro7;
				break;
			
			case 8:	
				total+= quantidade * Double.parseDouble(produtos[7] [1]);
				pro8++;
				pro8 = quantidade*pro8;
				break;
			
			case 9:	
				total+= quantidade * Double.parseDouble(produtos[8] [1]);
				pro9++;
				pro9 = quantidade*pro9;		
				break;
			
			case 10:
				total+= quantidade * Double.parseDouble(produtos[9] [1]);
				pro10++;
				pro10 = quantidade*pro10;
				break;	
				
			case 11:	
				total+= quantidade * Double.parseDouble(produtos[10] [1]);
				pro11++;
				pro11 = quantidade*pro11;
				break;
			
			case 12:	
				total+= quantidade * Double.parseDouble(produtos[11] [1]);
				pro12++;
				pro12 = quantidade*pro12;
				break;
			
			case 13:	
				total+= quantidade * Double.parseDouble(produtos[12] [1]);
				pro13++;
				pro13 = quantidade*pro13;
				break;
			
			case 14:	
				total+= quantidade * Double.parseDouble(produtos[13] [1]);
				pro14++;
				pro14 = quantidade*pro14;
				break;
			
			case 15:
				total+= quantidade * Double.parseDouble(produtos[14] [1]);
				pro15++;
				pro15 = quantidade*pro15;
				break;	
				
			case 16:	
				total+= quantidade * Double.parseDouble(produtos[15] [1]);
				pro16++;
				pro16 = quantidade*pro16;
				break;
			
			case 17:	
				total+= quantidade * Double.parseDouble(produtos[16] [1]);
				pro17++;
				pro17 = quantidade*pro17;
				break;
			
			case 18:	
				total+= quantidade * Double.parseDouble(produtos[17] [1]);
				pro18++;
				pro18 = quantidade*pro18;
				break;
			
			case 19:	
				total+= quantidade * Double.parseDouble(produtos[18] [1]);
				pro19++;
				pro19 = quantidade*pro19;
				break;
			
			case 20:
				total+= quantidade * Double.parseDouble(produtos[19] [1]);
				pro20++;
				pro20 = quantidade*pro20;
				break;	
				
			}
			
				
		}while(opcao != 21);
		
		JOptionPane.showMessageDialog(null, "Total a pagar: R$"+total);	
		
		JOptionPane.showMessageDialog(null,"Codigo: 1 | Arroz 5 KG | R$9,50 un | Quantidade comprada: "+pro1+ " | Total de: R$ "+Double.parseDouble(produtos[0][1])*pro1+
										   "\n\nCodigo: 2 | Arroz 1 KG | R$2.75 un | Quantidade comprada: "+pro2+ " | Total de: R$ "+Double.parseDouble(produtos[1][1])*pro2+
										   "\n\nCodigo: 3 | Feijão 3 KG | R$5.60 un | Quantidade comprada: "+pro3+ " | Total de: R$ "+Double.parseDouble(produtos[2][1])*pro3+
										   "\n\nCodigo: 4 | Feijão 1 KG | R$3.10 un | Quantidade comprada: "+pro4+ " | Total de: R$ "+Double.parseDouble(produtos[3][1])*pro4+
										   "\n\nCodigo: 5 | Macarrão 500 GR | R$1.90 un | Quantidade comprada: "+pro5+ " | Total de: R$ "+Double.parseDouble(produtos[4][1])*pro5+
										   "\n\nCodigo: 6 | Farinha de Trigo 2 KG | R$3.21 un | Quantidade comprada: "+pro6+ " | Total de: R$ "+Double.parseDouble(produtos[5][1])*pro6+
										   "\n\nCodigo: 7 | Ketchup 370 GR | R$5.50 un | Quantidade comprada: "+pro7+ " | Total de: R$ "+Double.parseDouble(produtos[6][1])*pro7+
										   "\n\nCodigo: 8 | Maionese 480 GR | R$7.40 un | Quantidade comprada: "+pro8+ " | Total de: R$ "+Double.parseDouble(produtos[7][1])*pro8+
										   "\n\nCodigo: 9 | Gelatina 50 GR | R$0.65 un | Quantidade comprada: "+pro9+ " | Total de: R$ "+Double.parseDouble(produtos[8][1])*pro9+
										   "\n\nCodigo: 10 | Macarrão Instantâneo 120 GR | R$1.19 un | Quantidade comprada: "+pro10+ " | Total de: R$ "+Double.parseDouble(produtos[9][1])*pro10+
										   "\n\nCodigo: 11 | Creme de Leite 150 GR | R$1.89 un | Quantidade comprada: "+pro11+ " | Total de: R$ "+Double.parseDouble(produtos[10][1])*pro11+
										   "\n\nCodigo: 12 | Leite Condensado 150 GR | R$2.88 un | Quantidade comprada: "+pro12+ " | Total de: R$ "+Double.parseDouble(produtos[11][1])*pro12+
										   "\n\nCodigo: 13 | Leite 1 L | R$2.06 un | Quantidade comprada: "+pro13+ " | Total de: R$ "+Double.parseDouble(produtos[12][1])*pro13+
										   "\n\nCodigo: 14 | Chocolate em Pó 500 GR | R$9,67 un | Quantidade comprada: "+pro14+ " | Total de: R$ "+Double.parseDouble(produtos[13][1])*pro14+
										   "\n\nCodigo: 15 | Pepino em Conserva 600 GR | R$11.99 un | Quantidade comprada: "+pro15+ " | Total de: R$ "+Double.parseDouble(produtos[14][1])*pro15+
										   "\n\nCodigo: 16 | Vinagre 550 ML | R$1.94 un | Quantidade comprada: "+pro16+ " | Total de: R$ "+Double.parseDouble(produtos[15][1])*pro16+
										   "\n\nCodigo: 17 | Sal 500 GR | R$3.34 un | Quantidade comprada: "+pro17+ " | Total de: R$ "+Double.parseDouble(produtos[16][1])*pro17+
										   "\n\nCodigo: 18 | Açúcar 550 GR | R$4.89 un | Quantidade comprada: "+pro18+ " | Total de: R$ "+Double.parseDouble(produtos[17][1])*pro18+
										   "\n\nCodigo: 19 | Fermento 150 FR | R$2.19 un | Quantidade comprada: "+pro19+ " | Total de: R$ "+Double.parseDouble(produtos[18][1])*pro19+
										   "\n\nCodigo: 20 | Biscoito de Chocolate 70 GR | R$2.09 un | Quantidade comprada: "+pro20+ " | Total de: R$ "+Double.parseDouble(produtos[19][1])*pro20+
										   "\n\n\n\n\nO total a ser pago e de: R$ "+total);
	}

}
