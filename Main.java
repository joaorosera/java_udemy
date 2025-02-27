// import java.util.Locale;

// public class Main {

//     public static void main(String[] args) {

//         double x = 10.2345;
//         String nome = "João";
//         int idade = 31;
//         double renda = 4000.0;
//         System.out.println(x);
//         System.out.printf("%.2f%n", x);
//         System.out.printf("%.4f%n", x);
//         Locale.setDefault(Locale.US);
//         System.out.printf("%.4f%n", x);
//         System.out.println("Resultado = " + x + " Metros");
//         System.out.printf("Resultado = %.2f metros%n", x);
//         System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
//     }
// }

import java.util.Locale;

public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'f';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products: ");
    System.out.printf("%s which price is $ %.2f%n", product1, price1);
    System.out.printf("%s which price is $ %.2f%n", product2, price2);
    System.out.println();
    System.out.printf("Record: %d years old, %d and gender: %s", age, code, gender);
    System.out.println();
    System.out.printf("Measure with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded: %.3f%n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f", measure);
}