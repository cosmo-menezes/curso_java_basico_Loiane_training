package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		float altura = teclado.nextFloat();
		
		System.out.println("Digite 1 para sexo Masculino e 2 para sexo Feminino");
		double sexo = teclado.nextDouble();
		double pesoIdealmasculino = (altura * 72.7) - 58.0;
		double pesoIdealfeminino = (altura * 62.1) - 44.7;
		
		if (sexo == 1 ) {
			System.out.printf("seu peso ideal é: "+ pesoIdealmasculino + " kg.");
		}if (sexo == 2){
			System.out.printf("seu peso ideal é: "+ pesoIdealfeminino + " kg.");
		}
		
		
		
		teclado.close();

	}

}
