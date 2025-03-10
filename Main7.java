// Exercícios If e Else

package curso_programacao;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		// Exercício 1
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Qual número?"); int numero = sc.nextInt();
		 * 
		 * if (numero < 0) { System.out.println("O número é negativo!"); } else if
		 * (numero >= 1) { System.out.println("O número é não negativo!"); } else if
		 * (numero >= 0) { System.out.println("O número é não negativo!"); }
		 * 
		 * sc.close();
		 */

		// Exercício 2
		/*
		 Scanner sc = new Scanner(System.in);

		System.out.println("Qual número?");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é PAR!");
		} else {
			System.out.println("O número é ÍMPAR!");
		}

		sc.close();
		*/
		
		// Exercício 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0) {
			System.out.println("São múltiplos!");
		}
		if (n2 % n1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos!");
		}

	}
}
