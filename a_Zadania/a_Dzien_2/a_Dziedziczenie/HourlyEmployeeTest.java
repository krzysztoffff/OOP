package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class HourlyEmployeeTest {

	public static void main(String[] args) {

		HourlyEmployee e = new HourlyEmployee(11, "John", "Doe", 13.5);
		
		e.getInfoEmployee();
		e.raiseSalary(11.5);
		e.getInfoEmployee();
//		System.out.println("Do wypłaty "+e.computePayment(40.5));
		
		
		
		SalariedEmployee e2 = new SalariedEmployee(11, "John", "Doe", 13.5);
		e2.getInfoEmployee();
		e2.raiseSalary(13.8);
		e2.getInfoEmployee();
		System.out.println("Wypłata miesięczna: "+e2.computePayment());
		
		
		
		
	}
}