package lista.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Digite o lado do quadrado: ");
		float ladoQuadrado = teclado.nextFloat();
		
		float area = (ladoQuadrado * ladoQuadrado);
		System.out.println("A area do quadrado é: " + area + ";");
		
		float dobro = (area * 2);
		System.out.println("O dobro da area do quadrado é: " + dobro + ";");
		
		teclado.close();
		
	}

}
