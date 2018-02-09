package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product newProduct) throws ArgumentError {

		// nie wiem czy to tak czy po porstu sprawdziæ czy produkt ma id
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

	public void printReceipt() {
		double sum = 0.0;
		for (Product p : this.products) {
			System.out.println(
					"Produkt " + p.getId() + ", " + p.getQuantity() + "x" + p.getPrice() + " = " + p.getTotalSum());
			sum += p.getTotalSum();
		}
		System.out.println("Suma:\n" + sum);

	}

}
