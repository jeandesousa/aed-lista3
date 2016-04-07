package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner buffer = new Scanner(System.in);

		/*
		 * Escreva um algoritmo que lê uma matriz M(5,5) e calcula as somas: 
		 * a) da linha 4 de M. 
		 * b) da coluna 2 de M. 
		 * c) da diagonal principal. 
		 * d) da diagonal secundária. 
		 * e) de todos os elementos da matriz.
		 * f) Escreva estas somas e a matriz.

		 * 
		 */

		int l, c=0, m[][] = new int[5][5], somaln1=0, somaln2=0, somaln3=0, somaln4=0, somaln5=0, somacl=0, somadg1, somadg2, total;

		for (l = 0; l < 5; l++) {
			System.out.printf("Informe os elementos %da. linha:\n", (l + 1));
			for (c = 0; c < 5; c++) {
				System.out.printf("m[%d][%d] = ", l, c);
				m[l][c] = buffer.nextInt();
			}
			System.out.println("");
		}
		somaln1 =+ (m[0][0] +m[0][1] +m[0][2] +m[0][3] +m[0][4]);
		somaln2 =+ (m[1][0] +m[1][1] +m[1][2] +m[1][3] +m[1][4]);
		somaln3 =+ (m[2][0] +m[2][1] +m[2][2] +m[2][3] +m[2][4]);
		somaln4 =+ (m[3][0] +m[3][1] +m[3][2] +m[3][3] +m[3][4]);
		somaln5 =+ (m[4][0] +m[4][1] +m[4][2] +m[4][3] +m[4][4]);
		
		System.out.println("A soma dos elementos linha 4: é: " +somaln4);
		
		somacl =+ (m[0][1] +m[1][1] +m[2][1] +m[3][1] +m[4][1]);
		System.out.println("\nA soma dos elementos da coluna 2 é: " +somacl);
		
		somadg1 =+ (m[0][0] +m[1][1] +m[2][2] +m[3][3] +m[4][4]);
		System.out.println("\nA soma dos elementos da diagonal principal é: " +somadg1);
		
		somadg2 =+ (m[0][4] +m[1][3] +m[2][2] +m[3][1] +m[4][0]);
		System.out.println("\nA soma dos elementos da diagonal secundária é: " +somadg2);
		
		total =+ (somaln1 + somaln2 + somaln3 + somaln4 + somaln5);
		System.out.println("\nA soma de todos os elementos das linhas e colunas é: " +total);
		
		for (l = 0; l < 5; l++) {
			System.out.printf("\n%da. linha: ", (l + 1));
			for (c = 0; c < 5; c++) {
				System.out.printf("%d ", m[l][c]);
			}
		}
	}
}
