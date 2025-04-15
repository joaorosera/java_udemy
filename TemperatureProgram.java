package udemy;

import java.util.Locale;
import java.util.Scanner;

import entities.Temperature;

public class TemperatureProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao conversor de temperaturas!");
		System.out.print("Digite uma temperatura em Celsius para ser convertida em Fahrenheit: ");
		
		double celsius = sc.nextDouble();
		double fahrenheit = Temperature.celsiusToFahrenheit(celsius);
		
		System.out.printf("A temperatura de %.1f°C em Fahrenheit é: %.1f°F%n", celsius, fahrenheit);
		
		sc.close();
	}
}
