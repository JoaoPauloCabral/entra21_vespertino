package atividade10;

public class Principal {

	public static void main(String[] args) {

		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser depositado"));
		double juros, valorcomj = 0;
		int mes;
		double jurosT = 0;
		String jurosTF = "a";
		
		
		LocalDateTime mesAtual = LocalDateTime.now();
		DateTimeFormatter mesInteiro = DateTimeFormatter.ofPattern("M");
		int mesFormatado = Integer.parseInt(mesAtual.format(mesInteiro));
		String mesForm = "a";
		
		LocalDateTime anoAtual = LocalDateTime.now();
		DateTimeFormatter anoInteiro = DateTimeFormatter.ofPattern("Y");
		int anoFormatado = Integer.parseInt(anoAtual.format(anoInteiro));
		
		
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses este valor permanecerá depositado (máximo = 24)"));
		}while ((mes <= 0) || (mes > 24));
		
		String resultado = "Valor investido: R$ "+valor;
			   resultado+= "\n\nDATA / GANHO / TOTAL";
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		if (mesFormatado <= 12) {
			mesFormatado++;
		}else if (mesFormatado > 12) {
			anoFormatado++;
			mesFormatado = 1;
		}
		
		for (int indice = 1; indice <= mes; indice++) {
			
			if (indice == 1) {
			juros = valor*0.0037;
			valorcomj = valor+juros;
			}else {
				juros = valorcomj*0.0037;
				valorcomj += juros;
			}
			
			
			if (mesFormatado == 1) {
				mesForm = "Janeiro";
			}else if (mesFormatado == 2) {
				mesForm = "Fevereiro";
			}else if (mesFormatado == 3) {
				mesForm = "Março";
			}else if (mesFormatado == 4) {
				mesForm = "Abril";
			}else if (mesFormatado == 5) {
				mesForm = "Maio";
			}else if (mesFormatado == 6) {
				mesForm = "Junho";
			}else if (mesFormatado == 7) {
				mesForm = "Julho";
			}else if (mesFormatado == 8) {
				mesForm = "Agosto";
			}else if (mesFormatado == 9) {
				mesForm = "Setembro";
			}else if (mesFormatado == 10) {
				mesForm = "Outubro";
			}else if (mesFormatado == 11) {
				mesForm = "Novembro";
			}else if (mesFormatado == 12) {
				mesForm = "Dezembro";
			}
			
			
			
			
			
			
			
			
			
			
		String valorcomjF = df.format(valorcomj);
		String jurosF = df.format(juros);
		
		jurosT+=juros;
		
		resultado+= "\n"+mesForm+" ("+anoFormatado+")"+"  -  "+jurosF+"  -  "+valorcomjF;
		/*resultado+= "\n"+contador+". Mês: "+mesForm+" - "+anoFormatado;
		resultado+= "\n"+contador+". Juros: R$ "+jurosF;
		resultado+= "\n"+contador+". Valor com Juros: "+valorcomjF;*/
		
		jurosTF = df.format(jurosT);

		
		if (mesFormatado <= 12) {
			mesFormatado++;
		}else if (mesFormatado > 12) {
			anoFormatado++;
			mesFormatado = 1;
		}
		}
		resultado+= "\n\nTotal ganho de juros: R$ "+jurosTF;
		JOptionPane.showMessageDialog(null, resultado);
		
		
		System.out.println("a	a");
		
		
		
		
		
		
		
		
		
	}

}
