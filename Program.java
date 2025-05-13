package udemy;

import java.util.Locale;
import java.util.Scanner;

import entities.Product; // Classe que representa um produto (nome e preço)

public class Program {

	public static void main(String[] args) {
		
		// Define o formato numérico como US (usa ponto ao invés de vírgula)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê o número de produtos
		int n = sc.nextInt();
		
		// Cria um vetor de objetos Product com n posições
		Product[] vect = new Product[n];
		
		// Lê os dados dos produtos e armazena no vetor
		for (int i = 0; i < vect.length; i++) {
			// vect.length retorna o tamanho total do vetor (quantidade de elementos)
			// Aqui usamos ele pra percorrer o vetor até o fim, sem precisar usar "n" direto
			sc.nextLine(); // Limpa a quebra de linha pendente
			String name = sc.nextLine(); // Lê o nome do produto
			double price = sc.nextDouble(); // Lê o preço do produto
			vect[i] = new Product(name, price); // Armazena o objeto Product no vetor
		}
		
		double soma = 0.0;
		
		// Soma os preços de todos os produtos
		for (int i = 0; i < vect.length; i++) {
			// Usamos vect.length aqui de novo pra garantir que o loop vai até o final do vetor
			soma += vect[i].getPrice();
		}
		
		// Calcula a média dos preços
		double avg = soma / vect.length;
		// vect.length aqui representa quantos produtos foram inseridos

		// Exibe a média formatada com duas casas decimais
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}
}
