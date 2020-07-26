package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int n3 = teclado.nextInt();
		;
		if ( n1 > n2 &&  n1 > n3 ){
			System.out.println("O maior numero é: " + n1);	
		}else if(n2 > n1 && n2 > n3 ) {
			System.out.println("O maior numero é: " + n2);
		}else if(n3 > n1 && n3 > n2) {
			System.out.println("O maior numero é: " + n3);
		}
		
		
		
		
		teclado.close();

	}

}
