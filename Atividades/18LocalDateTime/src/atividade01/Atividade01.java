package atividade01;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Atividade01 {

	public static void main(String[] args) {
		LocalDateTime tempo = LocalDateTime.now();
	
	
		//Obtendo a hora, minuto e segundo
		int minuto = tempo.getMinute();
		int hora = tempo.getHour();
	
		//Obtendo dia mes e ano
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
	
	String dia1="Hoje e dia ",mes1 = " de",ano1=" de";
	String hora1="A hora atual e ",minuto1= "";
	
	
	if(dia == 1) {
		dia1 += "primeiro";
	}else if(dia == 2) {
		dia1 += "dois";
	}else if(dia == 3) {
		dia1 += "tres";
	}else if(dia == 4) {
		dia1 += "quatro";
	}else if(dia == 5) {
		dia1 += "cinco";
	}else if(dia == 6) {
		dia1 += "seis";
	}else if(dia == 7) {
		dia1 += "sete";
	}else if(dia == 8) {
		dia1 += "oito";
	}else if(dia == 9) {
		dia1 += "nove";
	}else if(dia == 10) {
		dia1 +="dez";
	}else if(dia == 11) {
		dia1 += "onze";
	}else if(dia == 12) {
		dia1 += "doze";
	}else if(dia == 13) {
		dia1 += "treze";
	}else if(dia == 14) {
		dia1 = "quatorze";
	}else if(dia == 15) {
		dia1 += "quize";
	}else if(dia == 16) {
		dia1 += "dezeseis";
	}else if(dia == 17) {
		dia1 += "dezesete";
	}else if(dia == 18) {
		dia1 += "dezoito";
	}else if(dia == 19) {
		dia1 += "dezenove";
	}else if(dia == 20) {
		dia1 += "vinte";
	}else if(dia == 21) {
		dia1 += "vinte e um";
	}else if(dia == 22) {
		dia1 += "vinte e dois";
	}else if(dia == 23) {
		dia1 += "vinte e tres";
	}else if(dia == 24) {
		dia1 += "vinte e quatro";
	}else if(dia == 25) {
		dia1 += "vinte e cinco";
	}else if(dia == 26) {
		dia1 += "vinte e seis";
	}else if(dia == 27) {
		dia1 += "vinte e sete";
	}else if(dia == 28) {
		dia1 += "vinte e oito";
	}else if(dia == 29) {
		dia1 += "vinte e nove";
	}else if(dia == 30) {
		dia1 += "trinta";
	}else if(dia == 31) {
		dia1 += "trinta e um";
	}
	
	if(mes == 1) {
		mes1+=" janeiro";
	}else if(mes == 2) {
		mes1+=" fevereiro";
	}else if(mes == 3) {
		mes1+=" marco";
	}else if(mes == 4) {
		mes1+=" abriu";
	}else if(mes == 5) {
		mes1+=" maio";
	}else if(mes == 6) {
		mes1+=" junho";
	}else if(mes == 7) {
		mes1+=" julho";
	}else if(mes == 8) {
		mes1+=" agosto";
	}else if(mes == 9) {
		mes1+=" setembro";
	}else if(mes == 10) {
		mes1+=" outubro";
	}else if(mes == 11) {
		mes1+=" novembro";
	}else if(mes == 12) {
		mes1+=" dezembro";
	}
	
	
	if(ano == 2019) {
		ano1 += " dois mil e dezenove";
	}else if(ano == 2020) {
		ano1 += " dois mil e vinte";
	}else if(ano == 2021) {
		ano1 += " dois mil e vinte e um";
	}else if(ano == 2022) {
		ano1 += " dois mil e vinte e dois";
	}else if(ano == 2023) {
		ano1 += " dois mil e vinte e tres";
	}else if(ano == 2024) {
		ano1 += " dois mil e vinte e quatro";
	}else if(ano == 2025) {
		ano1 += " dois mil e vinte e cinco";
	}else if(ano == 2026) {
		ano1 += " dois mil e vinte e seis";
	}else if(ano == 2027) {
		ano1 += " dois mil e vinte e sete";
	}		
		
	
	if(hora == 1) {
		hora1+="uma hora e ";
	}else if(hora ==2) {
		hora1+="duas horas e ";
	}else if(hora ==3) {
		hora1+="tres horas e ";
	}else if(hora ==4) {
		hora1+="quatro horas e ";
	}else if(hora ==5) {
		hora1+="cinco horas e ";
	}else if(hora ==6) {
		hora1+="seis horas e ";
	}else if(hora ==7) {
		hora1+="sete horas e ";
	}else if(hora ==8) {
		hora1+="oito horas e ";
	}else if(hora ==9) {
		hora1+="nove horas e ";
	}else if(hora ==10) {
		hora1+="dez horas e ";
	}else if(hora ==11) {
		hora1+="onze horas e ";
	}else if(hora ==12) {
		hora1+="doze horas e ";
	}else if(hora ==13) {
		hora1+="treze horas e ";
	}else if(hora ==14) {
		hora1+="quatorze horas e ";
	}else if(hora ==15) {
		hora1+="quinze horas e ";
	}else if(hora ==16) {
		hora1+="dezeseis horas e ";
	}else if(hora ==17) {
		hora1+="dezesete horas e";
	}else if(hora ==18) {
		hora1+="dezoito horas e ";
	}else if(hora ==19) {
		hora1+="deznove horas e ";
	}else if(hora ==20) {
		hora1+="vinte horas e ";
	}else if(hora ==21) {
		hora1+="vinte e uma horas e ";
	}else if(hora ==22) {
		hora1+="vinte e duas horas e ";
	}else if(hora ==23) {
		hora1+="vinte e tres horas e ";
	}else if(hora ==24) {
		hora1+="vinte e quatro horas e ";
	}
 	
	if(minuto == 1) {
		minuto1+="um minuto";
	}else if (minuto == 2) {
		minuto1+="dois minutos";
	}else if(minuto == 3) {
		minuto1+="tres minutos";
	}else if(minuto == 4) {
		minuto1+="quatro minutos";
	}else if (minuto == 5) {
		minuto1+="cinco minutos";
	}else if(minuto == 6) {
		minuto1+="seis minutos";
	}else if(minuto == 7) {
		minuto1+="sete minutos";
	}else if (minuto == 8) {
		minuto1+="oito minutos";
	}else if(minuto == 9) {
		minuto1+="nove minutos";
	}else if(minuto == 10) {
		minuto1+="dez minutos";
	}else if (minuto == 11) {
		minuto1+="onze minutos";
	}else if(minuto == 12) {
		minuto1+="doze minutos";
	}else if(minuto == 13) {
		minuto1+="treze minutos";
	}else if (minuto == 14) {
		minuto1+="quatorze minutos";
	}else if(minuto == 15) {
		minuto1+="quinze minutos";
	}else if(minuto == 16) {
		minuto1+="dezeseis minutos";	
	}else if (minuto == 17) {
		minuto1+="dezesete minutos";	
	}else if(minuto == 18) {
		minuto1+="dezeoito minutos";	
	}else if(minuto == 19) {
		minuto1+="dezenove minutos";
	}else if (minuto == 20) {
		minuto1+="vinte minutos";
	}else if(minuto == 21) {
		minuto1+="vinte e um minutos";
	}else if(minuto == 22) {
		minuto1+="vinte e dois minutos";
	}else if (minuto == 23) {
		minuto1+="vinte e tres minutos";
	}else if(minuto == 24) {
		minuto1+="vinte e quatro minutos";
	}else if(minuto == 25) {
		minuto1+="vinte e cinco minutos";
	}else if (minuto == 26) {
		minuto1+="vinte e seis minutos";
	}else if(minuto == 27) {
		minuto1+="vinte e sete minutos";
	}else if(minuto == 28) {
		minuto1+="vinte e oito minutos";
	}else if (minuto == 29) {
		minuto1+="vinte e nove minutos";
	}else if(minuto == 30) {
		minuto1+="trinta minutos";
	}else if(minuto == 31) {
		minuto1+="trinta e um minutos";
	}else if (minuto == 32) {
		minuto1+="trinta e dois minutos";
	}else if(minuto == 33) {
		minuto1+="trinta e tres minutos";
	}else if(minuto == 34) {
		minuto1+="trinta e quatro minutos";
	}else if (minuto == 35) {
		minuto1+="trinta e cinco minutos";
	}else if(minuto == 36) {
		minuto1+="trinta e seis minutos";
	}else if(minuto == 37) {
		minuto1+="trinta e sete minutos";
	}else if (minuto == 38) {
		minuto1+="trinta e oito minutos";
	}else if(minuto == 39) {
		minuto1+="trinta e nove minutos";
	}else if(minuto == 40) {
		minuto1+="quarenta minutos";
	}else if (minuto == 41) {
		minuto1+="quarenta e um minutos";
	}else if(minuto == 42) {
		minuto1+="quarenta e dois minutos";
	}else if(minuto == 43) {
		minuto1+="quarenta e tres minutos";
	}else if (minuto == 44) {
		minuto1+="quarenta e quatro minutos";
	}else if(minuto == 45) {
		minuto1+="quarenta e cinco minutos";
	}else if(minuto == 46) {
		minuto1+="quarenta e seis minutos";
	}else if (minuto == 47) {
		minuto1+="quarenta e sete minutos";
	}else if(minuto == 48) {
		minuto1+="quarenta e oito minutos";
	}else if(minuto == 49) {
		minuto1+="quarenta e nove minutos";
	}else if (minuto == 50) {
		minuto1+="cinquenta minutos";
	}else if(minuto == 51) {
		minuto1+="cinquenta e um minutos";
	}else if(minuto == 52) {
		minuto1+="cinquenta e dois minutos";
	}else if (minuto == 53) {
		minuto1+="cinquenta e tres minutos";
	}else if(minuto == 54) {
		minuto1+="cinquenta e quatro minutos";
	}else if(minuto == 55) {
		minuto1+="cinquenta e cinco minutos";
	}else if (minuto == 56) {
		minuto1+="cinquenta e seis minutos";
	}else if(minuto == 57) {
		minuto1+="cinquenta e sete minutos";
	}else if(minuto == 58) {
		minuto1+="cinquenta e oito minutos";
	}else if (minuto == 59) {
		minuto1+="cinquenta e nove minutos";
	}
	
		JOptionPane.showMessageDialog(null, dia+"/"+mes+"/"+ano+" - "+hora+":"+minuto+
											"\n\n"+dia1+mes1+ano1+
											"\n"+hora1+" "+minuto1);
	}

}
