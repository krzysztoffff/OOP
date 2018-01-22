package a_Zadania.a_Dzien_1.c_Metody;

public class Main1 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.getName());
		person.setName("Luis");
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		person.setSurname("Man");
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		person.setAge(80);
		System.out.println(person.getAge());
		System.out.println(person.getFullName());
		
		person.increaseAge(30);
		System.out.println("Wiek plus 1: "+person.getAge());
		

	}

}
