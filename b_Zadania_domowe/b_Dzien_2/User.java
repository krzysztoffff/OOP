package b_Zadania_domowe.b_Dzien_2;

import java.util.ArrayList;
import java.util.List;

public class User {
	private static int id = 0;
	private String firstName;
	private String lastName;
	Book[] books = new Book[6];// User mo¿e wypo¿yczyæ max 6 ksi¹¿ek
	// List<Book> books = new ArrayList<>();

	public User() {
		id += 1;

	}

	public User(String firstName, String lastName) {
		id += 1;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void returnBook(Book book) {
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i].equals(book)) {
				books[i] = null;
				book.setAvaible(true);
			}

		}

	}

	public void returnAllBooks() {
		for (int i = 0; i < this.books.length; i++) {
			this.books[i].setAvaible(true);
			this.books[i] = null;

		}
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
