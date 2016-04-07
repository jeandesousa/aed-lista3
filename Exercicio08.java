package br.edu.fameg.ads.aed.lista3;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner buffer = new Scanner(System.in);

		/*
		 * Crie uma matriz 7X8 onde cada elemento é a soma dos índices de sua
		 * posição dentro da matriz;
		 */

		int l, c, m[][] = new int[7][8];
			
		      m[0][0]=+ 0;
		      m[0][1]=+ 1;
		      m[0][2]=+ 2;
		      m[0][3]=+ 3;
		      m[0][4]=+ 4;
		      m[0][5]=+ 5;
		      m[0][6]=+ 6;
		      m[0][7]=+ 7;
		      m[1][0]=+ 1;
		      m[1][1]=+ 2;
		      m[1][2]=+ 3;
		      m[1][3]=+ 4;
		      m[1][4]=+ 5;
		      m[1][5]=+ 6;
		      m[1][6]=+ 7;
		      m[1][7]=+ 8;
		      m[2][0]=+ 2;
		      m[2][1]=+ 3;
		      m[2][2]=+ 4;
		      m[2][3]=+ 5;
		      m[2][4]=+ 6;
		      m[2][5]=+ 7;
		      m[2][6]=+ 8;
		      m[2][7]=+ 9;
		      m[3][0]=+ 3;
		      m[3][1]=+ 4;
		      m[3][2]=+ 5;
		      m[3][3]=+ 6;
		      m[3][4]=+ 7;
		      m[3][5]=+ 8;
		      m[3][6]=+ 9;
		      m[3][7]=+ 10;
		      m[4][0]=+ 4;
		      m[4][1]=+ 5;
		      m[4][2]=+ 6;
		      m[4][3]=+ 7;
		      m[4][4]=+ 8;
		      m[4][5]=+ 9;
		      m[4][6]=+ 10;
		      m[4][7]=+ 11;
		      m[5][0]=+ 5;
		      m[5][1]=+ 6;
		      m[5][2]=+ 7;
		      m[5][3]=+ 8;
		      m[5][4]=+ 9;
		      m[5][5]=+ 10;
		      m[5][6]=+ 11;
		      m[5][7]=+ 12;
		      m[6][0]=+ 6;
		      m[6][1]=+ 7;
		      m[6][2]=+ 8;
		      m[6][3]=+ 9;
		      m[6][4]=+ 10;
		      m[6][5]=+ 11;
		      m[6][6]=+ 12;
		      m[6][7]=+ 13;
		    		  
		      for (l = 0; l < 7; l++) {
					System.out.printf("\n%da. linha: ", (l + 1));
					for (c = 0; c < 8; c++) {
						System.out.printf("%d ", m[l][c]);
					}
		}
	}
}
