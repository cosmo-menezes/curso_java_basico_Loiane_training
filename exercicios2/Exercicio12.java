package lista.exercicios2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quanto voce ganhar por hora: ");
		double valorHora = teclado.nextDouble();
		
		System.out.println("Digite quantas horas voce trabalha por mês: ");
		double horasTrabalhadas = teclado.nextDouble();
		
		
		double salarioBruto = (valorHora * horasTrabalhadas);
		
		int percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		}else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto);
		System.out.println("( - ) IR ( " + percentualIR + " %): " + ir);
		System.out.println("( - ) INSS ( 10% ): " + inss);
		System.out.println("FGTS ( 11 % ): " + fgts);
		System.out.println(" Total de Descontos: " + totalDescontos);
		System.out.println("Salario Liquido: " + salarioLiquido);
		
		
		
		
		
		teclado.close();

	}

}
