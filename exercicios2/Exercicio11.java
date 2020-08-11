package lista.exercicios2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite seu salario: ");
			double salario = teclado.nextDouble();
			
			int percentual = 0;
			if (salario <= 280) {
				percentual = 20;		
			}else if (salario > 280 && salario < 700) {
				percentual = 15;
			}else if (salario > 700 && salario < 1500) {
				percentual = 10;
			}else if (salario > 1500){
				percentual = 5;
			}
			
			double reajuste = (salario / 100) * percentual;
			double salarioAjustado = salario + reajuste;
			
			System.out.println("Salario " + salario);
			System.out.println("Percentual " + percentual);
			System.out.println("Reajuste " + reajuste);
			System.out.println("Salario Ajustado " + salarioAjustado);
			
		
			
			teclado.close();

	}

}
