package lista.exercicios2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		
		int numero = teclado.nextInt();
		
		if ( numero < 1 || numero > 7) {
			System.out.println("numero invalido");
		}else {
			
			switch (numero) {
				case 1 : 
					System.out.println("domingo"); break;
				case 2 :
					System.out.println("segunda-feira"); break;
				case 3 :
					System.out.println("terça-feira"); break;
				case 4 :
					System.out.println("quarta-feira"); break;
				case 5 :
					System.out.println("quinta-feira"); break;
				case 6 :
					System.out.println("sexta-feira"); break;
				case 7 :
					System.out.println("sabado"); break;
				default : 
			}
			
		}
		
		
		
		
		teclado.close();

	}

}
