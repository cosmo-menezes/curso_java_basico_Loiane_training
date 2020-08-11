package lista.exercicios2;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = teclado.nextDouble();
		
		System.out.println("Digite outro número: ");
		double numero2 = teclado.nextDouble();
		
		System.out.println("Entre com a operação (+ - / * ): ");
		String operacao = teclado.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+": resultado = numero1 + numero2; break;
			case "-": resultado = numero1 - numero2; break;
			case "/": resultado = numero1 / numero2; break;
			case "*": resultado = numero1 * numero2; break;
			default : 
				System.out.println("Operação Inválida"); 
				valida = false;		
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("resultado positivo");
				
			}else {
				System.out.println("resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("resultado par");
			}else {
				System.out.println("resultado ímpar");
			}
		}
		
		
		teclado.close();

	}

}
