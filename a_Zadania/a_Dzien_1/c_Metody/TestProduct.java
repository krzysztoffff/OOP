package a_Zadania.a_Dzien_1.c_Metody;

public class TestProduct {
	
	public static void main(String[] args) {
		Product product = new Product();
		System.out.println(product.getName());
		product.setName("ajFon");
		System.out.println(product.getName());
//		product.name = "samsunk"; tak nie można
//		System.out.println(product.name); też nie możliwe
	}

}
