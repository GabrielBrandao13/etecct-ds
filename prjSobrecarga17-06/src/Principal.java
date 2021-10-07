
public class Principal {
	public static void main(String[]args) {
		Numeros calc = new Numeros();
		
		int[] numeros = {1, 5, 3, 8, 9};
		
		System.out.println("Testando se o número 2 é par: ");
		
		System.out.println(calc.par(2));
		
		System.out.println("Testando se o array de números é par: ");
		
		boolean[] pares = calc.par(numeros);
		
		for(int i=0;i<pares.length;i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("Testando se o número 8 é primo: ");
		
		
		System.out.println(calc.primo(8));
		
		System.out.println("Testando se o array de números é primo: ");
		
		boolean[] primos = calc.primo(numeros);
		
		for(int i =0;i<primos.length;i++) {
			System.out.println(primos[i]);
		}
	}
}
