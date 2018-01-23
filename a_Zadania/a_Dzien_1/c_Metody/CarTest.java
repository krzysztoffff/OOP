package a_Zadania.a_Dzien_1.c_Metody;

public class CarTest {
	
	
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setBrand("Ferrari");
		c.setModel("Testarossa");
		c.setPrice(123456.11);
		System.out.println(c.toString());
	}

}
