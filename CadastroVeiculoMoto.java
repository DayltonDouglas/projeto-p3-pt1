
class CadastroVeiculoMoto {
	private Moto[] vetor3;
	private int cont;
	public CadastroVeiculoMoto(Moto[] vetor) {
		    vetor = new Moto[100000];
		    this.cont = 0;
		  }

		CadastroVeiculo() {
		    throw new UnsupportedOperationException("Não suportado"); 
		  }
		  public void exibir() {
		    for (Moto veiculos : vetor3) {
		      System.out.println(veiculos + " ");
		    }
		    System.out.println();
		  }
		
}
