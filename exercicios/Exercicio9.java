package lista.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua temperatura em Farenheit: ");
		float Farenheit = teclado.nextFloat();
		
		float temperaturaCelsius = (5 * (Farenheit - 32) / 9);
		System.out.println("Sua temperatura em Celsius é: " + temperaturaCelsius + " graus.");
		
		
		
		teclado.close();

	}

}
