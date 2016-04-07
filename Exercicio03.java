package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);

		/*
		 * Faça um Programa que peça a idade e a altura de 5 pessoas, armazene
		 * cada informação no seu respectivo vetor. Imprima a idade e a altura
		 * na ordem inversa a ordem lida.
		 */

		int altura[] = new int[5];
		int peso[] = new int[5];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.printf("Informe a %2da. altura de %d pessoas: \n", (i + 1), 5);
			altura[i] = buffer.nextInt();
		}
		for (i = 0; i < 5; i++) {
			System.out.printf("Informe o %2do. peso de %d pessoas: \n", (i + 1), 5);
			peso[i] = buffer.nextInt();
		}
		System.out.println("\nVetor de altura na ordem invertida: \n");
		for (i = 4; i >= 0; i--) {
			System.out.printf("altura[%d] = %2d \n", i, altura[i]);
		}
		System.out.println("\nVetor de peso na ordem invertida: \n");
		for (i = 4; i >= 0; i--) {
			System.out.printf("peso[%d] = %2d \n", i, peso[i]);
		}

	}
}