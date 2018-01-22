package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {
	
private int id;
private String name;
private String discription;
private double price;
private int quantity;


//konstruktor - powinien przyjmować opis, cenę i ilość produtku.
public void getProduct(String discription, double price, int quantity){
	
	this.discription = discription;
	this.price = price;
	this.quantity = quantity;
	
}
//atrybut id powiniem mieć możliwość wyłącznie odczytu.
public void getProduct (int id){
	this.id = id;
	this.id++;
	
}



	
	
}
