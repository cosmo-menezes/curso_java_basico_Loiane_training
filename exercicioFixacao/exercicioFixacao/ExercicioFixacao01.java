package exercicio.fixacao;

import java.util.Scanner;

public class ExercicioFixacao01 {

	public static void main(String[] args) {
	
		        Scanner teclado = new Scanner(System.in);
		        
		        System.out.println("Digite o primeiro numero: ");
		        int X = teclado.nextInt();
		        
		        System.out.println("Digite o segundo numero: ");
		        int Y = teclado.nextInt();
		        
		        if(X > Y){
		            System.out.println("O numero " + X + " é maior.");
		        }else {
		            System.out.println("O numero " + Y + " é maior.");
		        }
		        
		        teclado.close();
		    }
		    
				
	}

