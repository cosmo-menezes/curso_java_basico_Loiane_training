package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao08 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantos lados tem o poligono? ");
		int lado = teclado.nextInt();
		if (lado < 3) {
			System.out.println("NÃO É UM POLIGONO");
		}
		if (lado > 5) {
			System.out.println("POLIGONO NÃO IDENTIFICADO");
		}
		
		System.out.println("Digite a medida dos lado em cm ");
		int medida = teclado.nextInt();
		
		int triangulo = ((medida * medida) / 2);
		
		int quadrado = (medida * medida);
		
		int pentagono = (((medida * medida) / 2) * 10);
		
		
		if (lado == 3) {
			System.out.println("TRIANGULO com area de: " + triangulo + " cm. ");
		} 
		else if (lado == 4) {
			System.out.println("QUADRADO com area de: " + quadrado + " cm. ");
		} 
		else if (lado == 5) {
			System.out.println("PENTAGONO com area de: " + pentagono + " cm.");
		}
	
		
		
		teclado.close();

	

	}

}
