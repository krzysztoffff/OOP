package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Product {
	private static int nextId = 0;
	private int id;
	private String name;
	private String description;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, String description, double price, int quantity) {
		super();
		this.id = nextId;
		nextId ++;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalSum() {
		return this.quantity * this.price;
	}

	public int getId() {
		return id;
	}

	// public void setId(int id) {
	// this.id = id;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0.01)
			this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0)
			this.quantity = quantity;
	}

}
