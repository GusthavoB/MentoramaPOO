package exercioN4;

public class carro {
	public static final String VERMELHO = "vermelho";
	public static final String PRETA = "preta";
	private int quantidadePortas;
	private int quantidadePneus;
	private int quantidadeParafusosPneus;
	private int quantidadeMacanetas;
	private String marcaDoCarro;
	private String modeloDoCarro;
	private int cavalos;
	private int cavalosRoda;



	// construtor
	public carro(int quantidadePneus, int quantidadePortas, String marcaDoCarro,String modeloDoCarro,int cavalos ) {
		setMarcaDoCarro(marcaDoCarro);
		setQuantidadePneus(quantidadePneus);
		setQuantidadePortas(quantidadePortas);
		setModeloDoCarro(modeloDoCarro);
		setCavalos(cavalos);
		
	}
	

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		cavalosRoda = cavalos - cavalos*20/100;
		this.cavalos = cavalos;
	}

	public String getModeloDoCarro() {
		return modeloDoCarro;
	}

	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}

	public String getMarcaDoCarro() {
		return marcaDoCarro;
	}

	public void setMarcaDoCarro(String marcaDoCarro) {
		this.marcaDoCarro = marcaDoCarro;
	}

	public int getQuantidadePortas() {
		return quantidadePortas + 1;// PortaMalas
	}

	public void setQuantidadePortas(int quantidadePortas) {
		quantidadeMacanetas = quantidadePortas;
		this.quantidadePortas = quantidadePortas;
	}

	public void setQuantidadePneus(int quantidadePneus) {
		quantidadeParafusosPneus = quantidadePneus * 4;
		this.quantidadePneus = quantidadePneus;
	}

	public int getQuantidadePneus() {
		return quantidadePneus + 1;
	}

	public int getQuantidadeCalotas(int quantidadePneus) {
		return quantidadePneus - 1;//stepNtem calota
	}

	public void setCor(String cor) {
		System.out.println(cor);
	}

	public void imprimiValores() {
		System.out.println("Marca do Carro: " + marcaDoCarro);
		System.out.println("Quantidade Pneus: " + quantidadePneus);
		System.out.println("Quantidade de Calotas: " + getQuantidadeCalotas(quantidadePneus));
		System.out.println("Quantidade de Parafusos: " + quantidadeParafusosPneus);
		System.out.println("Quantidade de Portas: " + getQuantidadePortas());
		System.out.println("Quantidade de Macanetas: " + quantidadeMacanetas);
		System.out.println("Cavalaria: " + cavalos);
		System.out.println("Cavalaria de roda: " + cavalosRoda);
	}

}
