
public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public Produto(String nome, double precoCusto, double precoVenda) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.margemLucro = this.calcularMargemLucro();
	}
	
	public double calcularMargemLucro() {
		return this.precoVenda-this.precoCusto;
	}
	
	public double getMargemLucroPorcentagem() {
		return ((this.calcularMargemLucro())/this.precoCusto)*100;
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getPrecoCusto() {
		return this.precoCusto;
	}
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	public double getMargemLucro() {
		return this.margemLucro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPrecoCusto(double preco) {
		this.precoCusto = preco;
		this.margemLucro = this.calcularMargemLucro();
		
	}
	public void setPrecoVenda(double preco) {
		if(preco>this.getPrecoCusto()) {
			this.precoVenda = preco;
			this.margemLucro = this.calcularMargemLucro();
		}

	}
	
	public void imprimir() {
		System.out.println("Nome do produto: "+this.getNome());
		System.out.println("Custo do produto: "+this.getPrecoCusto());
		System.out.println("Venda do produto: "+this.getPrecoVenda());
		System.out.println("Margem de lucro: "+this.getMargemLucro());
		System.out.println("Percentual da margem de lucro: "+this.getMargemLucroPorcentagem()+"%");
	}
	
	
	
}


