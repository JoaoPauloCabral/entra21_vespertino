package exemplo01;

public class Carro {

	/*
	 
	 	Encapsulamento: Visibilidade de atributos e m�todos
	 	
	 	DEFAULT: Atributos e m�todos vis�veis em todo o pacote
	 	PUBLIC: Atributos e met�dos visiveis em todo o projeto
	 	PRIVATE: Atributos e met�dos vis�veis apenas na classe onde s�o criados
	 	PROTECTED: Atributos e met�dos vis�veis apenas nos pacotes onde s�o criados ou em classes herdadas
	 */
	
	
	//Atributos
		private String modelo, fabricante;
		private int ano;
		
		
		//Set Get
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
		
		
}
