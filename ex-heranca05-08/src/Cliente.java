
public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double desconto;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double calculaDesconto(double preco) {
		return  (preco/100)*10;
	}
}
