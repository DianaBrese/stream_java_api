package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

	public static void main(String[] args) throws Exception{
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Agrupar os números em pares e impares
		if(numeros.isEmpty()) {
			throw new Exception("Lista vazia");
		} else {
			List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
			List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();
			System.out.println("Números pares: " + pares);
			System.out.println("Números impares: " + impares);

		}
		
	}

}
