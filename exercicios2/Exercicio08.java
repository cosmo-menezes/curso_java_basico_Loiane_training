package lista.exercicios2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto");
		double preco1 = teclado.nextDouble();
		
		
		System.out.println("Digite o preço do segundo produto");
		double preco2 = teclado.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto");
		double preco3 = teclado.nextDouble();
		
		if ( preco1 < preco2 && preco1 < preco3) {
			System.out.println("O primeiro produto é mais barato pois custa: R$ " + preco1 + " reais.");
		}else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O segundo produto é mais barato pois custa: R$ " + preco2 + " reais.");
		}else {
			System.out.println("O terceiro produto é mais barato pois custa: R$" + preco3 + " reais.");
		}
		
		
		teclado.close();
				

	}

}
