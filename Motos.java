
class Motos {
	private String cor;
	private ModeloMoto modelo;
	private PrecoMoto preco;
	private Capacete capacete;
	
	
	public enum ModeloMoto{
        //Enum sobre o modelo de cada moto a ser locada.
		Modelo_150FAN("Fan 150 - Honda"),
		Modelo_250FAZER("Fazer250 - Yamaha"),
		Modelo_160TITAN("Fan 160 - Honda"),
		Modelo_100POP("Pop 100 - Honda"),
		Modelo_300XRE("XRE 300 - Honda"),
		Modelo_150FACTOR("Factor 150 - Yamaha");
		
		private final String modeloMoto;
		
		ModeloMoto(String modeloMoto){
			this.modeloMoto= modeloMoto;
		}
		String getModeloMoto() {
			return this.modeloMoto;
		}
	}
	public enum PrecoMoto{
		//Pre�os sobre cada modelo de moto.
		PRECO_150FAN(200),
		PRECO_250FAZER(600),
		PRECO_160TITAN(300),
		PRECO_100POP(130),
		PRECO_300XRE(700),
		PRECO_150FACTOR(210);
		
		private final double precoMoto;
		
		PrecoMoto (double precoMoto){
			this.precoMoto = precoMoto;
		}
		double getPrecoMoto() {
			return this.precoMoto;
		}
	}
	public enum Capacete{
		//Pre�os de capacetes a serem locados pelo cliente.
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
	public Motos(ModeloMoto modeloMoto) {
		this.modeloMoto = modeloMoto;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	//Demonstra��o de toda a string.
	public String toString() {
		return this.modeloMoto + " " + this.cor + " " + this.precoMoto + " " + this.capacete + " ";
	}
}
