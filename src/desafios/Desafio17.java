package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

	public static void main(String[] args) throws Exception {
		List<Integer> numeros = Arrays.asList( 2,  4,  6,  8, 9, 10,  4, 3);

		// Filtrar os números primos da lista
		if (numeros.isEmpty()) {
			throw new Exception("Lista vazia!");
		} else {
			List<Integer> listaPrimos = numeros.stream().filter(n -> primos(n)).toList();
			if(listaPrimos.isEmpty()) {
				System.out.println("Lista não possui números primos");
			} else {
				System.out.println("Os números primos são: " + listaPrimos);

			}
		}
	}

	private static boolean primos(int numero) {
		for (int i = 2; i < Math.sqrt(numero) + 1; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;

	}
}