package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class AdvancedCalculatorTest {

	public static void main(String[] args) {

		AdvancedCalculator cal = new AdvancedCalculator();
		double power = cal.pow(2, 3); // konwersja float na int z automatu
		double power2 = cal.pow(4, 8);
		double power3 = cal.pow(8, 3);
		double power4 = cal.root(4, 2);
		System.out.println(power+" "+power2+" "+power3+" "+power4);
		cal.printOperations();
		cal.clearList();

	}

}
