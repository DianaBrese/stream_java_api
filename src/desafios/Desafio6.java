package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Verificar se a lista contem algum n[umero maior que 10;
		boolean maiorQue10 = numeros.stream().anyMatch(n -> n > 10);

		if (maiorQue10) {
			List<Integer> resultado = numeros.stream().filter(n -> n > 10).toList();
			System.out.println("Os numeros maiores que 10 são: " + resultado);
					
		} else {
			System.out.println("Não contém nenhum número acima de 10 na lista");
		}
	}
}
