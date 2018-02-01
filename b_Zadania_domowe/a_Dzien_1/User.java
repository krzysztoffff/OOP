package b_Zadania_domowe.a_Dzien_1;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
//	Book[] books; tablica musi mieæ z góry zdefinowany rozmiar. Jak mam dodaæ ksi¹¿kê do tablicy i do którego pola. U¿ywam ArrayList
	List<Book> books = new ArrayList<>();

	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
