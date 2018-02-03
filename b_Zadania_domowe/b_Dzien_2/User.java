package b_Zadania_domowe.b_Dzien_2;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	Book[] books = new Book[6];//User mo¿e wypo¿yczyæ max 6 ksi¹¿ek
//	List<Book> books = new ArrayList<>();

	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
