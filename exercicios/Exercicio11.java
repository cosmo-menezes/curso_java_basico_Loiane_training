package lista.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite dois numeros inteiros: ");
		double N1 = teclado.nextDouble();
		double N2 = teclado.nextDouble();
		
		System.out.println("Digite um numero real: ");
		float N3 = teclado.nextFloat();
		
		double produto = (N1 * N1) + (N2 / 2);
		System.out.println("O produto do dobro de N1 + metade de N2 é: " + produto);
		
		double soma = (N1 * N1 * N1) + N3;
		System.out.println("A soma do triplo de N1 com N3 é: " + soma);
		
		double cubo = (N3 * N3 * N3);
		System.out.println("O cubo de N3 é: " + cubo);
		
		
		
		
		teclado.close();

	}

}
