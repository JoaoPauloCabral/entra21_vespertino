package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int acoes;
		
		//Variaveis do case 0
		String[] contato = new String[5];
		String[] nasc = new String [5];
		String[] estado = new String[5];
		String[] cidade = new String [5];
		String[] endereço = new String[5];
		String contato1;
		String[] tele = new String [5];
		String[] cel = new String[5];
		String[] mail = new String [5];		
		int indice = 0;
		
		//Variaveis do case 1
		String muda;
		String muda1;
		
		
		//Opções
		do{
		Object[] acoes1 = {"Cadastrar Contatos", "Alterar Contatos", "Excluir Contatos", "Pesquisar", "Sair"};
	
		
		acoes = JOptionPane.showOptionDialog(null, "Escolha uma ação", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, acoes1, 0);
		
		switch(acoes) {
			
		case 0:
			
		
			do {
			contato1 = JOptionPane.showInputDialog("Informe o nome do contato");
			}while ((contato1.equals(contato[0])) || (contato1.equals(contato[1])) || (contato1.equals(contato[2])) || (contato1.equals(contato[3])) || (contato1.equals(contato[4]))); 
		contato[indice] = contato1;
		nasc[indice] = JOptionPane.showInputDialog("Informe a data de nascimento (dd/mm/aaaa)");
		estado[indice] = JOptionPane.showInputDialog("Informe o estado de moradia do contato");
		cidade[indice] = JOptionPane.showInputDialog("Informe a cidade de moradia do contato");
		endereço[indice] = JOptionPane.showInputDialog("Informe o endereço do contato");
		tele[indice] = JOptionPane.showInputDialog("Informe número de telefone do contato");
		cel[indice] = JOptionPane.showInputDialog("Informe número de celular do contato");		
		mail[indice] = JOptionPane.showInputDialog("Informe o e-mail do contato");
		indice++;
		break;	
		
		case 1:
		
			muda = JOptionPane.showInputDialog("Informe o nome do contato que será alterado");
			for(byte i=0; i<5; i++) {
				if(muda.equals(contato[i]))  {
					int mudar = JOptionPane.showConfirmDialog(null, "Deseja alterar esse contato");
					switch(mudar) {
					case 0 :
						do {
							contato1 = JOptionPane.showInputDialog("Informe o novo nome do contato");
							}while ((contato1.equals(contato[0])) || (contato1.equals(contato[1])) || (contato1.equals(contato[2])) || (contato1.equals(contato[3])) || (contato1.equals(contato[4]))); 
						
						contato[indice] = contato1;
					nasc[i] = JOptionPane.showInputDialog("Informe a nova data de nascimento (dd/mm/aaaa)");
					estado[i] = JOptionPane.showInputDialog("Informe o novo estado de moradia do contato");
					cidade[i] = JOptionPane.showInputDialog("Informe a nova cidade de moradia do contato");
					endereço[i] = JOptionPane.showInputDialog("Informe o novo endereço do contato");
					tele[i] = JOptionPane.showInputDialog("Informe o novo número de telefone do contato");
					cel[i] = JOptionPane.showInputDialog("Informe o novo número de celular do contato");		
					mail[i] = JOptionPane.showInputDialog("Informe o novo e-mail do contato");
				break;
					}
					}
			}
			
			/*if(muda.equals(contato[0])) {
			muda1 =	JOptionPane.showInputDialog("Informe o novo nome");
			contato[0] = muda1;
			*/
			break;	
		
		case 2:
			muda1 = JOptionPane.showInputDialog("Escolha o contato que será excluído");
			for(byte i=0; i<5; i++) {
				if(muda1.equals(contato[i])) {
					int mudar1 = JOptionPane.showConfirmDialog(null, "Deseja excluir o contato " +contato[i]+ "?");
					switch (mudar1) {
					case 0:
					contato[i] = null;
					nasc[i] = null;
					estado[i] = null;
					cidade[i] = null;
					endereço[i] = null;
					tele[i] = null;
					cel[i] = null;		
					mail[i] = null;
					break;
					}
				}
			}
			
		break;	
		
		case 3:
		
			String muda2 = JOptionPane.showInputDialog("Nome do contato:");
			for(byte i=0; i<5; i++) {
				if(muda2.equals(contato[i])) {
					JOptionPane.showMessageDialog(null, "O nome do contato é " +contato[i]+
														"\nData de nascimento: " +nasc[i]+
														"\nUF: " +estado[i]+
														"\nCidade: " +cidade[i]+	
														"\nEndereço: " +endereço[i]+
														"\nNº Telefone: " +tele[i]+
														"\nNº Celular: " +cel[i]+
														"\nE-mail: " +mail[i]);
				
				}
			}
			
		break;	
		
		case 4:
			
		break;	
		
		
		
		
		}
	
		}while(acoes != 4);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
