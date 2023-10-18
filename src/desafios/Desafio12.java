package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {

	public static void main(String[] args) throws Exception {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Encontre o produto de todos os números da lista
		int produto = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
		
		if(numeros.isEmpty()) {
			throw new Exception("Lista está vazia");
		} else {
			System.out.println("O produto de todos os números da lista é: " + produto);
		}
	}

}
