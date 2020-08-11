package lista.exercicios2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro");
		int N1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero inteiro");
		int N2 = teclado.nextInt();
		
		if(N1 > N2 ) {
			System.out.println("O maior numero é: " + N1);
		}else {
			System.out.println("O maior numero é: " + N2);
		}
		
		
		
		
		teclado.close();

	}

}
