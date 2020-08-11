package lista.exercicios2;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de morango (kg): ");
		double qtdMorango = teclado.nextDouble();
		
		System.out.println("Entre com a quantidade de maçã (kg): ");
		double qtdMaca = teclado.nextDouble();
		
		double precoKgMorango = 0;
		double precoKgMaca = 0;
		if(qtdMorango <= 5) {
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}
		
		if(qtdMaca <= 5) {
			precoKgMaca = 1.8;
		}else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Preço total " + precoTotal);
		
		teclado.close();

	}

}
