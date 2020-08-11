package lista.exercicios2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digie o segundo numero: ");
		int n2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int n3 = teclado.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("numeros em ordem decrescente: " + n1 +" "+ n2 +" "+ n3);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("numeros em ordem decrescente: " + n2 +" "+ n3 +" "+ n1);
		}else {
			System.out.println("numeros em ordem decrescente: " + n3 +" "+ n2 +" "+ n1);
		}
		
		
		
		
		teclado.close();

	}

}
