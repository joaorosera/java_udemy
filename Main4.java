package curso_programacao;

public class Main4 {
	public static void main(String[] args) {
		// Programa para demonstrar operações matemáticas em Java
		// Métodos usados da classe Math:
		// - sqrt(x): calcula a raiz quadrada de x
		// - pow(x, y): calcula x elevado à potência de y
		// - abs(x): retorna o valor absoluto de x (módulo)

		// Declaração de variáveis
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		// Cálculo da raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		// Cálculo de potência
		A = Math.pow(x, y); // x elevado a y
		B = Math.pow(x, 2.0); // x ao quadrado
		C = Math.pow(5.0, 2.0); // 5 ao quadrado
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		// Cálculo do valor absoluto
		A = Math.abs(y); // Valor absoluto de y (número positivo)
		B = Math.abs(z); // Valor absoluto de z (módulo de um número negativo)
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}
