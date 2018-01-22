package a_Zadania.a_Dzien_2.a_Dziedziczenie;
import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;
	
public class Shape extends Calculator{
	
	private double x;
	private double y;
	private String color;
	
	public Shape(){
		
	}
	
	public Shape(double x, double y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	
	public void shapeVariables (double x, double y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public String getDiscription(){
		
		
		String result = "Współrzędne środka kształtu: x = "+Double.toString(this.x)+" y = "+Double.toString(this.y)+" Kolor: "+color;
		
		System.out.println(result);
		return result;
		
		
	}
	
	public double getDistance(Shape shape){
		double x1 = this.x;
		double y1 = this.y;
		double x2 = shape.x;
		double y2 = shape.y;
		
		double a = x2 - x1; //to do kwadratu
		double b = y2 - y1; //to do kwadratu
		
		double aPow = Math.pow(a, 2); //z tego
		double bPow = Math.pow(b, 2); //plus z tego pierwiastek
		
		double c = aPow + bPow;//z tego pierwiastek
		double result = Math.sqrt(c);
		
		return result;
		

		
	}
	

	
	
	
	
	
}
