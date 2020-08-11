package lista.exercicios2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = teclado.next();
		
		if( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {
			System.out.println("Voce digitou uma vogal: " + letra);
		}else {
			System.out.println("Voce digitou uma consoante: " + letra);
		}
		
		
		
		teclado.close();

	}

}
