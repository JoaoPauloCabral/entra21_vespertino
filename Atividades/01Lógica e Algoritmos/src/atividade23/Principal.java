package atividade23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Altura"));
		double altura2 = altura*altura; 
		double imc = peso/altura2;
		
		if(imc > 40) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� com Obesidade III");
		
		}else if((imc > 35) && (imc < 39.99)) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� com Obesidade II");
		
		}else if((imc > 30) && (imc < 34.99)) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� com Obesidade I");
		
		}else if((imc > 25) && (imc < 29.99)) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� Acima do Peso");
		
		}else if((imc > 18.5) && (imc < 24.99)) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� Peso Normal");
		
		}else if((imc > 17) && (imc < 18.49)) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� Abaixo do Peso");
		
		}else if(imc < 17) {
			JOptionPane.showMessageDialog(null, "IMC de "+imc+ ", est� Muito Abaixo do Peso");
		}
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
