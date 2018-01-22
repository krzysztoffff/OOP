package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {
	
	
	public SalariedEmployee(int id, String name, String surname, double salary){
		super(id, name, surname, salary);
		
	}
	
	public double computePayment(){
		double res = super.salary *190;
		
		
		return res;
	}
	
	
}
