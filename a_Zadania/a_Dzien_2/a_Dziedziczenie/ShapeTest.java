package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.shapeVariables(2.2, 13.5, "yellow");
//		shape.getDiscription();
		
		Shape shape2 = new Shape();
		shape2.shapeVariables(5.3, 12.1, "red");
//		shape2.getDiscription();
		
		double distance = shape.getDistance(shape2);
		System.out.println("Odleg�o�� �rodk�w "+distance);
		
		String list = "Odleg�o�� �rodk�w "+Double.toString(distance);
		
		
		
		shape.sAddHistory(list);
		shape.printOperations();//nie robi�em operacji na kalkulatorze to nie ma niz zapisane.
		shape.sPrintOperations();
		shape.sClearList();
	}

}
