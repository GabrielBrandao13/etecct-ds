package prjAula0804;

public class Principal {
	public static void main(String[]args) {
		Pessoa gabriel = new Pessoa("Gabriel", "rua ali", "515215");
		
		gabriel.apresentar();
		
		gabriel.setNome("Pedro");
		gabriel.setEndereco("Lugar nenhum");
		gabriel.setTelefone("16181313");
		
		gabriel.apresentar();
	}
}
