package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class ProductTest {

	public static void main(String[] args) {
		// tworzê obiekt
		ShoppingCart sc = new ShoppingCart();
		// dodajê produkty
		sc.addProduct(new Product("Mas³o", "ekstra", 150, 2));
		sc.addProduct(new Product("Ziemniak", "zwyk³y", 0.15, 8));
		sc.addProduct(new Product("Cukierek", "s³odki", 2.15, 18));
		sc.addProduct(new Product("Ser", "¿ó³ty", 24.5, 30));
		sc.addProduct(new Product("Ser", "bia³y", 13.84, 21));
		sc.addProduct(new Product("Cukier", "bia³y", 2.84, 10));
		sc.addProduct(new Product("Makaron", "sphagetti", 2.47, 2));
		// zmieniam iloœæproduktu nr 7 czyli makaronu. By³o 2 na parakonie pojawi siê 3
		sc.changeProductQuantity(7, 3);
		// usuwam produkt o id 3 na parogonie nie pojawi siê
		sc.removeProduct(3);
		//drukujê paragon
		sc.printReceipt();
	}

}
