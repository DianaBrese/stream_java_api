package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList();	
		
		//Encontrar o maior número primo da lista
		Optional<Integer> numeroPrimo = numeros.stream()
				.filter(n -> isPrimo(n))
				.max((n1, n2) -> Integer.compare(n1, n2));
		
		if(numeroPrimo.isPresent()) {
			System.out.println("O maior número primo da lista é: " + numeroPrimo.get());
		} else {
			System.out.println("Lista vazia!");
		}
	
	}
	
	private static boolean isPrimo(int num) {
		if(num < 2) {
			return false;
		} 
		
		for(int i = 2; i < Math.sqrt(num) +1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
