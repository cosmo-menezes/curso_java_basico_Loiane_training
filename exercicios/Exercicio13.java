package lista.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Digite 1 para o sexo Masculino ou 2 para o sexo feminino ");
		int sexo = teclado.nextInt();
		
		if (sexo == 1) {
			double pesoIdealHomem = ((72.7 * altura) - 58); 
			System.out.printf("%n Seu peso ideal é: " + pesoIdealHomem +" kg.");
		}else if (sexo == 2){ 

			double pesoIdealMulher = ((62.1 * altura) - 44.7);
			System.out.printf("%n Seu peso ideal é: " + pesoIdealMulher +" kg.");
			
		}
	
		
		
		teclado.close();

	}

}
