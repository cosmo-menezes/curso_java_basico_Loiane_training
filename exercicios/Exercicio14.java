package lista.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o peso de seus peixes: ");
		float pesoPeixe = teclado.nextFloat();
		
		
		
		if (pesoPeixe >= 50.0 ) {
			double multa = (pesoPeixe - 50.0);
			double valorMulta = (multa * 4.00);
			System.out.println("O peso de sua mercadoria excedeu o limite maximo estabelecido em: " + multa + " kg. E o valor de sua multa é de " + valorMulta + " de reais.");
			
		}else {
			System.out.println("O peso de sua mercadoria é: " + pesoPeixe + " kg e está dentro dos limites de peso estabelecidos");
		}
		
		
		
		teclado.close();

	}

}
