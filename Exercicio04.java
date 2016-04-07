package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia dois vetores com 10 elementos cada. Gere um
		 * terceiro vetor de 20 elementos, cujos valores deverão ser compostos
		 * pelos elementos intercalados dos dois outros vetores.
		 */
		
		Scanner buffer = new Scanner(System.in);

		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[20];
		int i;

		for (i = 0; i < 10; i++) {
			System.out.printf("Informe o %2do. valor de %d valores do vetor1: ", (i + 1), 10);
			v1[i] = buffer.nextInt();
		}
		System.out.println("");
		for (i = 0; i < 10; i++) {
			System.out.printf("Informe o %2do. valor de %d valores do vetor2: ", (i + 1), 10);
			v2[i] = buffer.nextInt();
		}
		for (i = 0; i < 20; i++) {

			v3[0] =+ v1[0];
			v3[1] =+ v1[1];
			v3[2] =+ v1[2];
			v3[3] =+ v1[3];
			v3[4] =+ v1[4];
			v3[5] =+ v1[5];
			v3[6] =+ v1[6];
			v3[7] =+ v1[7];
			v3[8] =+ v1[8];
			v3[9] =+ v1[9];
			v3[10] =+ v2[0];
			v3[11] =+ v2[1];
			v3[12] =+ v2[2];
			v3[13] =+ v2[3];
			v3[14] =+ v2[4];
			v3[15] =+ v2[5];
			v3[16] =+ v2[6];
			v3[17] =+ v2[7];
			v3[18] =+ v2[8];
			v3[19] =+ v2[9];
			
		}
		
		System.out.println("");
		
		for (i = 0; i < 20; i++) {

			System.out.printf("vetor3: posição [%d] = %2d \n", i, v3[i]);
		}

	}

}
