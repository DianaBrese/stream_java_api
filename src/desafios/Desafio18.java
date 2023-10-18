package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {

	public static void main(String[] args) throws Exception{
		List<Integer> numeros = Arrays.asList();
		
		//Verificar se todos os números da lista são iguais
		if(numeros.isEmpty()) {
			throw new Exception("Lista vazia");
		} else {
			boolean saoIguais = numeros.stream().distinct().count() == 1;
			
			if(saoIguais) {
				System.out.println("Todos os números são iguais");
			} else {
				System.out.println("Os números não são todos iguais");
			}
		}
	}

}
