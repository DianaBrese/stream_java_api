package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

	public static void main(String[] args) throws Exception {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Agrupe os valores ímpares múltiplos de 3 ou de 5
		List<Integer> resultado = numeros.stream().filter(n -> n % 2 == 1 && n % 3 == 0 || n % 2 == 1 && n % 5 == 0)
				.toList();
		
		if(numeros.isEmpty()) {
			throw new Exception("Lista está vazia"); 
		} else {
			System.out.println(resultado);
		}

	}

}
