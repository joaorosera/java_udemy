package curso_programacao;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.printf("A soma é: %d%n", soma);
		
		sc.close();

	}

}
