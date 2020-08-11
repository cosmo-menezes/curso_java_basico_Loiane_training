package lista.exercicios2;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = teclado.nextInt();
		
		if ( a == 0 ) {
			System.out.println("Não é uma equação de segundo grau!");
		} else {
			
			System.out.println("Digite o valor de b: ");
			int b = teclado.nextInt();
			
			System.out.println("Digite o valor de c: ");
			int c = teclado.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais. O delta é negativo. ");
			}else {
				
				System.out.println ("Delta = " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta) / (2 * a));
				double x2 = ((-b) - Math.sqrt(delta) / (2 * a));
				
				System.out.println ("x1 = " + x1);
				System.out.println ("x2 = " + x2);
			}
			
		}
		
		
		
		
		
		
		teclado.close();

	}

}
