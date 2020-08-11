package lista.exercicios2;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o tipo da carne: ");
		System.out.println("1 - Filé duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		
		int tipo = teclado.nextInt();
		
		System.out.println("Entre com a quantidade (kg): ");
		
		double quantidade = teclado.nextDouble();
		double precoKg = 0;
		
		if(tipo == 1) {
			
			System.out.println(quantidade + "kg - Filé duplo");
			
			if(quantidade < 5) {
				precoKg = 4.90;
			}else {
				precoKg = 5.80;
			}
		}else if (tipo == 2) {
			
			System.out.println(quantidade + "kg - Alcatra");
			
			if(quantidade < 5) {
				precoKg = 5.90;
			}else {
				precoKg = 6.80;
			}
		}else if (tipo == 3) {
			
			System.out.println(quantidade + "kg - Picanha");
			
			if(quantidade < 5) {
				precoKg = 6.90;
			}else {
				precoKg = 7.80;
			}
			
		}
		
		double total = (quantidade * precoKg);
		System.out.println(quantidade + " kg " + precoKg + " = " + total);
		
		System.out.println("Compra no cartão? Digite 1 para sim: ");
		int cartao = teclado.nextInt();
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar " + (total - desconto));
		}else {
			System.out.println("Valor a pagar " + total);
		}
		
		teclado.close();

	}

}
