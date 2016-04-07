package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner buffer = new Scanner(System.in);

		/*
		 * Faça um algoritmo para ler uma matriz de 3×4 de números reais e
		 * depois exibir o elemento do canto superior e do canto inferior
		 * esquerdo.
		 */
		
	    int l, c, m[][] = new int[3][4];

	    for (l=0; l < 3; l++) {
	      System.out.printf("Informe os elementos %da. linha:\n", (l+1));
	      for (c=0; c < 4; c++) {
	        System.out.printf("m[%d][%d] = ", l, c);
	        m[l][c] = buffer.nextInt();
	      }
	      System.out.printf("\n");
	    }

	    System.out.printf("\n");
	    for (l=0; l < 3; l++) {
	      System.out.printf("%da. linha: ", (l+1));
	      for (c=0; c < 4; c++) {
	        System.out.printf("%d ", m[l][c]);
	      }
	      System.out.printf("\n");
		}

		System.out.println("\nElemento do canto superior direito é: " + m[0][0]);
		System.out.println("\nElemento do canto inferior esquerdo é: " + m[2][3]);
	}

}
