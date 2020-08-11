package lista.exercicios2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual turno voce trabalha? (M - matutino) (V - vespertino) (N - noturno) ?");
		
		String letra = teclado.next();
		
		
		
		if ( letra.equalsIgnoreCase("m")) {
			System.out.println("Voce trabalha no horario (M - matutino): Bom dia! ");
		}else if (letra.equalsIgnoreCase("v")) {
			System.out.println("Voce trabalha no horario (V - vespertino): Boa tarde! ");
		}else if (letra.equalsIgnoreCase("n")){
			System.out.println("Voce trabalha no horario (N - noturno): Boa noite! ");
		}else {
			System.out.println("letra invalida!");
		}
		
		
		
		teclado.close();

	}

}
