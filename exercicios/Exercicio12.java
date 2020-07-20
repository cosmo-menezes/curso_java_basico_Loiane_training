package lista.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		Double pesoIdeal = (72.7 * altura) - 58;
		System.out.printf("Seu peso ideal é: " + pesoIdeal + " kg.");
		
		teclado.close();

	}

}
