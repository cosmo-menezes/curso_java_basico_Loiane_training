package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Digite sua senha: ");
		int senha = teclado.nextInt();
		
		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
		
		
		teclado.close();

	}

}
