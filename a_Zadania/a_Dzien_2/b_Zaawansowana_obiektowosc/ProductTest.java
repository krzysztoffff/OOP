package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class ProductTest {

	public static void main(String[] args) {

		ShoppingCart sc = new ShoppingCart();
		sc.addProduct(new Product("Mas�o", "ekstra", 150, 2));
		sc.addProduct(new Product("Ziemniak", "zwyk�y", 0.15, 8));
		sc.addProduct(new Product("Cukierek", "s�odki", 2.15, 18));
		sc.addProduct(new Product("Ser", "��ty", 24.5, 30));
		sc.addProduct(new Product("Ser", "bia�y", 13.84, 21));
		sc.addProduct(new Product("Cukier", "bia�y", 2.84, 10));
		sc.addProduct(new Product("Makaron", "sphagetti", 2.47, 2));

		sc.printReceipt();
	}

}
