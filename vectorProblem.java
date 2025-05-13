package udemy;

import java.util.Locale;
import java.util.Scanner;

public class vectorProblem {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê o tamanho do vetor
		int n = sc.nextInt();
		
		// Cria um vetor de números reais com n posições
		double[] vect = new double[n];
		
		// Lê os valores e armazena no vetor
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		// Soma todos os valores do vetor
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		// Calcula a média
		double media = soma / n;
		
		// Exibe a média
		System.out.println("Média = " + media);
		
		sc.close();
	}
}
