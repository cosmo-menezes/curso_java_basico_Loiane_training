package lista.exercicios2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do primeiro lado do triangulo: ");
		int lado1 = teclado.nextInt();
	
		System.out.println("Digite o valor do segundo lado do triangulo: ");
		int lado2 = teclado.nextInt();
		
		System.out.println("Digite o valor do terceiro lado do triangulo: ");
		int lado3 = teclado.nextInt();
		
		if ((lado1 + lado2 ) > lado3 ||
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)){
			
			 if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2){
					System.out.println("Esses valores formam um TRIANGULO EQUILÁTERO ");
				}else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
					System.out.println("Esses valores formam um TRIANGULO ISÓSCELES");
				}else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
					System.out.println("Esses valores formam um TRAINGULO ESCALENO");
				}
			
				else {
					System.out.println ("Nao formam um triângulo");
				}
		}
		
		
		
		
		
		teclado.close();

	}

}
