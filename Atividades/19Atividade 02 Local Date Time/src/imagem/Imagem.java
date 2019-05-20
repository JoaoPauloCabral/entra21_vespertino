package imagem;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem {

	
	public JLabel ima() {
		
		String caminho = System.getProperty("user.dir")+"//src//imagemI//logo.png";
		
		//Ícone
		ImageIcon icone = new ImageIcon(caminho);
		
		// Barra de rolagem
		JLabel rotulo = new JLabel();
		rotulo.setIcon(icone);
		rotulo.setBounds(450, 17, 175, 175);
		
		return rotulo;
	}
}
