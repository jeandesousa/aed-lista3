package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner buffer = new Scanner(System.in);

		int n = 10; 
		int v[] = new int[n]; 
		int i; 

		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = buffer.nextInt();
		}
		
		System.out.println("");
		for (i = 0; i < n; i++) {
			if (v[i] >= 20) {
				System.out.printf("v[%d] = %2d <--- Valor maior que 20\n", i, v[i]);
			}
		}
		for (i = 0; i < n; i++) {
			if (v[i] < 20) {
				JOptionPane.showMessageDialog(null, "Não foi possível achar outro (s) valor (es) maiores do que 20.");
				break;
			}
		}
	}
}