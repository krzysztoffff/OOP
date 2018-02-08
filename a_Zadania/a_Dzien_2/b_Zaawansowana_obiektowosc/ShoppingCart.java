package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
	
	private List<Product> products = new ArrayList<>();
	
	
	public void addProduct(Product newProduct) throws ArgumentError{
		
		if (newProduct instanceof Product) 
			this.products.add(newProduct);
		else
			throw new ArgumentError(); 
		
	}
	
	
	
}
