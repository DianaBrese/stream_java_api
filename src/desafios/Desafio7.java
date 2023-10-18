package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Encontre o segundo número maior da lista
		int segundoMaior =  numeros.stream().sorted((n1, n2) -> Integer.compare(n2, n1)).distinct().skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Lista vazia"));
		
		System.out.println("O segundo maior número da lista é " + segundoMaior);

	}

}
