package lista.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o tamanho do arquivo em MegaBytes (MB)? ");
		float tamanhoArquivo = teclado.nextFloat();
		
		System.out.println("Qual a velocidade de download? ");
		float velocidade = teclado.nextFloat();
		
		float download = (tamanhoArquivo / velocidade ) / 60;
		System.out.println("O tempo de download é de " + download + " minuto(s).");
		
		
		
		teclado.close();

	}

}
