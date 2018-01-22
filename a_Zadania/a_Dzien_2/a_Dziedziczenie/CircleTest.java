package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class CircleTest {

	public static void main(String[] args) {

		
		Circle c = new Circle(2.2, 5.8, 1.5, "red");
		c.getDiscription();
		Circle c2 = new Circle(5.83, 18.25, 3.01, "blue");
		c2.getDiscription();
		System.out.println(c2.getCircuit());
		
		double cDistance = c.getDistance(c2);
		System.out.println("odl środków kół: "+cDistance);
		
		
		
		
		
		
	}

}
