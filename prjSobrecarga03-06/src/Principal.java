
public class Principal {
	public static void main(String[]args) {
		Funcionario obj1 = new Funcionario();
		
		obj1.setNome("Andr� Bezerra Santos");
		obj1.setCpf("jshjsjsds");
		obj1.setSalario(200);
		
		System.out.println(obj1.getSalario());
		
		obj1.setNome("Andr� Bezerra Santos", true);
		
		obj1.setNome("Andr� Bezerra Santos", true, "S");
		
		obj1.imprimir();
	}
}
