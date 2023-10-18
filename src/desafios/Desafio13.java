package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Filtrar os números que estão dentro de um intervalo

		if (numeros.isEmpty()) {
			throw new Exception("Lista vazia!");

		} else {
			System.out.println("Digite um intervalo de início");
			int intervaloInicio = sc.nextInt();
			System.out.println("Digite um intervalo de término");
			int intervaloTermino = sc.nextInt();

			List<Integer> numerosFiltrados = numeros.stream().filter(n -> n >= intervaloInicio && n <= intervaloTermino)
					.toList();

			System.out.println("Os números da lista dentro do intervalo são: " + numerosFiltrados);

		}

		sc.close();

	}

}
