package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner buffer = new Scanner(System.in);

		/*
		 * Escrever um algoritmo para ler uma matriz (7,4) contendo valores
		 * inteiros (supor que os valores são distintos). Após, encontrar o
		 * menor valor contido na matriz e sua posição.
		 */

		int m[][] = new int[3][3];
		int l, c;

		for (l = 0; l < 3; l++) {
			for (c = 0; l < 3; c++) {
				System.out.println("Digite " + "a opção " + l + "-" + c + ":");
				m[3][3] = buffer.nextInt();
			}
			for (l = 0; l < 3; l++) {
				for (c = 0; l < 3; c++) {
				if (m[3][3] < 20) {
					System.out.printf("v[%d] = %2d <--- Valor menor que 20\n", l, c, m[3][3]);
				}
			}
		}
		}
	}

}
