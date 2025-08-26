package br.com.cod3r.iterator.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {
	
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	public static void main(String[] args) {
		Cart cart = new Cart(new Product("Caneta Bic", 2d), 
				new Product("Lápis de Cor", 60.99d), 
				new Product("Caneta normal", 3.5d),
				new Product("Borracha", 2d),
				new Product("Tesoura", 5d));
		
		for (Product prod: cart) {
			System.out.println(String.format("%s = %.2f", prod.getDesc(), prod.getValue()));
		}
			
		Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = stream.reduce(0d, (acc, prod) -> acc + prod.getValue(), Double::sum);
		//System.out.println("Total: "+ round(sum,2));
		System.out.printf("Total: %.2f", round(sum,2));
	}
}
