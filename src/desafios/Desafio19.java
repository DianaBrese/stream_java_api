package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {

	public static void main(String[] args) throws Exception{
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//Encontrar a soma dos números divisíveis por 3 e 5
		if(numeros.isEmpty()) {
			throw new Exception("Lista vazia!");
		} else {
			int soma = numeros.stream().filter(n -> n % 3 ==0 || n % 5 == 0).reduce(0, (n1, n2) -> n1 + n2);
			System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);
					
		}
	}

}
