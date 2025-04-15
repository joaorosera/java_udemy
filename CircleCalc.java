package udemy;

import java.util.Locale;
import java.util.Scanner;

import entities.Geometry;

public class CircleCalc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio de um círculo: ");
		
		double radius = sc.nextDouble();
		double circleArea = Geometry.circleArea(radius);
		
		System.out.printf("A área do círculo é: %.2f%n", circleArea);
		
		sc.close();

	}

}
