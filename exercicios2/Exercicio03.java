package lista.exercicios2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra: (M ou F): ");
		String letra = teclado.next();
		
		if( letra.equalsIgnoreCase("m") ) {
			System.out.println("M - sexo masculino");
		}else if( letra.equalsIgnoreCase("f") ) {
			System.out.println("F - sexo feminino");
		}else {
			System.out.println("Sexo inválido!");
		}
		
		
		teclado.close();

	}

}
