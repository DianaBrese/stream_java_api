package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

	public static void main(String[] args) throws Exception {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Encontrar a soma do quadrados de todos os números da lista
		List<Long> elevarAoQuadrado = numeros.stream().map(n -> Math.round(Math.pow(n, 2)) ).toList();
		long somaDosQuadrados = elevarAoQuadrado.stream().reduce((long) 0, (n1, n2) -> n1 + n2);
		
		if(numeros.isEmpty()) {
			throw new Exception("Lista vazia");
		} else {
			System.out.println("A soma dos quadrados é : " + somaDosQuadrados);
		}
		
	}

}
