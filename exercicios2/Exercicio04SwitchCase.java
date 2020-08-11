package lista.exercicios2;

import java.util.Scanner;

public class Exercicio04SwitchCase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = teclado.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida !");
		}else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": 
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": 
				System.out.println ("vogal: " + letra);
			break;
			default: 
				System.out.println ("consoante: " + letra);
			}
		}
		
		
			
			
		
		
		
		teclado.close();

	}

}
