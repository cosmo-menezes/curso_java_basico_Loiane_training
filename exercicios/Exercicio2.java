package lista.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int x = teclado.nextInt();
		System.out.println("O numero digitado foi: " + x + ".");
		
		teclado.close();
		
	}

}
