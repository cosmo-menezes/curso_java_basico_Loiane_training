package lista.exercicios2;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);

		System.out.println("Entre com o número de litros vendidos: ");
		double litros = teclado.nextDouble();
		
		System.out.println("Entre com o tipo de combustível: ");
		String tipo = teclado.next();
		
		double precoGas = 2.50;
		double precoAlc = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if(tipo.equalsIgnoreCase("a")) {
			
			if(litros <= 20) {
				percDesconto = 3;
			}else {
				percDesconto = 5;
			}
			
			total = litros * precoAlc;
			
		}else if (tipo.equalsIgnoreCase("g")) {
			
			if(litros <= 20) {
				percDesconto = 4;
			}else {
				percDesconto = 6;
			}
			
			total = litros * precoGas;
			
		}
			totalDesconto = (total / 100) * percDesconto;
			
			double precoAPagar = total - totalDesconto;
			
			System.out.println ("O valor a ser pago: " + precoAPagar);
		
		
		
		
		teclado.close();
	}

}
