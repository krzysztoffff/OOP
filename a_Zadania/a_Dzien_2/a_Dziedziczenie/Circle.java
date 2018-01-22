package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Circle extends Shape{

	private double x;
	private double y;
	private double radius;
	private String color;

	public Circle(double x, double y, double radius, String color) {
		super(x, y, color);
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String getDiscription(){
		
		
		String result = "Współrzędne środka kształtu: x = "+Double.toString(this.x)+" y = "+Double.toString(this.y)
				+" promień: "+Double.toString(this.radius)+" Kolor: "+color;
		
		System.out.println(result);
		return result;
		
		
	}
	
	public double getArea(){
		double pi = Math.PI;
		double res = Math.pow((pi*this.radius), 2);
		return res;
	}
	
	public double getCircuit(){
		double pi = Math.PI;
		double res = 2 * pi * this.radius;
		return res;
		
	}



}
