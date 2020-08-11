package lista.exercicios2;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite su primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		
		if (media >= 9.0 && media <= 10.0 ) {
			aproveitamento = "A";
		}else if (media >= 7.5 && media < 9.00) {
			aproveitamento = "B";
		}else if (media >= 6.0 && media < 7.5) {
			aproveitamento = "C";
		}else if (media >= 4.0 && media < 6.0) {
			aproveitamento = "D";
		}else if (media >= 0 && media < 4.0) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch (aproveitamento) {
			case "A":
			case "B":
			case "C": System.out.println("APROVADO"); break;
			case "D":
			case "E": System.out.println("REPROVADO"); break;
		}
		
		
		
		
		
		
		
		teclado.close();

	}

}
