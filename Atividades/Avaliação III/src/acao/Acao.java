package acao;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import beans.Beans;
import dados.Colaboradores;
import principal.Principal;

public class Acao {

	public void cadastrar(Beans c) {
		Colaboradores.array.add(c);
	}
	
	public DefaultTableModel atualizar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Colaborador");
		dadosTabela.addColumn("Salário Líquido");
	
		for(int i=0; i<Colaboradores.array.size(); i++) {
			dadosTabela.addRow(new Object[] {Colaboradores.array.get(i).getNome(),Colaboradores.array.get(i).getSalarioLiquido()});
		}
		
		
		return dadosTabela;
	}
	//Pegar Salario Bruto
	public double salario(int a) {
		
		double salario = 0;
		
		if(a == 0) {
			salario=900;
		}else if(a == 1) {
			salario=1300;
		}else if(a == 2) {
			salario=1800;
		}else if(a == 3) {
			salario=2400;
		}else if(a == 4) {
			salario=2700;
		}else if(a == 5) {
			salario=3200;
		}else if(a == 6) {
			salario=3600;
		}else if(a == 7) {
			salario=4400;
		}
		
		return salario;
	}
	//Valor do vale transporte
	
	public double vale(double b) {
		double vale = b * 0.06;
		
		return vale;
	}
	
	//Imposto de renda
	public double imposto(int a) {
		
		double imposto = 0;
		
		if(a == 0) {
			imposto=0;
		}else if(a == 1) {
			imposto=1300*0.04;
		}else if(a == 2) {
			imposto=1800*0.055;
		}else if(a == 3) {
			imposto=2400*0.06;
		}else if(a == 4) {
			imposto=2700*0.065;
		}else if(a == 5) {
			imposto=3200*0.07;
		}else if(a == 6) {
			imposto=3600*0.075;
		}else if(a == 7) {
			imposto=4400*0.08;
		}
		
		return imposto;
	}
	
	//Salario Liquido
	
	public double liquido(int a, boolean b, boolean c, int d, boolean e) {
		
		double liquido =0;

		
		//Pegar salario bruto
		double salario =0;
		double falta = 0;
		double clube = 0;
		double saude = 0;
		double vale = 0;
		double imposto = 0;
		
		//calcular
		if(a == 0) {
			salario=900;
		}else if(a == 1) {
			salario=1300;
		}else if(a == 2) {
			salario=1800;
		}else if(a == 3) {
			salario=2400;
		}else if(a == 4) {
			salario=2700;
		}else if(a == 5) {
			salario=3200;
		}else if(a == 6) {
			salario=3600;
		}else if(a == 7) {
			salario=4400;
		}
		
		
		//Calcular imposto
		if(a == 0) {
			imposto=0;
		}else if(a == 1) {
			imposto=1300*0.04;
		}else if(a == 2) {
			imposto=1800*0.055;
		}else if(a == 3) {
			imposto=2400*0.06;
		}else if(a == 4) {
			imposto=2700*0.065;
		}else if(a == 5) {
			imposto=3200*0.07;
		}else if(a == 6) {
			imposto=3600*0.075;
		}else if(a == 7) {
			imposto=4400*0.08;
		}
		
		//Verificar transporte
		if(e == true) {
			vale =salario*0.06;
		}
		
		salario= salario-imposto-vale;
		
		//Verificar falta
		if(d == 0) {
			falta =50;
		}
		
		//Verificar clube
		if(b == true) {
			clube = 100;
		}
		
		//verificar saude
		if(c == true) {
			saude = salario*0.03;
		}
		
		salario= salario+falta-clube-saude;
		
		liquido = salario;
		
		return liquido;
	}
	
	//Exibir estatisticas cargos
	
	public ArrayList<String> cargos() {
		
		ArrayList<String> cargo = new ArrayList<String>();
		
		int esta=0, DJ=0, DP=0, DS=0, AJ=0, AP=0, AS=0, AQ=0;
		for(int i=0; i<Colaboradores.array.size(); i++) {
			
			if(Colaboradores.array.get(i).getCargo().equals("Estagiário")) {
				esta++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Desenvolvedor Jr")) {
				DJ++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Desenvolvedor Pleno")) {
				DP++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Desenvolvedor Sênior")) {
				DS++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Analista de Sistemas Jr")) {
				AJ++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Analista de Sistemas Pleno")) {
				AP++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Analista de Sistemas Sênior")) {
				AS++;
			}else if(Colaboradores.array.get(i).getCargo().equals("Arquiteto de Software")) {
				AQ++;
			}
		}
		
		cargo.add(""+esta);
		cargo.add(""+DJ);
		cargo.add(""+DP);
		cargo.add( ""+DS);
		cargo.add(""+AJ);
		cargo.add(""+AP);
		cargo.add(""+AS);
		cargo.add(""+AQ);
		
		
		return cargo;
	}
	
	//Estatistica vale
	
	public ArrayList<String> vales() {
		
		ArrayList<String> vale = new ArrayList<String>();
		
		int esta=0;
		for(int i=0; i<Colaboradores.array.size(); i++) {
			
			if(Colaboradores.array.get(i).getValeTransporte() != 0) {
				esta++;
			}
		}
		
		vale.add(""+esta);
		
		
		
		return vale;
	}
	
	//Estatistica Clube
	public ArrayList<String> clubes() {
		
		ArrayList<String> clube = new ArrayList<String>();
		
		int esta=0;
		for(int i=0; i<Colaboradores.array.size(); i++) {
			
			if(Colaboradores.array.get(i).isCf() == true) {
				esta++;
			}
		}
		
		clube.add(""+esta);
		
		
		
		return clube;
	}
	
	//Estatisticas saude
	public ArrayList<String> saudes() {
		
		ArrayList<String> saude = new ArrayList<String>();
		
		int esta=0;
		for(int i=0; i<Colaboradores.array.size(); i++) {
			
			if(Colaboradores.array.get(i).isPs() == true) {
				esta++;
			}
		}
		
		saude.add(""+esta);

		return saude;
	}
	
	//Estatisticas faltas
		public ArrayList<Double> faltas() {
			
			ArrayList<Double> falta = new ArrayList<Double>();
			
			double nada=0, p=0, m=0, g=0;
			for(int i=0; i<Colaboradores.array.size(); i++) {
				
				if(Colaboradores.array.get(i).getFaltas() == 0) {
					nada++;
				}else if((Colaboradores.array.get(i).getFaltas() > 0) && (Colaboradores.array.get(i).getFaltas() < 3)) {
					p++;
				}else if((Colaboradores.array.get(i).getFaltas() > 3) && (Colaboradores.array.get(i).getFaltas() < 5)) {
					m++;
				}else if(Colaboradores.array.get(i).getFaltas() > 5) {
					g++;
				}
			}
			
			falta.add((nada/Colaboradores.array.size())*100);
			falta.add((p/Colaboradores.array.size())*100);
			falta.add((m/Colaboradores.array.size())*100);
			falta.add((g/Colaboradores.array.size())*100);

			return falta;
		}
}

