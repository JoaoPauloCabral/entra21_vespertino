package atividade35;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Informe o nome");
		double sal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário bruto"));
		int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de faltas"));
		
		
		//Salario 1
		
		double liq1 = sal - (sal*0.06) +   100;
		double liq2 = sal - (sal*0.06) - 50  ;
		double liq3 = sal - (sal*0.06) - 150  ;
		
		//salario 2
		
		double liq4 = sal - (sal*0.05 + sal*0.06) + 100;
		double liq5 = sal - (sal*0.05 + sal*0.06) - 50 ;
		double liq6 = sal - (sal*0.05 + sal*0.06) - 150 ;
		
		
		//salario 3
		
		double liq7 = sal - (sal*0.08 + sal*0.06) + 100  ;
		double liq8 = sal - (sal*0.08 + sal*0.06) - 50   ;
		double liq9 = sal -(sal*0.08 + sal*0.06) - 150  ;
		
		//salario 4
		
		double liq10 = sal - (sal*0.11 + sal*0.06) + 100  ;
		double liq11 =  sal -(sal*0.11 + sal*0.06) - 50  ;
		double liq12 = sal - (sal*0.11 + sal*0.06) - 150 ;
		
		//salario 5
		
		double liq13 = sal - (sal*0.11 + sal*0.06) + 100  ;
		double liq14 = sal - (sal*0.11 + sal*0.06) - 50 ;
		double liq15 = sal - (sal*0.11 + sal*0.06) - 150  ;
	
		//liquido 1
		if((sal <= 937) && (falta == 0)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq1);
		}else if((sal <= 937) && (falta <=5 )) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq2);
		}else if((sal <= 937) && (falta > 5 )) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq3);
		
		//liquido2
		}if((sal >= 937.01) && (sal <= 1999.99) && (falta == 0)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq4);
		}else if((sal >= 937.01) && (sal <= 1999.99) && (falta <= 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq5);
		}else if((sal >= 937.01) && (sal <= 1999.99) && (falta > 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq6);
		
		//liquido3
		}else if((sal >= 2000) && (sal <= 3499.99) && (falta == 0)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq7);
		}else if((sal >= 2000) && (sal <= 3499.99) && (falta <= 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq8);
		}else if((sal >= 2000) && (sal <= 3499.99) && (falta > 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq9);
		
		
		//liquido4
		
		
		}else if((sal >= 3500) && (sal <= 5999.99) && (falta == 0)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq10);
		}else if((sal >= 3500) && (sal <= 5999.99) && (falta <= 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq11);
		}else if((sal >= 3500) && (sal <= 5999.99) && (falta > 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq12);
		
		
		//liquido5
		
		
		}else if((sal >= 6000) && (falta == 0)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq13);
		}else if((sal >= 6000) && (falta <= 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq14);
		}else if((sal >= 6000) && (falta > 5)) {
			JOptionPane.showMessageDialog(null, "O trabalhador "+nome+ " ganhará R$ "+liq15);
		}
			
		
		
		
		
		
		
		
		
	}

}
