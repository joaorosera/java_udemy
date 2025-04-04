package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class DollarChallenge {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double boughtDollars = sc.nextDouble();
		
		double amountToBePaid = CurrencyConverter.convert(dollarPrice, boughtDollars);
		
		System.out.printf("Amount to be paid in Reais: %.2f%n", amountToBePaid);
		
		sc.close();

	}

}
