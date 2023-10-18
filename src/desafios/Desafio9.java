package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//Verificar se todos os números da lista são distintos, não se repetem
		List<Integer> seRepete = numeros.stream().distinct().sorted().toList();
		
		long countSeRepete = numeros.stream().distinct().count();
		long countNumeros = numeros.stream().count();
		

		if(countSeRepete != countNumeros) {
			System.out.println("Se repete");
		} else {
			System.out.println("Não se repete");
		}

	}
	
}
