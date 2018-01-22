package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Burger {
	
//	final static double
//	static
//	public
//	protected
	
	private String size;
	private double price;
	
	
	public Burger(){
		this.size = "";
		this.price = 0.0;
	}
	
	public Burger(String size, double price){
		this.size = size;
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
