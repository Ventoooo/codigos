package CurrencyConverter;

public class converter {
	
	public static final double TAX = 6;
	
	public static double to_dollar(double valor, double DOLLAR) {
		double x = (DOLLAR*valor)*TAX/100;
		return DOLLAR*valor + x;
	}
}
