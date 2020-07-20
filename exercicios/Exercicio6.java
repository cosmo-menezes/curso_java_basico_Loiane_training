package lista.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = teclado.nextFloat();
		
		double area = (raio * raio) * 3.14;
		System.out.println("A area do circulo é: " + area + ";");
		
		teclado.close();
		

	}

}
