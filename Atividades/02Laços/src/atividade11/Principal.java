package atividade11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int continuar=0;
		String nome;
		String nomesal = "a";
		int cont1 = 0;
		int cargo, sexo, idade;
		int javaj=0, javap=0, javas=0, adm=0, anaj=0, anap=0, anas=0, arq=0, proj=0, hom=0, mul=0;
		double horan, hora1, hora2;
		int faltas, filhos;
		int idade1=0, idade2=0, idade3=0, idade4=0;
		int clube, sim=0, não=0;
		double salario;
		double maiorsalario=0;
		
		//SALARIOS
		
		double salario1;
		
		double salario2;
		double salario3;
		
		
		double inss=0, vale;
		
		
		do {
			
		nome =	JOptionPane.showInputDialog("Informe seu nome");
			cont1++;	
		
			Object[] cargo1 = {"Desenvolvedor Java Júnior","Desenvolvedor Java Pleno", "Desenvolvedor Java Sênior", "Administrador de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
			
			cargo = JOptionPane.showOptionDialog(null, "Qual o seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargo1, 0);
			
		switch(cargo) {
		case 0 :
			javaj++;
		break;
		case 1:
			javap++;		
		break;	
		
		case 2 :
			javas++;
		break;
		case 3:
			adm++;		
		break;	
		
		case 4 :
			anaj++;
		break;
		case 5:
			anap++;		
		break;	
		
		case 6 :
			anas++;
		break;
		case 7:
			arq++;		
		break;	
		
		case 8:
			proj++;		
		break;	
		
		
		}		
				
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora"));
		
		horan =	Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas normais trabalhadas"));	
		hora1 =	Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas extras com 50% de acrécimo trabalhadas"));	
		hora2 =	Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas extras com 100% de acréscimo trabalhadas"));
		
		
		
		salario1 = (((salario*horan) + (salario*(hora1*1.5)) + (salario*(hora2*2))));
		
		Object[] sexo1 = {"Masculino","Feminino"};
		
		sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo1, 0);
		
	switch(sexo) {
	case 0 :
		hom++;
	break;
	case 1:
		mul++;
		
		
	}	
		
	do {	
	
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
		
		if((idade >= 18) && (idade <= 26)) {
			idade1++;
		}if ((idade >= 27) && (idade <= 40)) {
			idade2++;
		}if ((idade >= 41) && (idade <= 50)) {
			idade3++;
		}if (idade > 50) {
			idade4++;
		}if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Conforme o estatuto da criança e adolescente (ECA), no artigo 2, trabalho infantil é crime. Por favor registre uma pessoa maior que 18 anos");
		}
		
		
	}while (idade < 18);	
	
	
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas"));
		
		filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de filhos"));
		
		
		Object[] clube1 = {"Sim","Não"};
		
		clube = JOptionPane.showOptionDialog(null, "Você é associado do clube de fidelidade?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, clube1, 0);
		
	switch(clube) {
	case 0 :
		
		sim++;
	break;
	
	case 1:
		
		break;	
		}			
				
	//calculo
	
	if(salario1 <= 2000) {
		inss = salario1*0.05;
		
	}else if(salario1 <= 3500) {
		inss = salario1*0.07;
	
	}else if(salario1 <= 5600) {
		inss = salario1*0.08;
	}else if (salario1 > 5600) {
		inss = salario1*0.10;
	}
	
	if (clube == 0) {
		clube = 110;
	}else 
		clube = 0;
	
	if (filhos > 0) {
		filhos = filhos*50;
	}
	
	if (faltas == 0) {
		faltas = 200;
	}else 
		faltas = 0;
	vale = salario1*0.06;
	
	salario2 = salario1 - inss - vale - clube + filhos + faltas;
		       
	JOptionPane.showMessageDialog(null, "O colaborador "+nome+ " ganhará de salário líquido o valor de R$ "+salario2);
	
	
	if (salario2 > maiorsalario) {
		maiorsalario = salario2;
		nomesal = nome;		
	}
	
	
	continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais colaboradores?");
	}while(continuar == 0);
	
		double media1 = (hom*100) / cont1;
		double media2 = (mul*100) / cont1;
		
		JOptionPane.showMessageDialog(null, "O número de funcionários cadastrados foram de: "+cont1+ 
											"\n\n\n A quantidade de mulheres e homens foram: "+
											"\nHomens: "+hom+ ". Equivale em % à "+media1+
											"\nMulheres: "+mul+ ". Equivale em % à "+media2);		
		
		JOptionPane.showMessageDialog(null, "A quantidade de funcionários com idade entre 18 e 26 anos é de: " +idade1+ 
				"\n A quantidade de funcionários com idade entre 27 e 40 anos é de: " +idade2+
				"\nA quantidade de funcionários com idade entre 41 e 50 anos é de: " +idade3+
				"\nA quantidade de funcionários com idade maior que 50 anos é de: " +idade4);
	
		double media3 = (javaj*100) / cont1;
		double media4 = (javap*100) / cont1;
		double media5 = (javas*100) / cont1;
		double media6 = (adm*100) / cont1;
		double media7 = (anaj*100) / cont1;
		double media8 = (anap*100) / cont1;
		double media9 = (anas*100) / cont1;
		double media10 = (arq*100) / cont1;	
		double media11 = (proj*100) / cont1;	
		double media12 = (sim*100) / cont1;
		
		JOptionPane.showMessageDialog(null, "Número e percentual de funcionários de cada cargo: "+ 
				"\n\n\n Desenvolvedor Java Júnior: "+javaj+ ". Esse valor em % corresponde à " +media3+
				"\n\nDesenvolvedor Java Pleno: "+javap+ ". Esse valor em % corresponde à " +media4+
				"\n\nDesenvolvedor Java Sênior: "+javas+ ". Esse valor em % corresponde à " +media5+
				"\n\nAdministrador de Banco de Dados: "+adm+ ". Esse valor em % corresponde à " +media6+
				"\n\nDesenvolvedor Java Pleno: "+anaj+ ". Esse valor em % corresponde à " +media7+
				"\n\nDesenvolvedor Java Sênior: "+anap+ ". Esse valor em % corresponde à " +media8+
				"\n\nAdministrador de Banco de Dados: "+anas+ ". Esse valor em % corresponde à " +media9+
				"\n\nDesenvolvedor Java Pleno: "+arq+ ". Esse valor em % corresponde à " +media10+
				"\n\nDesenvolvedor Java Sênior: "+proj+ ". Esse valor em % corresponde à " +media11);
	
		JOptionPane.showMessageDialog(null, "O funcionário  " +nomesal+ " possui o maior salário, sendo esse saláio de  R$" +maiorsalario);
		JOptionPane.showMessageDialog(null, "O número de funcionários que aderem ao clube de fidelidade é de " +sim+ ". Esse número corresponde à " +media12+ "% dos funcionários");
	}

}
