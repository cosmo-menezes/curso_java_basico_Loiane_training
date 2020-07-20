package lista.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite sua temperatura em graus Celsius: ");
		float temperaturaCelsius = teclado.nextFloat();
		
		float temperaturaFarenheit = ((temperaturaCelsius * 9/5) + 32);
		System.out.println("Sua temperatura Farenheit é: " + temperaturaFarenheit + " graus.");
		
		teclado.close();

	}

}
