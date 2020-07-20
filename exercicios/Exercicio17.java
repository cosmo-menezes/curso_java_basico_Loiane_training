package lista.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos metros quadrados voce vai pintar? ");
		int metroQuadrado = teclado.nextInt();
		
		int lataTinta = (metroQuadrado / 108);
		System.out.println("Voce vai utilizar " + lataTinta + " lata(s) de tinta para sua pintura." );
		
		int valor = (lataTinta * 80);
		System.out.println("O valor da(s) lata(s) de tinta é R$: " + valor + " reais.");
		
		double galão = (metroQuadrado / 21.6);
		System.out.println("Voce vai utilizar " + galão + " galão(ões) de tinta para sua pintura.");
		
		double preçoGalão = (galão * 25);
		System.out.println("O valor do (s) galão(ões) é R$: " + preçoGalão + " reais");
		
		if ( valor <  preçoGalão) {
			System.out.println("É mais barato comprar a tinta em lata(s).");
		}else {
			System.out.println("É mais barato comprar a tinta em galão(ões).");
		}
		
		
		teclado.close();
		

	}

}
