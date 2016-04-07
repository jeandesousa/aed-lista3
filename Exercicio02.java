package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);

		int n = 20; 
		int v[] = new int[n]; 
		int i; 

		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = buffer.nextInt();
		}
		
		System.out.println("");
		for (i = 0; i < n; i++) {
			if (v[i] == 10) {
				System.out.printf("Posição: [%d] <--- Valor igual a 10.\n", i);
			}
		}
	}
}