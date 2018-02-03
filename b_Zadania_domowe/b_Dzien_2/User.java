package b_Zadania_domowe.b_Dzien_2;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	Book[] books = new Book[6];//User mo¿e wypo¿yczyæ max 6 ksi¹¿ek
//	List<Book> books = new ArrayList<>();

	public User() {

	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
