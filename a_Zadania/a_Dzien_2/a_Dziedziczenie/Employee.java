package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Employee {

	public int id;
	public String name;
	public String surname;
	public double salary;

	public Employee(int id, String name, String surname, double salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;

	}

	public void raiseSalary(double percent) {
		if (percent >= 0 && percent <= 100) {
			double num = (percent / 100) + 1;
			this.salary *= num;

		}else{
			System.out.println("Możesz podnieś stawkę od 0 do 100%");
		}
	}

	public void getInfoEmployee() {
		System.out.println(this.id + " " + this.name + " " + this.surname + " Stawka " + this.salary);
	}

}
