package udemy;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Lê o tamanho da matriz (n x n)
		
		// Instancia uma matriz quadrada de tamanho n
		int[][] mat = new int[n][n];
		
		// Preenche a matriz com os valores informados
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt(); // Lê o valor para cada posição da matriz
			}
		}
		
		// Imprime os elementos da diagonal principal
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		// Conta a quantidade de números negativos na matriz
		int count= 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<n; j++) { // Corrigido o incremento aqui
				if (mat[i][j] < 0) {
					count++; // Soma 1 para cada número negativo
				}
			}
		}
		
		// Imprime a quantidade de números negativos
		System.out.println("\nNegative numbers = " + count);
		
		sc.close(); // Fecha o scanner
	}
}
