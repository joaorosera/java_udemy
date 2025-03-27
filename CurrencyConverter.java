package util;

public class CurrencyConverter {

    public static final double IOF = 0.06; 

    public static double convert(double dollarPrice, double boughtDollars) {
        double totalWithoutIOF = dollarPrice * boughtDollars;
        double totalWithIOF = totalWithoutIOF * (1 + IOF); 
        return totalWithIOF; 
    }
}
