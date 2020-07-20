package lista.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos voce ganha por hora? ");
		float SalarioHora = teclado.nextFloat();
		
		System.out.println("Quantas horas voce trabalha por mês? ");
		float HorasTrabalhadas = teclado.nextFloat();
		
		//IR (11%)
		//INSS (8%)
		//Sindicato ( 5%)
		
		float SalarioBruto = (SalarioHora * HorasTrabalhadas);
		System.out.println ("Seu salario bruto é " + SalarioBruto + " reais.");
		
		float ImpostoDeRenda = (SalarioBruto * 11) / 100;
		System.out.println ("Voce pagou " + ImpostoDeRenda + " reais de IR." );
		
		float INSS = (SalarioBruto * 8) / 100;
		System.out.println ("Voce pagou " + INSS + " reais de INSS ");
		
		float Sindicato = (SalarioBruto * 5) / 100;
		System.out.println ("Voce pagou " + Sindicato + " reais para o sindicato.");
		
		float SalarioLiquido = (SalarioBruto - (SalarioBruto * 24) / 100);
		System.out.println("Seu salario liquido é: " + SalarioLiquido + " reais.");
		
		
		
		teclado.close();

	}

}
