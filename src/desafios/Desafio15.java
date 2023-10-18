package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

	public static void main(String[] args) throws Exception {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Verifique se a lista contém pelo menos um número negativo
		boolean possuiNegativo = numeros.stream().anyMatch(n -> n < 0);
		List<Integer> negativos = numeros.stream().filter(n -> n < 0).toList();

		if (numeros.isEmpty()) {
			throw new Exception("Lista vazia!");
		} else {

			if (possuiNegativo) {
				System.out.println("Os números negativos são: " + negativos);
			} else {
				System.out.println("A lista não possui números negativos");
			}

		}

	}

}
