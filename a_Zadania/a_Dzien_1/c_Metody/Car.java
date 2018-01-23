package a_Zadania.a_Dzien_1.c_Metody;

public class Car {

	private String brand;
	private String model;
	private Double price;
	
	
	

	@Override
	public String toString() {
		return "Car [brand=" + this.brand + ", model=" + this.model + ", price=" + this.price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
