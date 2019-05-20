package atividade25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		
		
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter horaInteira = DateTimeFormatter.ofPattern("H");

		DateTimeFormatter horaCompleta = DateTimeFormatter.ofPattern("H:m");
		int horaFormatada = Integer.parseInt(hora.format(horaInteira));
		String horaFormatadaCompleta = hora.format(horaCompleta);
		
		
		
		if((horaFormatada >= 19) && (horaFormatada <= 23)) {
			JOptionPane.showMessageDialog(null, "Boa noite, agora são "+horaFormatadaCompleta);
		}else if((horaFormatada >= 12) && (horaFormatada <= 18)) {
			JOptionPane.showMessageDialog(null, "Boa Tarde, agora são "+horaFormatadaCompleta);
		}else if((horaFormatada >= 7) && (horaFormatada <= 11)) {
			JOptionPane.showMessageDialog(null, "Boa Dia, agora são "+horaFormatadaCompleta);
		}else if((horaFormatada >= 0) && (horaFormatada <= 6)) {
			JOptionPane.showMessageDialog(null, "Boa Madrugada, agora são "+horaFormatadaCompleta);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
