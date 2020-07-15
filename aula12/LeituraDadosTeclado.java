package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite eu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura); */
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura, e se tem bichinhos de estimação");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte filho = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean(); 
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("primeiro nome: " + primeiroNome);
		System.out.println("idade: " + idade);
		System.out.println("quantidade de filhos " + filho);
		System.out.println("sua altura: " + altura);
		System.out.println("voce tem algum animal de estimação? " + temPet);
		
		
	}

}
