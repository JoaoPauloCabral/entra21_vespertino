package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

	public static void main(String[] args) {

		int limiteMinimo = 0;
		int limiteMaximo = 100;
		
		//Gerar rendom (Ira gerar um numero random quebrado)
		double gerarAleatorio = Math.random();
		
		//Atribuir um numero entre 0 e 10
		int numero = (int) Math.round(limiteMinimo + gerarAleatorio * limiteMaximo);
		int tentativa;
		int erro = 0;
		
		do {
			
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero como tentativa"));
			erro++;
		if(tentativa != numero) {
			
		
			
		if((numero - tentativa <= 10) && (numero - tentativa >= -10))  {
			JOptionPane.showMessageDialog(null, "Esta perto");
		}else if ((numero - tentativa > 10) && (numero - tentativa < -10) || (numero - tentativa <=20) && (numero - tentativa >= -20)) {
			JOptionPane.showMessageDialog(null, "Esta longe");
		}else if ((numero - tentativa > 20) || (numero - tentativa < -20)) {
			JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe");
		}
			
		}	
		}while(tentativa != numero);
	
		JOptionPane.showMessageDialog(null, "Precisou de " +erro+ " palpites");
		
		if(erro == 0) {
			JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca");
		}else if((erro > 0) && (erro <= 5)) {
			JOptionPane.showMessageDialog(null, "Parabens! Voce e bom em adivinhacao");
		}else if((erro > 5) && (erro <= 10)) {
			JOptionPane.showMessageDialog(null, "Muito Bom! Continue assim");
		}else if((erro > 10) && (erro <= 20)) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
		}else if(erro > 20) {
			JOptionPane.showMessageDialog(null, "Meio lerdo voce, hein?");
		}
	}

}
