package tests;

import java.util.Locale;
import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		
		Main21class rectangle = new Main21class();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retângulo: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Digite o valor da altura do retângulo: ");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("O valor da Area é %.2f%n: ", rectangle.area());
		System.out.printf("O valor do Perímetro é %.2f%n: ", rectangle.perimeter());
		System.out.printf("O valor da Diagonal é %.2f%n: ", rectangle.diagonal());
	}

}


