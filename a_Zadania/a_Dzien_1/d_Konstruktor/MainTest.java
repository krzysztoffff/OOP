package a_Zadania.a_Dzien_1.d_Konstruktor;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		Calculator calc = new Calculator ();
		
		double res = calc.add(3.25, 3.33);
		System.out.println(res);
		double res2 = calc.multiply(8, 7);
		System.out.println(res2);
		double res3 = calc.substract(10, 12);
		System.out.println(res3);
		double res4 = calc.divide(9, 3);
		System.out.println(res4);
		
		calc.printOperations();
		
		calc.clearList();
		
		System.out.println("\n\nraz jeszcze wyœwietlam listê po wyczyszczeniu");
		calc.printOperations();
		
		
	}

}

