package lista.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Quanto voce ganha por hora? ");
		float horas = teclado.nextFloat();
		
		System.out.println("Quantas horas voce trabalha por mês? ");
		float hrTrabalhadas = teclado.nextFloat();
		
		float salario = (horas * hrTrabalhadas);
		System.out.println("Seu salario mensal é: "+ salario + " reais.");
		
		
		teclado.close();

	}

}
