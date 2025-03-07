package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args) {
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();*/
		
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.printf("Soma = %d%n", soma);
		
		
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		
		int soma2 = n3 + n4;
		
		System.out.printf("Soma = %d%n", soma2);
		
		
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		
		int soma3 = n5 + n6;
		
		System.out.printf("Soma = %d%f", soma3);
		
		sc.close();*/
		
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("Diferenca = %d%n", diferenca);
		
		sc.close();
	}
}
