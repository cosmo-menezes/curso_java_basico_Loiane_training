package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int N1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int N2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int N3 = teclado.nextInt();
		
		if ( N1 < N2 && N2 < N3 ) {
			System.out.println("A ordem crescente dos numeros é: " + N1 + N2 + N3);
		}else if ( N1 > N2 && N3 > N2) {
			System.out.println("A ordem crescente dos numeros é: " + N2 + N1 + N3);
		}else if ( N3 < N1 && N3 < N2){
			System.out.println("A ordem crescente dos numeros é: " + N3 + N2 + N1);
		}else if (N1 < N2 && N2 > N3) {
			System.out.println("A ordem crescente dos numeros é: " + N1 + N3 + N2);
		}else if (N1 > N2 && N3 > N2) {
			System.out.println("A ordem crescente dos numeros é: " + N2 + N3 + N1);
		}else if (N1 < N2 && N3 < N1) {
			System.out.println("A ordem crescente dos numeros é: " + N3 + N1 + N2);
		}
		 
		
		teclado.close();
	}
	}


