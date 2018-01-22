package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class HourlyEmployee extends Employee{
	
	
	public HourlyEmployee (int id, String name, String surname, double salary){
		super(id, name, surname, salary);
	}
	
	public double computePayment(double hours){
		double salary = super.salary;
		double res = salary*hours;
		return res;
	}
		
		
	
	
	
	
}
