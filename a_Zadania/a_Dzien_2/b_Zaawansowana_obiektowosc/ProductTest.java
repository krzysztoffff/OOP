package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class ProductTest {

	public static void main(String[] args) {

		ShoppingCart sc = new ShoppingCart();
		sc.addProduct(new Product("Mas這", "ekstra", 150, 2));
		sc.addProduct(new Product("Ziemniak", "zwyk造", 0.15, 8));
		sc.addProduct(new Product("Cukierek", "s這dki", 2.15, 18));
		sc.addProduct(new Product("Ser", "鄴速y", 24.5, 30));
		sc.addProduct(new Product("Ser", "bia造", 13.84, 21));
		sc.addProduct(new Product("Cukier", "bia造", 2.84, 10));
		sc.addProduct(new Product("Makaron", "sphagetti", 2.47, 2));

		sc.printReceipt();
	}

}
