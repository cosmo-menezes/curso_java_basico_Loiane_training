package lista.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
	    float nota3 = teclado.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		float nota4 = teclado.nextFloat();
		
		float media = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("A média das notas do aluno é: " + media);
		
		teclado.close();
		

	}

}
