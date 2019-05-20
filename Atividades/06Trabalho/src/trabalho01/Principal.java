package trabalho01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		JFrame formulario = new JFrame(); 
		formulario.setTitle("Academia Virtual"); 					//Definir titulo
		formulario.setSize(1000, 600);  										//Definir tamanho
		formulario.setLocationRelativeTo(null); 							//Defiir localização
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Fechar totalmente ao ser finalizado
		formulario.setLayout(null);
		
		//e-Gym
		JLabel rotulo = new JLabel();
		rotulo.setBounds(0, 0, 500, 150);
		rotulo.setText("eGym");
		rotulo.setHorizontalAlignment(SwingConstants.CENTER);
		rotulo.setFont(new Font("Arial",Font.PLAIN,90));
		rotulo.setForeground(new Color(255, 136, 0));
		
		//Painel preto
		JPanel caixa01 = new JPanel();
		caixa01.setBounds(0, 0, 500, 150);
		caixa01.setBackground(new Color(0, 0 ,0));	
		caixa01.setLayout(null);
		caixa01.add(rotulo);
		caixa01.setVisible(true);
		
		//Botao de voltar a selecionar
		JButton botao1 = new JButton();
		botao1.setText("Selecione o Aluno");
		botao1.setBounds(520, 0, 475, 150);
		botao1.setBackground( new Color(240, 240, 240));
		botao1.setFont(new Font("Monospaced",Font.PLAIN,40));
		botao1.setForeground(new Color(255, 136, 0));
		
		//Primeiro Aluno
		JButton aluno = new JButton();
		aluno.setText("Dayara");
		aluno.setBounds(80, 275, 240, 150);
		aluno.setFont(new Font("Monospaced",Font.PLAIN,40));
		aluno.setBackground( new Color(240, 240, 240));
		aluno.setForeground(new Color(255, 136, 0));
		
		JLabel rotulo1 = new JLabel();
		rotulo1.setBounds(30, 150, 500, 50);
		rotulo1.setText("Aluno(a): Dayara da Silva Sauro");
		rotulo1.setFont(new Font("Arial",Font.PLAIN,30));
		rotulo1.setVisible(false);

		JLabel rotulo2 = new JLabel();
		rotulo2.setBounds(30, 185, 1000, 50);
		rotulo2.setText("Data de inicio do programa: 07/05/2017    |    Qtd de sessoes: 40");
		rotulo2.setFont(new Font("Arial",Font.PLAIN,30));
		rotulo2.setVisible(false);
		
		JLabel rotulo3 = new JLabel();
		rotulo3.setBounds(30, 225, 200, 50);
		rotulo3.setText("Instrutores:");
		rotulo3.setFont(new Font("Arial",Font.PLAIN,30));
		rotulo3.setVisible(false);
			
		JComboBox<String> professores = new JComboBox<String>();
		professores.setBounds(200, 235, 250, 50);
		professores.setFont(new Font("Arial",Font.PLAIN,30));
		professores.addItem("Jessica Parra");
		professores.addItem("Jose de Aquenlar");
		professores.addItem("Joao Breno");
		professores.addItem("Flar I Mal");	
		professores.setVisible(false);
		
		JLabel rotulo4 = new JLabel();
		rotulo4.setBounds(500, 225, 500, 50);
		rotulo4.setText("|     Peso corporal: 67.80");
		rotulo4.setFont(new Font("Arial",Font.PLAIN,30));
		rotulo4.setVisible(false);
		
		JLabel rotulo5 = new JLabel();
		rotulo5.setBounds(30, 280, 300, 50);
		rotulo5.setText("Periodizacao semanal:");
		rotulo5.setFont(new Font("Arial",Font.BOLD,20));
		rotulo5.setVisible(false);
		
		JLabel rotulo6 = new JLabel();
		rotulo6.setBounds(40, 305, 300, 50);
		rotulo6.setText("Segunda:");
		rotulo6.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo6.setVisible(false);
	
		JLabel rotulo7 = new JLabel();
		rotulo7.setBounds(180, 305, 300, 50);
		rotulo7.setText("Terca:");
		rotulo7.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo7.setVisible(false);
		
		JLabel rotulo8 = new JLabel();
		rotulo8.setBounds(320, 305, 300, 50);
		rotulo8.setText("Quarta:");
		rotulo8.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo8.setVisible(false);
		
		JLabel rotulo9 = new JLabel();
		rotulo9.setBounds(460, 305, 300, 50);
		rotulo9.setText("Quinta:");
		rotulo9.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo9.setVisible(false);
		
		JLabel rotulo10 = new JLabel();
		rotulo10.setBounds(600, 305, 300, 50);
		rotulo10.setText("Sexta:");
		rotulo10.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo10.setVisible(false);
		
		JLabel rotulo11 = new JLabel();
		rotulo11.setBounds(740, 305, 300, 50);
		rotulo11.setText("Sabado:");
		rotulo11.setFont(new Font("Arial",Font.ITALIC,20));
		rotulo11.setVisible(false);
		
		
		//Aulas aluno1 Segunda
		
		JComboBox<String> aulas = new JComboBox<String>();
		aulas.setBounds(40, 350, 130, 30);
		aulas.setFont(new Font("Arial",Font.PLAIN,25));
		aulas.addItem("Triceps");
		aulas.addItem("Biceps");
		aulas.addItem("Agachamento");
		aulas.addItem("Remadas");
		aulas.addItem("Barra Fixa");
		aulas.setVisible(false);
		
		JComboBox<String> aulas2 = new JComboBox<String>();
		aulas2.setBounds(40, 380, 130, 30);
		aulas2.setFont(new Font("Arial",Font.PLAIN,25));
		aulas2.addItem("Triceps");
		aulas2.addItem("Biceps");
		aulas2.addItem("Agachamento");
		aulas2.addItem("Remadas");
		aulas2.addItem("Barra Fixa");
		aulas2.setVisible(false);
		
		JComboBox<String> aulas3 = new JComboBox<String>();
		aulas3.setBounds(40, 410, 130, 30);
		aulas3.setFont(new Font("Arial",Font.PLAIN,25));
		aulas3.addItem("Triceps");
		aulas3.addItem("Biceps");
		aulas3.addItem("Agachamento");
		aulas3.addItem("Remadas");
		aulas3.addItem("Barra Fixa");
		aulas3.setVisible(false);
		
		//Aulas Terca
		
		JComboBox<String> aulas4 = new JComboBox<String>();
		aulas4.setBounds(180, 350, 130, 30);
		aulas4.setFont(new Font("Arial",Font.PLAIN,25));
		aulas4.addItem("Triceps");
		aulas4.addItem("Biceps");
		aulas4.addItem("Agachamento");
		aulas4.addItem("Remadas");
		aulas4.addItem("Barra Fixa");
		aulas4.setVisible(false);
		
		JComboBox<String> aulas5 = new JComboBox<String>();
		aulas5.setBounds(180, 380, 130, 30);
		aulas5.setFont(new Font("Arial",Font.PLAIN,25));
		aulas5.addItem("Triceps");
		aulas5.addItem("Biceps");
		aulas5.addItem("Agachamento");
		aulas5.addItem("Remadas,");
		aulas5.addItem("Barra Fixa");
		aulas5.setVisible(false);
		
		JComboBox<String> aulas6 = new JComboBox<String>();
		aulas6.setBounds(180, 410, 130, 30);
		aulas6.setFont(new Font("Arial",Font.PLAIN,25));
		aulas6.addItem("Triceps");
		aulas6.addItem("Biceps");
		aulas6.addItem("Agachamento");
		aulas6.addItem("Remadas");
		aulas6.addItem("Barra Fixa");
		aulas6.setVisible(false);
		
		
		//Aulas Quarta
		
		JComboBox<String> aulas7 = new JComboBox<String>();
		aulas7.setBounds(320, 350, 130, 30);
		aulas7.setFont(new Font("Arial",Font.PLAIN,25));
		aulas7.addItem("Triceps");
		aulas7.addItem("Biceps");
		aulas7.addItem("Agachamento");
		aulas7.addItem("Remadas");
		aulas7.addItem("Barra Fixa");
		aulas7.setVisible(false);
		
		JComboBox<String> aulas8 = new JComboBox<String>();
		aulas8.setBounds(320, 380, 130, 30);
		aulas8.setFont(new Font("Arial",Font.PLAIN,25));
		aulas8.addItem("Triceps");
		aulas8.addItem("Biceps");
		aulas8.addItem("Agachamento");
		aulas8.addItem("Remadas");
		aulas8.addItem("Barra Fixa");
		aulas8.setVisible(false);
		
		JComboBox<String> aulas9 = new JComboBox<String>();
		aulas9.setBounds(320, 410, 130, 30);
		aulas9.setFont(new Font("Arial",Font.PLAIN,25));
		aulas9.addItem("Triceps");
		aulas9.addItem("Biceps");
		aulas9.addItem("Agachamento");
		aulas9.addItem("Remadas");
		aulas9.addItem("Barra Fixa");
		aulas9.setVisible(false);
		
		//Aulas Quinta
		
		JComboBox<String> aulas10 = new JComboBox<String>();
		aulas10.setBounds(460, 350, 130, 30);
		aulas10.setFont(new Font("Arial",Font.PLAIN,25));
		aulas10.addItem("Triceps");
		aulas10.addItem("Biceps");
		aulas10.addItem("Agachamento");
		aulas10.addItem("Remadas");
		aulas10.addItem("Barra Fixa");
		aulas10.setVisible(false);
		
		JComboBox<String> aulas11 = new JComboBox<String>();
		aulas11.setBounds(460, 380, 130, 30);
		aulas11.setFont(new Font("Arial",Font.PLAIN,25));
		aulas11.addItem("Triceps");
		aulas11.addItem("Biceps");
		aulas11.addItem("Agachamento");
		aulas11.addItem("Remadas");
		aulas11.addItem("Barra Fixa");
		aulas11.setVisible(false);
		
		JComboBox<String> aulas12 = new JComboBox<String>();
		aulas12.setBounds(460, 410, 130, 30);
		aulas12.setFont(new Font("Arial",Font.PLAIN,25));
		aulas12.addItem("Triceps");
		aulas12.addItem("Biceps");
		aulas12.addItem("Agachamento");
		aulas12.addItem("Remadas");
		aulas12.addItem("Barra Fixa");
		aulas12.setVisible(false);
		
		//Aulas Sexta
		
		JComboBox<String> aulas13 = new JComboBox<String>();
		aulas13.setBounds(600, 350, 130, 30);
		aulas13.setFont(new Font("Arial",Font.PLAIN,25));
		aulas13.addItem("Triceps");
		aulas13.addItem("Biceps");
		aulas13.addItem("Agachamento");
		aulas13.addItem("Remadas");
		aulas13.addItem("Barra Fixa");
		aulas13.setVisible(false);
		
		JComboBox<String> aulas14 = new JComboBox<String>();
		aulas14.setBounds(600, 380, 130, 30);
		aulas14.setFont(new Font("Arial",Font.PLAIN,25));
		aulas14.addItem("Triceps");
		aulas14.addItem("Biceps");
		aulas14.addItem("Agachamento");
		aulas14.addItem("Remadas");
		aulas14.addItem("Barra Fixa");
		aulas14.setVisible(false);
		
		JComboBox<String> aulas15 = new JComboBox<String>();
		aulas15.setBounds(600, 410, 130, 30);
		aulas15.setFont(new Font("Arial",Font.PLAIN,25));
		aulas15.addItem("Triceps");
		aulas15.addItem("Biceps");
		aulas15.addItem("Agachamento");
		aulas15.addItem("Remadas");
		aulas15.addItem("Barra Fixa");
		aulas15.setVisible(false);
		
		//Aulas Sabado
		
		JComboBox<String> aulas16 = new JComboBox<String>();
		aulas16.setBounds(740, 350, 130, 30);
		aulas16.setFont(new Font("Arial",Font.PLAIN,25));
		aulas16.addItem("Triceps");
		aulas16.addItem("Biceps");
		aulas16.addItem("Agachamento");
		aulas16.addItem("Remadas");
		aulas16.addItem("Barra Fixa");
		aulas16.setVisible(false);
		
		JComboBox<String> aulas17 = new JComboBox<String>();
		aulas17.setBounds(740, 380, 130, 30);
		aulas17.setFont(new Font("Arial",Font.PLAIN,25));
		aulas17.addItem("Triceps");
		aulas17.addItem("Biceps");
		aulas17.addItem("Agachamento");
		aulas17.addItem("Remadas");
		aulas17.addItem("Barra Fixa");
		aulas17.setVisible(false);
		
		JComboBox<String> aulas18 = new JComboBox<String>();
		aulas18.setBounds(740, 410, 130, 30);
		aulas18.setFont(new Font("Arial",Font.PLAIN,25));
		aulas18.addItem("Triceps");
		aulas18.addItem("Biceps");
		aulas18.addItem("Agachamento");
		aulas18.addItem("Remadas");
		aulas18.addItem("Barra Fixa");
		aulas18.setVisible(false);
		
		//Observacoes
		
		JLabel rotulo12 = new JLabel();
		rotulo12.setBounds(20, 425, 100, 100);
		rotulo12.setText("Observacoes:");
		rotulo12.setFont(new Font("Arial",Font.BOLD,15));
		rotulo12.setVisible(false);
		
		JTextArea campo = new JTextArea();
		campo.setBounds(500, 500, 300, 250);
		JScrollPane barraRolagem = new JScrollPane(campo);
		barraRolagem.setBounds(20, 485, 950, 100);
		barraRolagem.setVisible(false);
		
		//Imprimir
		JButton botao2 = new JButton();
		botao2.setText("Imprimir Ficha");
		botao2.setBackground( new Color(240, 240, 240));
		botao2.setBounds(700, 600, 200, 50);
		botao2.setFont(new Font("Monospaced",Font.PLAIN,15));
		botao2.setVisible(false);
		
		
		//Segundo Aluno
				JButton aluno2 = new JButton();
				aluno2.setText("Vitor");
				aluno2.setBounds(365, 275, 240, 150);
				aluno2.setBackground( new Color(240, 240, 240));
				aluno2.setFont(new Font("Monospaced",Font.PLAIN,40));
				aluno2.setForeground(new Color(255, 136, 0));
				
				JLabel rotulo13 = new JLabel();
				rotulo13.setBounds(30, 150, 500, 50);
				rotulo13.setText("Aluno(a): Vitor Roberto Algo");
				rotulo13.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo13.setVisible(false);

				JLabel rotulo14 = new JLabel();
				rotulo14.setBounds(30, 185, 1000, 50);
				rotulo14.setText("Data de inicio do programa: 09/07/2018    |    Qtd de sessoes: 22");
				rotulo14.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo14.setVisible(false);
				
				JLabel rotulo15 = new JLabel();
				rotulo15.setBounds(30, 225, 200, 50);
				rotulo15.setText("Instrutores:");
				rotulo15.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo15.setVisible(false);
					
				JComboBox<String> professores2 = new JComboBox<String>();
				professores2.setBounds(200, 235, 250, 50);
				professores2.setFont(new Font("Arial",Font.PLAIN,30));
				professores2.addItem("Jessica Parra");
				professores2.addItem("Jose de Aquenlar");
				professores2.addItem("Joao Breno");
				professores2.addItem("Flar I Mal");	
				professores2.setVisible(false);
				
				JLabel rotulo16 = new JLabel();
				rotulo16.setBounds(500, 225, 500, 50);
				rotulo16.setText("|     Peso corporal: 82.24");
				rotulo16.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo16.setVisible(false);
				
				JLabel rotulo17 = new JLabel();
				rotulo17.setBounds(30, 280, 300, 50);
				rotulo17.setText("Periodizacao semanal:");
				rotulo17.setFont(new Font("Arial",Font.BOLD,20));
				rotulo17.setVisible(false);
				
				JLabel rotulo18 = new JLabel();
				rotulo18.setBounds(40, 305, 300, 50);
				rotulo18.setText("Segunda:");
				rotulo18.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo18.setVisible(false);
			
				JLabel rotulo19 = new JLabel();
				rotulo19.setBounds(180, 305, 300, 50);
				rotulo19.setText("Terca:");
				rotulo19.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo19.setVisible(false);
				
				JLabel rotulo20 = new JLabel();
				rotulo20.setBounds(320, 305, 300, 50);
				rotulo20.setText("Quarta:");
				rotulo20.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo20.setVisible(false);
				
				JLabel rotulo21 = new JLabel();
				rotulo21.setBounds(460, 305, 300, 50);
				rotulo21.setText("Quinta:");
				rotulo21.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo21.setVisible(false);
				
				JLabel rotulo22 = new JLabel();
				rotulo22.setBounds(600, 305, 300, 50);
				rotulo22.setText("Sexta:");
				rotulo22.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo22.setVisible(false);
				
				JLabel rotulo23 = new JLabel();
				rotulo23.setBounds(740, 305, 300, 50);
				rotulo23.setText("Sabado:");
				rotulo23.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo23.setVisible(false);
				
				
				//Aulas aluno2 Segunda
				
				JComboBox<String> aulas19 = new JComboBox<String>();
				aulas19.setBounds(40, 350, 130, 30);
				aulas19.setFont(new Font("Arial",Font.PLAIN,25));
				aulas19.addItem("Triceps");
				aulas19.addItem("Biceps");
				aulas19.addItem("Agachamento");
				aulas19.addItem("Remadas");
				aulas19.addItem("Barra Fixa");
				aulas19.setVisible(false);
				
				JComboBox<String> aulas20 = new JComboBox<String>();
				aulas20.setBounds(40, 380, 130, 30);
				aulas20.setFont(new Font("Arial",Font.PLAIN,25));
				aulas20.addItem("Triceps");
				aulas20.addItem("Biceps");
				aulas20.addItem("Agachamento");
				aulas20.addItem("Remadas");
				aulas20.addItem("Barra Fixa");
				aulas20.setVisible(false);
				
				JComboBox<String> aulas21 = new JComboBox<String>();
				aulas21.setBounds(40, 410, 130, 30);
				aulas21.setFont(new Font("Arial",Font.PLAIN,25));
				aulas21.addItem("Triceps");
				aulas21.addItem("Biceps");
				aulas21.addItem("Agachamento");
				aulas21.addItem("Remadas");
				aulas21.addItem("Barra Fixa");
				aulas21.setVisible(false);
				
				//Aulas Terca
				
				JComboBox<String> aulas22 = new JComboBox<String>();
				aulas22.setBounds(180, 350, 130, 30);
				aulas22.setFont(new Font("Arial",Font.PLAIN,25));
				aulas22.addItem("Triceps");
				aulas22.addItem("Biceps");
				aulas22.addItem("Agachamento");
				aulas22.addItem("Remadas");
				aulas22.addItem("Barra Fixa");
				aulas22.setVisible(false);
				
				JComboBox<String> aulas23 = new JComboBox<String>();
				aulas23.setBounds(180, 380, 130, 30);
				aulas23.setFont(new Font("Arial",Font.PLAIN,25));
				aulas23.addItem("Triceps");
				aulas23.addItem("Biceps");
				aulas23.addItem("Agachamento");
				aulas23.addItem("Remadas,");
				aulas23.addItem("Barra Fixa");
				aulas23.setVisible(false);
				
				JComboBox<String> aulas24 = new JComboBox<String>();
				aulas24.setBounds(180, 410, 130, 30);
				aulas24.setFont(new Font("Arial",Font.PLAIN,25));
				aulas24.addItem("Triceps");
				aulas24.addItem("Biceps");
				aulas24.addItem("Agachamento");
				aulas24.addItem("Remadas");
				aulas24.addItem("Barra Fixa");
				aulas24.setVisible(false);
				
				
				//Aulas Quarta
				
				JComboBox<String> aulas25 = new JComboBox<String>();
				aulas25.setBounds(320, 350, 130, 30);
				aulas25.setFont(new Font("Arial",Font.PLAIN,25));
				aulas25.addItem("Triceps");
				aulas25.addItem("Biceps");
				aulas25.addItem("Agachamento");
				aulas25.addItem("Remadas");
				aulas25.addItem("Barra Fixa");
				aulas25.setVisible(false);
				
				JComboBox<String> aulas26 = new JComboBox<String>();
				aulas26.setBounds(320, 380, 130, 30);
				aulas26.setFont(new Font("Arial",Font.PLAIN,25));
				aulas26.addItem("Triceps");
				aulas26.addItem("Biceps");
				aulas26.addItem("Agachamento");
				aulas26.addItem("Remadas");
				aulas26.addItem("Barra Fixa");
				aulas26.setVisible(false);
				
				JComboBox<String> aulas27 = new JComboBox<String>();
				aulas27.setBounds(320, 410, 130, 30);
				aulas27.setFont(new Font("Arial",Font.PLAIN,25));
				aulas27.addItem("Triceps");
				aulas27.addItem("Biceps");
				aulas27.addItem("Agachamento");
				aulas27.addItem("Remadas");
				aulas27.addItem("Barra Fixa");
				aulas27.setVisible(false);
				
				//Aulas Quinta
				
				JComboBox<String> aulas28 = new JComboBox<String>();
				aulas28.setBounds(460, 350, 130, 30);
				aulas28.setFont(new Font("Arial",Font.PLAIN,25));
				aulas28.addItem("Triceps");
				aulas28.addItem("Biceps");
				aulas28.addItem("Agachamento");
				aulas28.addItem("Remadas");
				aulas28.addItem("Barra Fixa");
				aulas28.setVisible(false);
				
				JComboBox<String> aulas29 = new JComboBox<String>();
				aulas29.setBounds(460, 380, 130, 30);
				aulas29.setFont(new Font("Arial",Font.PLAIN,25));
				aulas29.addItem("Triceps");
				aulas29.addItem("Biceps");
				aulas29.addItem("Agachamento");
				aulas29.addItem("Remadas");
				aulas29.addItem("Barra Fixa");
				aulas29.setVisible(false);
				
				JComboBox<String> aulas30 = new JComboBox<String>();
				aulas30.setBounds(460, 410, 130, 30);
				aulas30.setFont(new Font("Arial",Font.PLAIN,25));
				aulas30.addItem("Triceps");
				aulas30.addItem("Biceps");
				aulas30.addItem("Agachamento");
				aulas30.addItem("Remadas");
				aulas30.addItem("Barra Fixa");
				aulas30.setVisible(false);
				
				//Aulas Sexta
				
				JComboBox<String> aulas31 = new JComboBox<String>();
				aulas31.setBounds(600, 350, 130, 30);
				aulas31.setFont(new Font("Arial",Font.PLAIN,25));
				aulas31.addItem("Triceps");
				aulas31.addItem("Biceps");
				aulas31.addItem("Agachamento");
				aulas31.addItem("Remadas");
				aulas31.addItem("Barra Fixa");
				aulas31.setVisible(false);
				
				JComboBox<String> aulas32 = new JComboBox<String>();
				aulas32.setBounds(600, 380, 130, 30);
				aulas32.setFont(new Font("Arial",Font.PLAIN,25));
				aulas32.addItem("Triceps");
				aulas32.addItem("Biceps");
				aulas32.addItem("Agachamento");
				aulas32.addItem("Remadas");
				aulas32.addItem("Barra Fixa");
				aulas32.setVisible(false);
				
				JComboBox<String> aulas33 = new JComboBox<String>();
				aulas33.setBounds(600, 410, 130, 30);
				aulas33.setFont(new Font("Arial",Font.PLAIN,25));
				aulas33.addItem("Triceps");
				aulas33.addItem("Biceps");
				aulas33.addItem("Agachamento");
				aulas33.addItem("Remadas");
				aulas33.addItem("Barra Fixa");
				aulas33.setVisible(false);
				
				//Aulas Sabado
				
				JComboBox<String> aulas34 = new JComboBox<String>();
				aulas34.setBounds(740, 350, 130, 30);
				aulas34.setFont(new Font("Arial",Font.PLAIN,25));
				aulas34.addItem("Triceps");
				aulas34.addItem("Biceps");
				aulas34.addItem("Agachamento");
				aulas34.addItem("Remadas");
				aulas34.addItem("Barra Fixa");
				aulas34.setVisible(false);
				
				JComboBox<String> aulas35 = new JComboBox<String>();
				aulas35.setBounds(740, 380, 130, 30);
				aulas35.setFont(new Font("Arial",Font.PLAIN,25));
				aulas35.addItem("Triceps");
				aulas35.addItem("Biceps");
				aulas35.addItem("Agachamento");
				aulas35.addItem("Remadas");
				aulas35.addItem("Barra Fixa");
				aulas35.setVisible(false);
				
				JComboBox<String> aulas36 = new JComboBox<String>();
				aulas36.setBounds(740, 410, 130, 30);
				aulas36.setFont(new Font("Arial",Font.PLAIN,25));
				aulas36.addItem("Triceps");
				aulas36.addItem("Biceps");
				aulas36.addItem("Agachamento");
				aulas36.addItem("Remadas");
				aulas36.addItem("Barra Fixa");
				aulas36.setVisible(false);
				
				//Observacoes
				
				JLabel rotulo24 = new JLabel();
				rotulo24.setBounds(20, 425, 100, 100);
				rotulo24.setText("Observacoes:");
				rotulo24.setFont(new Font("Arial",Font.BOLD,15));
				rotulo24.setVisible(false);
				
				JTextArea campo2 = new JTextArea();
				campo2.setBounds(500, 500, 300, 250);
				JScrollPane barraRolagem2 = new JScrollPane(campo2);
				barraRolagem2.setBounds(20, 485, 950, 100);
				barraRolagem2.setVisible(false);
				
				//Imprimir
				JButton botao3 = new JButton();
				botao3.setText("Imprimir Ficha");
				botao3.setBounds(700, 600, 200, 50);
				botao3.setBackground( new Color(240, 240, 240));
				botao3.setFont(new Font("Monospaced",Font.PLAIN,15));
				botao3.setVisible(false);
				
				
				//Terceiro Aluno
				JButton aluno3 = new JButton();
				aluno3.setText("Ana");
				aluno3.setBounds(655, 275, 240, 150);
				aluno3.setFont(new Font("Monospaced",Font.PLAIN,40));
				aluno3.setBackground( new Color(240, 240, 240));
				aluno3.setForeground(new Color(255, 136, 0));
		
				JLabel rotulo25 = new JLabel();
				rotulo25.setBounds(30, 150, 500, 50);
				rotulo25.setText("Aluno(a): Ana Paula Traz");
				rotulo25.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo25.setVisible(false);

				JLabel rotulo26 = new JLabel();
				rotulo26.setBounds(30, 185, 1000, 50);
				rotulo26.setText("Data de inicio do programa: 24/11/2015    |    Qtd de sessoes: 124");
				rotulo26.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo26.setVisible(false);
				
				JLabel rotulo27 = new JLabel();
				rotulo27.setBounds(30, 225, 200, 50);
				rotulo27.setText("Instrutores:");
				rotulo27.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo27.setVisible(false);
					
				JComboBox<String> professores3 = new JComboBox<String>();
				professores3.setBounds(200, 235, 250, 50);
				professores3.setFont(new Font("Arial",Font.PLAIN,30));
				professores3.addItem("Jessica Parra");
				professores3.addItem("Jose de Aquenlar");
				professores3.addItem("Joao Breno");
				professores3.addItem("Flar I Mal");	
				professores3.setVisible(false);
				
				JLabel rotulo28 = new JLabel();
				rotulo28.setBounds(500, 225, 500, 50);
				rotulo28.setText("|     Peso corporal: 51.97");
				rotulo28.setFont(new Font("Arial",Font.PLAIN,30));
				rotulo28.setVisible(false);
				
				JLabel rotulo29 = new JLabel();
				rotulo29.setBounds(30, 280, 300, 50);
				rotulo29.setText("Periodizacao semanal:");
				rotulo29.setFont(new Font("Arial",Font.BOLD,20));
				rotulo29.setVisible(false);
				
				JLabel rotulo30 = new JLabel();
				rotulo30.setBounds(40, 305, 300, 50);
				rotulo30.setText("Segunda:");
				rotulo30.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo30.setVisible(false);
			
				JLabel rotulo31 = new JLabel();
				rotulo31.setBounds(180, 305, 300, 50);
				rotulo31.setText("Terca:");
				rotulo31.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo31.setVisible(false);
				
				JLabel rotulo32 = new JLabel();
				rotulo32.setBounds(320, 305, 300, 50);
				rotulo32.setText("Quarta:");
				rotulo32.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo32.setVisible(false);
				
				JLabel rotulo33 = new JLabel();
				rotulo33.setBounds(460, 305, 300, 50);
				rotulo33.setText("Quinta:");
				rotulo33.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo33.setVisible(false);
				
				JLabel rotulo34 = new JLabel();
				rotulo34.setBounds(600, 305, 300, 50);
				rotulo34.setText("Sexta:");
				rotulo34.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo34.setVisible(false);
				
				JLabel rotulo35 = new JLabel();
				rotulo35.setBounds(740, 305, 300, 50);
				rotulo35.setText("Sabado:");
				rotulo35.setFont(new Font("Arial",Font.ITALIC,20));
				rotulo35.setVisible(false);
				
				
				//Aulas aluno3 Segunda
				
				JComboBox<String> aulas37 = new JComboBox<String>();
				aulas37.setBounds(40, 350, 130, 30);
				aulas37.setFont(new Font("Arial",Font.PLAIN,25));
				aulas37.addItem("Triceps");
				aulas37.addItem("Biceps");
				aulas37.addItem("Agachamento");
				aulas37.addItem("Remadas");
				aulas37.addItem("Barra Fixa");
				aulas37.setVisible(false);
				
				JComboBox<String> aulas38 = new JComboBox<String>();
				aulas38.setBounds(40, 380, 130, 30);
				aulas38.setFont(new Font("Arial",Font.PLAIN,25));
				aulas38.addItem("Triceps");
				aulas38.addItem("Biceps");
				aulas38.addItem("Agachamento");
				aulas38.addItem("Remadas");
				aulas38.addItem("Barra Fixa");
				aulas38.setVisible(false);
				
				JComboBox<String> aulas39 = new JComboBox<String>();
				aulas39.setBounds(40, 410, 130, 30);
				aulas39.setFont(new Font("Arial",Font.PLAIN,25));
				aulas39.addItem("Triceps");
				aulas39.addItem("Biceps");
				aulas39.addItem("Agachamento");
				aulas39.addItem("Remadas");
				aulas39.addItem("Barra Fixa");
				aulas39.setVisible(false);
				
				//Aulas Terca
				
				JComboBox<String> aulas40 = new JComboBox<String>();
				aulas40.setBounds(180, 350, 130, 30);
				aulas40.setFont(new Font("Arial",Font.PLAIN,25));
				aulas40.addItem("Triceps");
				aulas40.addItem("Biceps");
				aulas40.addItem("Agachamento");
				aulas40.addItem("Remadas");
				aulas40.addItem("Barra Fixa");
				aulas40.setVisible(false);
				
				JComboBox<String> aulas41 = new JComboBox<String>();
				aulas41.setBounds(180, 380, 130, 30);
				aulas41.setFont(new Font("Arial",Font.PLAIN,25));
				aulas41.addItem("Triceps");
				aulas41.addItem("Biceps");
				aulas41.addItem("Agachamento");
				aulas41.addItem("Remadas,");
				aulas41.addItem("Barra Fixa");
				aulas41.setVisible(false);
				
				JComboBox<String> aulas42 = new JComboBox<String>();
				aulas42.setBounds(180, 410, 130, 30);
				aulas42.setFont(new Font("Arial",Font.PLAIN,25));
				aulas42.addItem("Triceps");
				aulas42.addItem("Biceps");
				aulas42.addItem("Agachamento");
				aulas42.addItem("Remadas");
				aulas42.addItem("Barra Fixa");
				aulas42.setVisible(false);
				
				
				//Aulas Quarta
				
				JComboBox<String> aulas43 = new JComboBox<String>();
				aulas43.setBounds(320, 350, 130, 30);
				aulas43.setFont(new Font("Arial",Font.PLAIN,25));
				aulas43.addItem("Triceps");
				aulas43.addItem("Biceps");
				aulas43.addItem("Agachamento");
				aulas43.addItem("Remadas");
				aulas43.addItem("Barra Fixa");
				aulas43.setVisible(false);
				
				JComboBox<String> aulas44 = new JComboBox<String>();
				aulas44.setBounds(320, 380, 130, 30);
				aulas44.setFont(new Font("Arial",Font.PLAIN,25));
				aulas44.addItem("Triceps");
				aulas44.addItem("Biceps");
				aulas44.addItem("Agachamento");
				aulas44.addItem("Remadas");
				aulas44.addItem("Barra Fixa");
				aulas44.setVisible(false);
				
				JComboBox<String> aulas45 = new JComboBox<String>();
				aulas45.setBounds(320, 410, 130, 30);
				aulas45.setFont(new Font("Arial",Font.PLAIN,25));
				aulas45.addItem("Triceps");
				aulas45.addItem("Biceps");
				aulas45.addItem("Agachamento");
				aulas45.addItem("Remadas");
				aulas45.addItem("Barra Fixa");
				aulas45.setVisible(false);
				
				//Aulas Quinta
				
				JComboBox<String> aulas46 = new JComboBox<String>();
				aulas46.setBounds(460, 350, 130, 30);
				aulas46.setFont(new Font("Arial",Font.PLAIN,25));
				aulas46.addItem("Triceps");
				aulas46.addItem("Biceps");
				aulas46.addItem("Agachamento");
				aulas46.addItem("Remadas");
				aulas46.addItem("Barra Fixa");
				aulas46.setVisible(false);
				
				JComboBox<String> aulas47 = new JComboBox<String>();
				aulas47.setBounds(460, 380, 130, 30);
				aulas47.setFont(new Font("Arial",Font.PLAIN,25));
				aulas47.addItem("Triceps");
				aulas47.addItem("Biceps");
				aulas47.addItem("Agachamento");
				aulas47.addItem("Remadas");
				aulas47.addItem("Barra Fixa");
				aulas47.setVisible(false);
				
				JComboBox<String> aulas48 = new JComboBox<String>();
				aulas48.setBounds(460, 410, 130, 30);
				aulas48.setFont(new Font("Arial",Font.PLAIN,25));
				aulas48.addItem("Triceps");
				aulas48.addItem("Biceps");
				aulas48.addItem("Agachamento");
				aulas48.addItem("Remadas");
				aulas48.addItem("Barra Fixa");
				aulas48.setVisible(false);
				
				//Aulas Sexta
				
				JComboBox<String> aulas49 = new JComboBox<String>();
				aulas49.setBounds(600, 350, 130, 30);
				aulas49.setFont(new Font("Arial",Font.PLAIN,25));
				aulas49.addItem("Triceps");
				aulas49.addItem("Biceps");
				aulas49.addItem("Agachamento");
				aulas49.addItem("Remadas");
				aulas49.addItem("Barra Fixa");
				aulas49.setVisible(false);
				
				JComboBox<String> aulas50 = new JComboBox<String>();
				aulas50.setBounds(600, 380, 130, 30);
				aulas50.setFont(new Font("Arial",Font.PLAIN,25));
				aulas50.addItem("Triceps");
				aulas50.addItem("Biceps");
				aulas50.addItem("Agachamento");
				aulas50.addItem("Remadas");
				aulas50.addItem("Barra Fixa");
				aulas50.setVisible(false);
				
				JComboBox<String> aulas51 = new JComboBox<String>();
				aulas51.setBounds(600, 410, 130, 30);
				aulas51.setFont(new Font("Arial",Font.PLAIN,25));
				aulas51.addItem("Triceps");
				aulas51.addItem("Biceps");
				aulas51.addItem("Agachamento");
				aulas51.addItem("Remadas");
				aulas51.addItem("Barra Fixa");
				aulas51.setVisible(false);
				
				//Aulas Sabado
				
				JComboBox<String> aulas52 = new JComboBox<String>();
				aulas52.setBounds(740, 350, 130, 30);
				aulas52.setFont(new Font("Arial",Font.PLAIN,25));
				aulas52.addItem("Triceps");
				aulas52.addItem("Biceps");
				aulas52.addItem("Agachamento");
				aulas52.addItem("Remadas");
				aulas52.addItem("Barra Fixa");
				aulas52.setVisible(false);
				
				JComboBox<String> aulas53 = new JComboBox<String>();
				aulas53.setBounds(740, 380, 130, 30);
				aulas53.setFont(new Font("Arial",Font.PLAIN,25));
				aulas53.addItem("Triceps");
				aulas53.addItem("Biceps");
				aulas53.addItem("Agachamento");
				aulas53.addItem("Remadas");
				aulas53.addItem("Barra Fixa");
				aulas53.setVisible(false);
				
				JComboBox<String> aulas54 = new JComboBox<String>();
				aulas54.setBounds(740, 410, 130, 30);
				aulas54.setFont(new Font("Arial",Font.PLAIN,25));
				aulas54.addItem("Triceps");
				aulas54.addItem("Biceps");
				aulas54.addItem("Agachamento");
				aulas54.addItem("Remadas");
				aulas54.addItem("Barra Fixa");
				aulas54.setVisible(false);
				
				//Observacoes
				
				JLabel rotulo36 = new JLabel();
				rotulo36.setBounds(20, 425, 100, 100);
				rotulo36.setText("Observacoes:");
				rotulo36.setFont(new Font("Arial",Font.BOLD,15));
				rotulo36.setVisible(false);
				
				JTextArea campo3 = new JTextArea();
				campo3.setBounds(500, 500, 300, 250);
				JScrollPane barraRolagem3 = new JScrollPane(campo3);
				barraRolagem3.setBounds(20, 485, 950, 100);
				barraRolagem3.setVisible(false);
				
				//Imprimir
				JButton botao4 = new JButton();
				botao4.setText("Imprimir Ficha");
				botao4.setBounds(700, 600, 200, 50);
				botao4.setFont(new Font("Monospaced",Font.PLAIN,15));
				botao4.setBackground( new Color(240, 240, 240));
				botao4.setVisible(false);
				
				
		//Acao do aluno 1-----------------------------------------------------------------	-	
				
				aluno.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						formulario.setSize(1000, 700);
						
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo1.setVisible(true);
						rotulo2.setVisible(true);
						professores.setVisible(true);
						rotulo3.setVisible(true);
						rotulo4.setVisible(true);
						rotulo5.setVisible(true);
						rotulo6.setVisible(true);
						rotulo7.setVisible(true);
						rotulo8.setVisible(true);
						rotulo9.setVisible(true);
						rotulo10.setVisible(true);
						rotulo11.setVisible(true);
						
						aulas.setVisible(true);
						aulas2.setVisible(true);
						aulas3.setVisible(true);
						aulas4.setVisible(true);
						aulas5.setVisible(true);
						aulas6.setVisible(true);
						aulas7.setVisible(true);
						aulas8.setVisible(true);
						aulas9.setVisible(true);
						aulas10.setVisible(true);
						aulas11.setVisible(true);
						aulas12.setVisible(true);
						aulas13.setVisible(true);
						aulas14.setVisible(true);
						aulas15.setVisible(true);
						aulas16.setVisible(true);
						aulas17.setVisible(true);
						aulas18.setVisible(true);
		
						barraRolagem.setVisible(true);
						rotulo12.setVisible(true);
						botao2.setVisible(true);
						
						
					//Botao2 = imprimir
						
						botao2.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								String pro = (String) professores.getSelectedItem();
								
								String valor = (String) aulas.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor2 = (String) aulas2.getSelectedItem();
								String valor3= (String) aulas3.getSelectedItem(); 
								String valor4 = (String) aulas4.getSelectedItem(); 
								String valor5= (String) aulas5.getSelectedItem(); 
								String valor6= (String) aulas6.getSelectedItem();
								String valor7= (String) aulas7.getSelectedItem(); 
								String valor8= (String) aulas8.getSelectedItem();
								String valor9= (String) aulas9.getSelectedItem(); 
								String valor10= (String) aulas10.getSelectedItem(); 
								String valor11 = (String) aulas11.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor12 = (String) aulas12.getSelectedItem();
								String valor13= (String) aulas13.getSelectedItem(); 
								String valor14 = (String) aulas14.getSelectedItem(); 
								String valor15= (String) aulas15.getSelectedItem(); 
								String valor16= (String) aulas16.getSelectedItem();
								String valor17= (String) aulas17.getSelectedItem(); 
								String valor18= (String) aulas18.getSelectedItem();
								
								String texto = campo.getText();
								
								//Exibir o valor
							
								JOptionPane.showMessageDialog(null,"Aluno(a): Dayara da Silva Sauro"+
										 						   "\nData de inicio do programa: 07/05/2017   |   Qtd De sessoes: 40"+
										 						   "\n\nInstrutores: "+pro+ "   |   Peso corporal: 67,80"+
																   "\n\nPeriodizacao semanal:"+
										          				   "\nSEGUNDA:   |   TERCA:   |   QUARTA:   |   QUINTA:   |   SEXTA:   |   SABADO:		"+	
																   "\n"+valor+"            "+valor4+"            "+valor7+"            "+valor10+"            "+valor13+"            "+valor16+
																   "\n"+valor2+"           "+valor5+"            "+valor8+"            "+valor11+"            "+valor14+"            "+valor17+
																   "\n"+valor3+"           "+valor6+"            "+valor9+"            "+valor12+"            "+valor15+"            "+valor18+											
																   "\n\nObservacoes:"+
																   "\n"+texto);
							
							}
						});
						
						
						
						//Acao aluno 2 no 1				
						  
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo13.setVisible(false);
						rotulo14.setVisible(false);
						professores2.setVisible(false);
						rotulo15.setVisible(false);
						rotulo16.setVisible(false);
						rotulo17.setVisible(false);
						rotulo18.setVisible(false);
						rotulo19.setVisible(false);
						rotulo20.setVisible(false);
						rotulo21.setVisible(false);
						rotulo22.setVisible(false);
						rotulo23.setVisible(false);
						
						aulas19.setVisible(false);
						aulas20.setVisible(false);
						aulas21.setVisible(false);
						aulas22.setVisible(false);
						aulas23.setVisible(false);
						aulas24.setVisible(false);
						aulas25.setVisible(false);
						aulas26.setVisible(false);
						aulas27.setVisible(false);
						aulas28.setVisible(false);
						aulas29.setVisible(false);
						aulas30.setVisible(false);
						aulas31.setVisible(false);
						aulas32.setVisible(false);
						aulas33.setVisible(false);
						aulas34.setVisible(false);
						aulas35.setVisible(false);
						aulas36.setVisible(false);
		
						barraRolagem2.setVisible(false);
						rotulo24.setVisible(false);
						botao3.setVisible(false);
					
					
					
					
					
						//Acao aluno 3 no 1
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo25.setVisible(false);
						rotulo26.setVisible(false);
						professores3.setVisible(false);
						rotulo27.setVisible(false);
						rotulo28.setVisible(false);
						rotulo29.setVisible(false);
						rotulo30.setVisible(false);
						rotulo31.setVisible(false);
						rotulo32.setVisible(false);
						rotulo33.setVisible(false);
						rotulo34.setVisible(false);
						rotulo35.setVisible(false);
						
						
						aulas37.setVisible(false);
						aulas38.setVisible(false);
						aulas39.setVisible(false);
						aulas40.setVisible(false);
						aulas41.setVisible(false);
						aulas42.setVisible(false);
						aulas43.setVisible(false);
						aulas44.setVisible(false);
						aulas45.setVisible(false);
						aulas46.setVisible(false);
						aulas47.setVisible(false);
						aulas48.setVisible(false);
						aulas49.setVisible(false);
						aulas50.setVisible(false);
						aulas51.setVisible(false);
						aulas52.setVisible(false);
						aulas53.setVisible(false);
						aulas54.setVisible(false);
						
						rotulo36.setVisible(false);
						barraRolagem3.setVisible(false);					
						botao4.setVisible(false);
					
			
					
					}
				});
				
				//Acao do aluno 2------------------------------------------------------------------------		
				
				aluno2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
						formulario.setSize(1000, 700);
						
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo13.setVisible(true);
						rotulo14.setVisible(true);
						professores2.setVisible(true);
						rotulo15.setVisible(true);
						rotulo16.setVisible(true);
						rotulo17.setVisible(true);
						rotulo18.setVisible(true);
						rotulo19.setVisible(true);
						rotulo20.setVisible(true);
						rotulo21.setVisible(true);
						rotulo22.setVisible(true);
						rotulo23.setVisible(true);
						
						aulas19.setVisible(true);
						aulas20.setVisible(true);
						aulas21.setVisible(true);
						aulas22.setVisible(true);
						aulas23.setVisible(true);
						aulas24.setVisible(true);
						aulas25.setVisible(true);
						aulas26.setVisible(true);
						aulas27.setVisible(true);
						aulas28.setVisible(true);
						aulas29.setVisible(true);
						aulas30.setVisible(true);
						aulas31.setVisible(true);
						aulas32.setVisible(true);
						aulas33.setVisible(true);
						aulas34.setVisible(true);
						aulas35.setVisible(true);
						aulas36.setVisible(true);
		
						barraRolagem2.setVisible(true);
						rotulo24.setVisible(true);
						botao3.setVisible(true);
						
						
					//Botao de imprimir
						
						botao3.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								String pro2 = (String) professores2.getSelectedItem();
								
								String valor19 = (String) aulas19.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor20 = (String) aulas20.getSelectedItem();
								String valor21= (String) aulas21.getSelectedItem(); 
								String valor22 = (String) aulas22.getSelectedItem(); 
								String valor23= (String) aulas23.getSelectedItem(); 
								String valor24= (String) aulas24.getSelectedItem();
								String valor25= (String) aulas25.getSelectedItem(); 
								String valor26= (String) aulas26.getSelectedItem();
								String valor27= (String) aulas27.getSelectedItem(); 
								String valor28= (String) aulas28.getSelectedItem(); 
								String valor29 = (String) aulas29.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor30 = (String) aulas30.getSelectedItem();
								String valor31= (String) aulas31.getSelectedItem(); 
								String valor32 = (String) aulas32.getSelectedItem(); 
								String valor33= (String) aulas33.getSelectedItem(); 
								String valor34= (String) aulas34.getSelectedItem();
								String valor35= (String) aulas35.getSelectedItem(); 
								String valor36= (String) aulas36.getSelectedItem();
								
								String texto2 = campo2.getText(); 
								
								//Exibir o valor
								JOptionPane.showMessageDialog(null,"Aluno(a): Vitor Roberto Algo"
										+ 						   "\nData de inicio do programa: 07/05/2017   |   Qtd De sessoes: 40"
										+ 						   "\n\nInstrutores: "+pro2+ "   |   Peso corporal: 67,80"
										+						   "\n\nPeriodizacao semanal:"
										+          				   "\nSEGUNDA:   |   TERCA:   |   QUARTA:   |   QUINTA:   |   SEXTA:   |   SABADO:		"	
										+						   "\n"+valor19+"            "+valor22+"            "+valor25+"            "+valor28+"            "+valor31+"            "+valor34+
																   "\n"+valor20+"           "+valor23+"            "+valor26+"            "+valor29+"            "+valor32+"            "+valor35+
																   "\n"+valor21+"           "+valor24+"            "+valor27+"            "+valor30+"            "+valor33+"            "+valor36+											
																   "\n\nObservacoes:"
										+						   "\n"+texto2);
						
							}
						});
						
			//Acao aluno 1 no 2					
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo1.setVisible(false);
						rotulo2.setVisible(false);
						professores.setVisible(false);
						rotulo3.setVisible(false);
						rotulo4.setVisible(false);
						rotulo5.setVisible(false);
						rotulo6.setVisible(false);
						rotulo7.setVisible(false);
						rotulo8.setVisible(false);
						rotulo9.setVisible(false);
						rotulo10.setVisible(false);
						rotulo11.setVisible(false);
						
						aulas.setVisible(false);
						aulas2.setVisible(false);
						aulas3.setVisible(false);
						aulas4.setVisible(false);
						aulas5.setVisible(false);
						aulas6.setVisible(false);
						aulas7.setVisible(false);
						aulas8.setVisible(false);
						aulas9.setVisible(false);
						aulas10.setVisible(false);
						aulas11.setVisible(false);
						aulas12.setVisible(false);
						aulas13.setVisible(false);
						aulas14.setVisible(false);
						aulas15.setVisible(false);
						aulas16.setVisible(false);
						aulas17.setVisible(false);
						aulas18.setVisible(false);
					
						barraRolagem.setVisible(false);
						rotulo12.setVisible(false);
						botao2.setVisible(false);
					
			//Acao aluno 3 no 2
						
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo25.setVisible(false);
						rotulo26.setVisible(false);
						professores3.setVisible(false);
						rotulo27.setVisible(false);
						rotulo28.setVisible(false);
						rotulo29.setVisible(false);
						rotulo30.setVisible(false);
						rotulo31.setVisible(false);
						rotulo32.setVisible(false);
						rotulo33.setVisible(false);
						rotulo34.setVisible(false);
						rotulo35.setVisible(false);
						
						aulas37.setVisible(false);
						aulas38.setVisible(false);
						aulas39.setVisible(false);
						aulas40.setVisible(false);
						aulas41.setVisible(false);
						aulas42.setVisible(false);
						aulas43.setVisible(false);
						aulas44.setVisible(false);
						aulas45.setVisible(false);
						aulas46.setVisible(false);
						aulas47.setVisible(false);
						aulas48.setVisible(false);
						aulas49.setVisible(false);
						aulas50.setVisible(false);
						aulas51.setVisible(false);
						aulas52.setVisible(false);
						aulas53.setVisible(false);
						aulas54.setVisible(false);
		
						barraRolagem3.setVisible(false);
						rotulo36.setVisible(false);
						
					
				
						//------------------------------------------
					
		
					
					
					}
				});
				
				//Acao do aluno 3		
				
				aluno3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
		
						formulario.setSize(1000, 700);
						
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo25.setVisible(true);
						rotulo26.setVisible(true);
						professores3.setVisible(true);
						rotulo27.setVisible(true);
						rotulo28.setVisible(true);
						rotulo29.setVisible(true);
						rotulo30.setVisible(true);
						rotulo31.setVisible(true);
						rotulo32.setVisible(true);
						rotulo33.setVisible(true);
						rotulo34.setVisible(true);
						rotulo35.setVisible(true);
						
						
						aulas37.setVisible(true);
						aulas38.setVisible(true);
						aulas39.setVisible(true);
						aulas40.setVisible(true);
						aulas41.setVisible(true);
						aulas42.setVisible(true);
						aulas43.setVisible(true);
						aulas44.setVisible(true);
						aulas45.setVisible(true);
						aulas46.setVisible(true);
						aulas47.setVisible(true);
						aulas48.setVisible(true);
						aulas49.setVisible(true);
						aulas50.setVisible(true);
						aulas51.setVisible(true);
						aulas52.setVisible(true);
						aulas53.setVisible(true);
						aulas54.setVisible(true);
		
						barraRolagem3.setVisible(true);
						rotulo36.setVisible(true);
						botao4.setVisible(true);
						botao4.setEnabled(true);
					//Botao de imprimir
						
						botao4.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								String pro3 = (String) professores3.getSelectedItem();
								
								String valor37 = (String) aulas37.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor38 = (String) aulas38.getSelectedItem();
								String valor39= (String) aulas39.getSelectedItem(); 
								String valor40 = (String) aulas40.getSelectedItem(); 
								String valor41= (String) aulas41.getSelectedItem(); 
								String valor42= (String) aulas42.getSelectedItem();
								String valor43= (String) aulas43.getSelectedItem(); 
								String valor44= (String) aulas44.getSelectedItem();
								String valor45= (String) aulas45.getSelectedItem(); 
								String valor46= (String) aulas46.getSelectedItem(); 
								String valor47 = (String) aulas47.getSelectedItem(); //Forma para pegar valores do JCombobox pro JOptionPane
								String valor48 = (String) aulas48.getSelectedItem();
								String valor49= (String) aulas49.getSelectedItem(); 
								String valor50 = (String) aulas50.getSelectedItem(); 
								String valor51= (String) aulas51.getSelectedItem(); 
								String valor52= (String) aulas52.getSelectedItem();
								String valor53= (String) aulas53.getSelectedItem(); 
								String valor54= (String) aulas54.getSelectedItem();
								
								String texto3 = campo3.getText(); 
								
								//Exibir o valor
								JOptionPane.showMessageDialog(null,"Aluno(a): Ana Paula Traz"
										+ 						   "\nData de inicio do programa: 07/05/2017   |   Qtd De sessoes: 40"
										+ 						   "\n\nInstrutores: "+pro3+ "   |   Peso corporal: 67,80"
										+						   "\n\nPeriodizacao semanal:"
										+          				   "\nSEGUNDA:   |   TERCA:   |   QUARTA:   |   QUINTA:   |   SEXTA:   |   SABADO:		"	
										+						   "\n"+valor37+"            "+valor40+"            "+valor43+"            "+valor46+"            "+valor49+"            "+valor52+
																   "\n"+valor38+"           "+valor41+"            "+valor44+"            "+valor47+"            "+valor50+"            "+valor53+
																   "\n"+valor39+"           "+valor42+"            "+valor45+"            "+valor48+"            "+valor51+"            "+valor54+											
																   "\n\nObservacoes:"
										+						   "\n"+texto3);
						
							}
						});		
						
						
						
						
						//Acao aluno 1 no 3				
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo1.setVisible(false);
						rotulo2.setVisible(false);
						professores.setVisible(false);
						rotulo3.setVisible(false);
						rotulo4.setVisible(false);
						rotulo5.setVisible(false);
						rotulo6.setVisible(false);
						rotulo7.setVisible(false);
						rotulo8.setVisible(false);
						rotulo9.setVisible(false);
						rotulo10.setVisible(false);
						rotulo11.setVisible(false);
						
						
						
						aulas.setVisible(false);
						aulas2.setVisible(false);
						aulas3.setVisible(false);
						aulas4.setVisible(false);
						aulas5.setVisible(false);
						aulas6.setVisible(false);
						aulas7.setVisible(false);
						aulas8.setVisible(false);
						aulas9.setVisible(false);
						aulas10.setVisible(false);
						aulas11.setVisible(false);
						aulas12.setVisible(false);
						aulas13.setVisible(false);
						aulas14.setVisible(false);
						aulas15.setVisible(false);
						aulas16.setVisible(false);
						aulas17.setVisible(false);
						aulas18.setVisible(false);
					
						barraRolagem.setVisible(false);
						rotulo12.setVisible(false);
						botao2.setVisible(false);
		
					//Acao aluno 2 no 3
					
						aluno.setVisible(false);
						aluno2.setVisible(false);
						aluno3.setVisible(false);
						rotulo13.setVisible(false);
						rotulo14.setVisible(false);
						professores2.setVisible(false);
						rotulo15.setVisible(false);
						rotulo16.setVisible(false);
						rotulo17.setVisible(false);
						rotulo18.setVisible(false);
						rotulo19.setVisible(false);
						rotulo20.setVisible(false);
						rotulo21.setVisible(false);
						rotulo22.setVisible(false);
						rotulo23.setVisible(false);
						
						aulas19.setVisible(false);
						aulas20.setVisible(false);
						aulas21.setVisible(false);
						aulas22.setVisible(false);
						aulas23.setVisible(false);
						aulas24.setVisible(false);
						aulas25.setVisible(false);
						aulas26.setVisible(false);
						aulas27.setVisible(false);
						aulas28.setVisible(false);
						aulas29.setVisible(false);
						aulas30.setVisible(false);
						aulas31.setVisible(false);
						aulas32.setVisible(false);
						aulas33.setVisible(false);
						aulas34.setVisible(false);
						aulas35.setVisible(false);
						aulas36.setVisible(false);
		
						barraRolagem2.setVisible(false);
						rotulo24.setVisible(false);
						botao3.setVisible(false);
						//---------------------------------------------------------------------
					
					}
					
				
					
					
				});	
				
				
				
				
				
				
				
				
		//Acao do botao de selecionar	
				
			botao1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
	
		//Acao aluno 1 na botao selecionar					
					aluno.setVisible(true);
					aluno2.setVisible(true);
					aluno3.setVisible(true);
					
					rotulo1.setVisible(false);
					rotulo2.setVisible(false);
					professores.setVisible(false);
					rotulo3.setVisible(false);
					rotulo4.setVisible(false);
					rotulo5.setVisible(false);
					rotulo6.setVisible(false);
					rotulo7.setVisible(false);
					rotulo8.setVisible(false);
					rotulo9.setVisible(false);
					rotulo10.setVisible(false);
					rotulo11.setVisible(false);
				
					formulario.setSize(1000, 600);  
					aulas.setVisible(false);
					aulas2.setVisible(false);
					aulas3.setVisible(false);
					aulas4.setVisible(false);
					aulas5.setVisible(false);
					aulas6.setVisible(false);
					aulas7.setVisible(false);
					aulas8.setVisible(false);
					aulas9.setVisible(false);
					aulas10.setVisible(false);
					aulas11.setVisible(false);
					aulas12.setVisible(false);
					aulas13.setVisible(false);
					aulas14.setVisible(false);
					aulas15.setVisible(false);
					aulas16.setVisible(false);
					aulas17.setVisible(false);
					aulas18.setVisible(false);
				
					barraRolagem.setVisible(false);
					rotulo12.setVisible(false);
					botao2.setVisible(false);
				
					//aluno2---------------------------------------
					
					rotulo13.setVisible(false);
					rotulo14.setVisible(false);
					professores2.setVisible(false);
					rotulo15.setVisible(false);
					rotulo16.setVisible(false);
					rotulo17.setVisible(false);
					rotulo18.setVisible(false);
					rotulo19.setVisible(false);
					rotulo20.setVisible(false);
					rotulo21.setVisible(false);
					rotulo22.setVisible(false);
					rotulo23.setVisible(false);
					
					aulas19.setVisible(false);
					aulas20.setVisible(false);
					aulas21.setVisible(false);
					aulas22.setVisible(false);
					aulas23.setVisible(false);
					aulas24.setVisible(false);
					aulas25.setVisible(false);
					aulas26.setVisible(false);
					aulas27.setVisible(false);
					aulas28.setVisible(false);
					aulas29.setVisible(false);
					aulas30.setVisible(false);
					aulas31.setVisible(false);
					aulas32.setVisible(false);
					aulas33.setVisible(false);
					aulas34.setVisible(false);
					aulas35.setVisible(false);
					aulas36.setVisible(false);
	
					barraRolagem2.setVisible(false);
					rotulo24.setVisible(false);
					botao3.setVisible(false);	
				
					//Aluno 3
					
					rotulo25.setVisible(false);
					rotulo26.setVisible(false);
					professores3.setVisible(false);
					rotulo27.setVisible(false);
					rotulo28.setVisible(false);
					rotulo29.setVisible(false);
					rotulo30.setVisible(false);
					rotulo31.setVisible(false);
					rotulo32.setVisible(false);
					rotulo33.setVisible(false);
					rotulo34.setVisible(false);
					rotulo35.setVisible(false);
					
					aulas37.setVisible(false);
					aulas38.setVisible(false);
					aulas39.setVisible(false);
					aulas40.setVisible(false);
					aulas41.setVisible(false);
					aulas42.setVisible(false);
					aulas43.setVisible(false);
					aulas44.setVisible(false);
					aulas45.setVisible(false);
					aulas46.setVisible(false);
					aulas47.setVisible(false);
					aulas48.setVisible(false);
					aulas49.setVisible(false);
					aulas50.setVisible(false);
					aulas51.setVisible(false);
					aulas52.setVisible(false);
					aulas53.setVisible(false);
					aulas54.setVisible(false);
	
					barraRolagem3.setVisible(false);
					rotulo36.setVisible(false);
					botao4.setVisible(false);
					botao4.setEnabled(false);
					
					
					
				
				}
			});	
				
				
		//Adicionar ao formulario
		formulario.add(caixa01);
		formulario.add(botao1);
		formulario.add(aluno);
		formulario.add(aluno2);
		formulario.add(aluno3);
		
		//Aluno1
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(rotulo3);
		formulario.add(rotulo4);
		formulario.add(rotulo5);
		formulario.add(rotulo6);
		formulario.add(rotulo7);
		formulario.add(rotulo8);
		formulario.add(rotulo9);
		formulario.add(rotulo10);
		formulario.add(rotulo11);	
		formulario.add(aulas);
		formulario.add(aulas2);
		formulario.add(aulas3);
		formulario.add(professores);
		formulario.add(aulas4);
		formulario.add(aulas5);
		formulario.add(aulas6);
		formulario.add(aulas7);
		formulario.add(aulas8);
		formulario.add(aulas9);
		formulario.add(aulas10);
		formulario.add(aulas11);
		formulario.add(aulas12);
		formulario.add(aulas13);
		formulario.add(aulas14);
		formulario.add(aulas15);
		formulario.add(aulas16);
		formulario.add(aulas17);
		formulario.add(aulas18);	
		formulario.add(rotulo12);
		formulario.add(barraRolagem);
		formulario.add(botao2);
		
		//Aluno2----------------------------------------
		formulario.add(rotulo13);
		formulario.add(rotulo14);
		formulario.add(rotulo15);
		formulario.add(rotulo16);
		formulario.add(rotulo17);
		formulario.add(rotulo18);
		formulario.add(rotulo19);
		formulario.add(rotulo20);
		formulario.add(rotulo21);
		formulario.add(rotulo22);
		formulario.add(rotulo23);	
		formulario.add(aulas19);
		formulario.add(aulas20);
		formulario.add(aulas21);
		formulario.add(professores2);
		formulario.add(aulas22);
		formulario.add(aulas23);
		formulario.add(aulas24);
		formulario.add(aulas25);
		formulario.add(aulas26);
		formulario.add(aulas27);
		formulario.add(aulas28);
		formulario.add(aulas29);
		formulario.add(aulas30);
		formulario.add(aulas31);
		formulario.add(aulas32);
		formulario.add(aulas33);
		formulario.add(aulas34);
		formulario.add(aulas35);
		formulario.add(aulas36);
		formulario.add(rotulo24);
		formulario.add(barraRolagem2);
		formulario.add(botao3);
		
		//Aluno 3 -------------------------
		formulario.add(rotulo25);
		formulario.add(rotulo26);
		formulario.add(rotulo27);
		formulario.add(rotulo28);
		formulario.add(rotulo29);
		formulario.add(rotulo30);
		formulario.add(rotulo31);
		formulario.add(rotulo32);
		formulario.add(rotulo33);
		formulario.add(rotulo34);
	    formulario.add(rotulo35);
	    formulario.add(aulas37);
		formulario.add(aulas38);
		formulario.add(aulas39);
		formulario.add(professores3);
		formulario.add(aulas40);
		formulario.add(aulas41);
		formulario.add(aulas42);
		formulario.add(aulas43);
		formulario.add(aulas44);
		formulario.add(aulas45);
		formulario.add(aulas46);
		formulario.add(aulas47);
		formulario.add(aulas48);
		formulario.add(aulas49);
		formulario.add(aulas50);
		formulario.add(aulas51);
		formulario.add(aulas52);
		formulario.add(aulas53);
		formulario.add(aulas54);
		 formulario.add(rotulo36);
		formulario.add(barraRolagem3);
		formulario.add(botao4);
		
		//===================================================
		formulario.setVisible(true);
		
		
		
		
	}

}
