
class Motos {
	private String cor;
	private Modelo modelo;
	private Preco preco;
	private Capacete capacete;
	
	
	public enum Modelo{
        //Enum sobre o modelo de cada moto a ser locada.
		Modelo_150FAN("Fan 150 - Honda"),
		Modelo_250FAZER("Fazer250 - Yamaha"),
		Modelo_160TITAN("Fan 160 - Honda"),
		Modelo_100POP("Pop 100 - Honda"),
		Modelo_300XRE("XRE 300 - Honda"),
		Modelo_150FACTOR("Factor 150 - Yamaha");
		
		private final String modelo;
		
		Modelo(String modelo){
			this.modelo= modelo;
		}
		String getModelo() {
			return this.modelo;
		}
	}
	public enum Preco{
		//Preços sobre cada modelo de moto.
		PRECO_150FAN(200),
		PRECO_250FAZER(600),
		PRECO_160TITAN(300),
		PRECO_100POP(130),
		PRECO_300XRE(700),
		PRECO_150FACTOR(210);
		
		private final double preco;
		
		Preco (double preco){
			this.preco = preco;
		}
		double getPreco() {
			return this.preco;
		}
	}
	public enum Capacete{
		//Preços de capacetes a serem locados pelo cliente.
		CAPACETE_ESPORTIVO(80),
		CAPACETE_CASUAL(40);
		
		private final double capacete;
		
		Capacete (double capacete){
			this.capacete = capacete;
		}
		double getCapacete() {
			return this.capacete;
		}
	}
	public Motos(Modelo modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	//Demonstração de toda a string.
	public String toString() {
		return this.modelo + " " + this.cor + " " + this.preco + " " + this.capacete + " ";
	}
}
