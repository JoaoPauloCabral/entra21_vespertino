package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int continuar=0;
		int masculino=0, feminino=0;
		int sexo;	
		int gerente=0, atendente=0, a�ougue=0, secre=0, almoxarife=0, padeiro=0, estagiario=0;
		int cargo;	
		int idade1=0, idade2=0;
		
		do {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua Idade"));
		
		if(idade > 18) {
			idade1++;
		}else if(idade < 18) {
			idade2++;
		}
			
		
	Object[] sexo1 = {"Maculino","Feminino"};
			
	
		
		sexo = JOptionPane.showOptionDialog(null, "Qual o seu sexo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo1, 0);
	
	switch(sexo) {
	
	case 0:
		feminino++;
	break;
	
	case 1:
		masculino++;
	break;	
	}
	
Object[] cargo1 = {"Gerente","Atendente", "A�ougueiro", "Secret�ria", "Almoxarife", "Padeiro", "Estagi�rio"};
	
		
	cargo = JOptionPane.showOptionDialog(null, "Qual o seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargo1, 0);
	
switch(cargo) {
	
	case 0:
		gerente++;
	break;
	
	case 1:
		atendente++;
	break;
	case 2:
		a�ougue++;
	break;
	
	case 3:
		secre++;
	break;
	case 4:
		almoxarife++;
	break;
	
	case 5:
		padeiro++;
	break;
	
	case 6:
		estagiario++;
		break;

}
		
	continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	}while(continuar == 0);
		
		String resultado = "N�mero de pessoas de cada sexo: ";
			   resultado+= "\nMasculino: "+masculino;
			   resultado+= "\nFeminino: "+feminino;
	JOptionPane.showMessageDialog(null, resultado);
	
	String resultado2 = "N�mero de pessoas de cada cargo: ";
	
		resultado2+= "\nGerente: "+gerente;
	    resultado2+= "\nAtendente: "+atendente;
	    resultado2+= "\nA�ougueiro: "+a�ougue;
	    resultado2+= "\nSecret�ria: "+secre;
	    resultado2+= "\nAlmoxarife: "+almoxarife;
	    resultado2+= "\nPadeiro: "+padeiro;
	    resultado2+= "\nEstagi�rio: "+estagiario;
	
	    JOptionPane.showMessageDialog(null, resultado2);
	
	    String resultado3 = "N�mero de pessoas maiores de 18 anos e menores de 18 anos: ";
	    resultado3+= "\nMaiores de 18: "+idade1;
	    resultado3+= "\nMenores de 18: "+idade2;
	    	
	    JOptionPane.showMessageDialog(null, resultado3);
	    
	}

}
