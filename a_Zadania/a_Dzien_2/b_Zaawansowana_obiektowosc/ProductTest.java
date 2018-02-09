package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class ProductTest {

	public static void main(String[] args) {
		// tworz� obiekt
		ShoppingCart sc = new ShoppingCart();
		// dodaj� produkty
		sc.addProduct(new Product("Mas�o", "ekstra", 150, 2));
		sc.addProduct(new Product("Ziemniak", "zwyk�y", 0.15, 8));
		sc.addProduct(new Product("Cukierek", "s�odki", 2.15, 18));
		sc.addProduct(new Product("Ser", "��ty", 24.5, 30));
		sc.addProduct(new Product("Ser", "bia�y", 13.84, 21));
		sc.addProduct(new Product("Cukier", "bia�y", 2.84, 10));
		sc.addProduct(new Product("Makaron", "sphagetti", 2.47, 2));
		// zmieniam ilo��produktu nr 7 czyli makaronu. By�o 2 na parakonie pojawi si� 3
		sc.changeProductQuantity(7, 3);
		// usuwam produkt o id 3 na parogonie nie pojawi si�
		sc.removeProduct(3);
		//drukuj� paragon
		sc.printReceipt();
	}

}
