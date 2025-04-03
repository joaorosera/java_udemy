package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_Vector {

    public static void main(String[] args) {

        // Configura a localização para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Solicita o número de pessoas que serão digitadas
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        // Declaração de vetores para armazenar os dados das pessoas
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Entrada de dados das pessoas
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.println("Nome: ");
            nomes[i] = sc.next(); // Lê o nome da pessoa
            System.out.println("Idade: ");
            idades[i] = sc.nextInt(); // Lê a idade
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble(); // Lê a altura
        }

        // Cálculo da altura média
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i]; // Soma todas as alturas
        }
        double mediaAlturas = soma / n; // Calcula a média

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas); // Exibe a altura média

        // Contagem de pessoas com menos de 16 anos
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont++; // Conta quantas pessoas têm menos de 16 anos
            }
        }

        // Cálculo da porcentagem de pessoas com menos de 16 anos
        double percent = cont * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        // Exibição dos nomes das pessoas com menos de 16 anos
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]); // Exibe o nome da pessoa
            }
        }

        sc.close(); // Fecha o scanner
    }
}
