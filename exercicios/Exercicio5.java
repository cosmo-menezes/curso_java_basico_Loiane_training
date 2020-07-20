package lista.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantos metros de areia voce precisa comprar? ");
		float x = teclado.nextFloat();
		
		float centimetros = (x * 100);
		
		System.out.println(+ x + " metro(s) de areia, equivalem a: "+ centimetros+ " centimetro(s) de areia.");
		
		teclado.close();
		
	}

}
