package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product newProduct) throws ArgumentError {

		// nie wiem czy to tak czy po porstu sprawdzi� czy produkt ma id
		if (newProduct instanceof Product)
			this.products.add(newProduct);
		else
			throw new ArgumentError();

	}

	public void removeProduct(int productId) {

		for (int i = 0; i < this.products.size(); i++) {
			if (this.products.get(i).getId() == productId) {
				this.products.remove(i);
			}
		}

	}

	public void changeProductQuantity(int productId, int newQuantity) {
		for (int i = 0; i < this.products.size(); i++) {
			if (this.products.get(i).getId() == productId) {
				this.products.get(i).setQuantity(newQuantity);
			}
		}

	}

}
