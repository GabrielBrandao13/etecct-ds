package prjHeranca;

public class Principal {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Gabriel");
		f1.setCpf("1234.567.8");
		f1.setSalario(20);
		
		System.out.println(f1.getCpf());
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());
		
		
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Bob");
		g1.setCpf("8765.432.1");
		g1.setSalario(454834856);
		g1.setSenha("123456");
		
		System.out.println(g1.getCpf());
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		System.out.println(g1.autentica("123456"));
		if(g1.autentica("123456")) {
			System.out.println("Senha correta!");
		}else {
			System.out.println("Senha incorreta");
		}
	}
}
