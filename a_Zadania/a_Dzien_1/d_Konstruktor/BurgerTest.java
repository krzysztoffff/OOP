package a_Zadania.a_Dzien_1.d_Konstruktor;

public class BurgerTest {
	
	public static void main(String[] args) {
		
		Burger burger = new Burger("medium", 15.99); 
		
		System.out.println(burger.getSize());
		
		Burger burger2 = new Burger();
		burger2.setPrice(23.99);
		burger2.setSize("Extra");
		System.out.println(burger2.getSize());
	}

}
