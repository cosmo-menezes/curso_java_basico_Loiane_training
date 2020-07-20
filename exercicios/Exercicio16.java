package lista.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos metros quadrados voce vai pintar? ");
		int metroQuadrado = teclado.nextInt();
		
		int lataTinta = (metroQuadrado / 54);
		System.out.println("Voce utilizará " + lataTinta + " lata(s) de tinta para sua pintura. ");

	
		int valor = (lataTinta * 80);
		System.out.println("O valor da(s) lata(s) será de R$: " + valor + " de reais.");
		
	
		
		
		teclado.close();

	}

}
