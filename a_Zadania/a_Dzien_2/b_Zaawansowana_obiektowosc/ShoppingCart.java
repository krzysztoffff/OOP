package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product newProduct) throws ArgumentError {

		// nie wiem czy to tak czy po porstu sprawdziæ czy produkt ma id
		if (newProduct instanceof Product) {
			// Je¿eli produktów jest wiêcej ni¿ 3 dajemy rabat.
			// To zadzia³a je¿eli w trakcie usuniemy produkt.
			// inaczej je¿eli bêdê sprawdza³ po id a w trakcie
			// usunê produkt id mo¿e byæ
			// wiêksze ni¿ 3 a produktów byæ mniej ni¿ 3
			if (this.products.size() > 3) {
				double newPrice = newProduct.getPrice() * 0.8;
				newProduct.setPrice(newPrice);
				newProduct.setIsDiscount("Po rabacie ");
			}
			this.products.add(newProduct);

		} else
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
			System.out.print("Produkt " + p.getId() + ", " + p.getQuantity() + "x" + p.getPrice() + " " + p.getIsDiscount() + " = ");
			
			System.out.format("%.2f%n", p.getTotalSum());
			sum += p.getTotalSum();
		}
		System.out.print("Suma:\n");
		System.out.format("%.2f%n", sum);

	}

}
