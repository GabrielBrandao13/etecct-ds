
public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public void imprimir() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSalario() {
		return ""+salario;
	}
	public String getSalario(boolean format) {
		return "R$ "+salario;
	}
	
	

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome, boolean caixaalta) {
		if(caixaalta) {
			this.nome = nome.toUpperCase();
		}else {
			this.nome = nome.toLowerCase();
		}
	}
	public void setNome(String nome, boolean caixaalta, String primeirapalavra) {
		if(caixaalta) {
			this.nome = nome.toUpperCase();
		}else {
			this.nome = nome.toLowerCase();
		}
		
		if(primeirapalavra == "S") {
			this.nome = nome.split(" ")[0];
		}
	}
}
