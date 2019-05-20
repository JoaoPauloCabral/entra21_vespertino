package beans;

public class Beans {

	private String nome, cargo;
	private double salarioBruto, valeTransporte, impostoRenda, salarioLiquido;
	private boolean Cf, Ps;
	private int faltas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getValeTransporte() {
		return valeTransporte;
	}
	public void setValeTransporte(double valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	public double getImpostoRenda() {
		return impostoRenda;
	}
	public void setImpostoRenda(double impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public boolean isCf() {
		return Cf;
	}
	public void setCf(boolean cf) {
		Cf = cf;
	}
	public boolean isPs() {
		return Ps;
	}
	public void setPs(boolean ps) {
		Ps = ps;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
}

