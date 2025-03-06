package curso_programacao;

import java.util.Locale;

// Configurar para "." em vez de ","
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
/*
	 // Variáveis

		
		// Inteiro
		int y = 32;
		int idade = 31;
		
		// Ponto flutuante
		double x = 10.35784;
		double renda = 4000.0;
		
		// String
		String nome = "João";
		
			System.out.println("Bom dia!");
			System.out.println(y);
			System.out.println(x);
			
			// Controlar casas decimais - 2 casas:
			System.out.printf("%.2f%n", x);
			
			// Controlar casas decimais - 4 casas:
			System.out.printf("%.4f%n", x);
			
			// Configurar para "." em vez de ","
			Locale.setDefault(Locale.US);
			System.out.printf("%.4f%n", x);
			
			// Concatenar elementos
			System.out.println("Resultado = " + x + " Metros");
			
			// Concatenar elementos usando o "printf"
			System.out.printf("Resultado = %.2f metros%n", x);
			
			// Concatenar vários elementos
			System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
*/
			
			
// Exercício de Fixação
        
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products: ");
        System.out.printf("%s, which price is %.2f%n", product1, price1);
        System.out.printf("%s, which price is %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
	}

}
