package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Programa para entrada de dados no console usando Scanner
		// Métodos usados: 
		// - next(): lê uma palavra
		// - nextInt(): lê um número inteiro
		// - nextDouble(): lê um número decimal
		// - next().charAt(0): lê um caractere
		// - nextLine(): lê uma linha inteira

		/* Ler uma palavra */
		/*
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();
		*/

		/* Ler um número inteiro */
		/*
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		sc.close();
		*/

		/* Ler um número decimal */
		/*
		Locale.setDefault(Locale.US); // Define o separador decimal como ponto
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.printf("Você digitou: %.1f%n", x);
		sc.close();
		*/

		/* Ler um caractere */
		/*
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0); // Lê o primeiro caractere da entrada
		System.out.println("Você digitou: " + x);
		sc.close();
		*/

		/* Ler múltiplos valores na mesma linha */
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
		*/

		/* Ler um número e depois múltiplas linhas de texto */
		Scanner sc = new Scanner(System.in);
		
		int x; // Lê um número inteiro
		String s1, s2, s3; // Armazena três linhas de texto
		
		x = sc.nextInt(); // Lê o número inteiro
		sc.nextLine(); // Consome a quebra de linha pendente
		s1 = sc.nextLine(); // Lê a primeira linha
		s2 = sc.nextLine(); // Lê a segunda linha
		s3 = sc.nextLine(); // Lê a terceira linha
		
		// Exibe os valores lidos
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}
