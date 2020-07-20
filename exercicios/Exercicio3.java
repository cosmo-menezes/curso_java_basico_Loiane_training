package lista.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = teclado.nextInt();
		System.out.println("Digite outro numero");
		int y = teclado.nextInt();
		int soma = x + y; 
		System.out.println("A soma dos numeros x e y é: " + soma + ".");
		
		teclado.close();
		

	}

}
