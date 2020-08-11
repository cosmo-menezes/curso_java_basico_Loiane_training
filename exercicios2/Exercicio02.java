package lista.exercicios2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int X = teclado.nextInt();
		
		if(X > 0) {
			System.out.println("Número positivo: " + X);
		}else {
			System.out.println("Número negativo: " + X);
		}
		
		
		
		teclado.close();

	}

}
