package lista.exercicios2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		int nota1 = teclado.nextInt();
		
		System.out.println("Digite a segunda nota");
		int nota2 = teclado.nextInt();
		
		int media = (nota1 + nota2) / 2;
		
		if (media == 10){
			System.out.println("APROVADO COM DISTINÇÃO com a media: " + media);
		}else if (media >= 7 ) {
			System.out.println("APROVADO com a media: " + media);
		}else{
			System.out.println("REPROVADO com a media: " + media);
		}
		
		
		
		
		
		
		teclado.close();

	}

}
