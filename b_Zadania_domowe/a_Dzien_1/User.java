package b_Zadania_domowe.a_Dzien_1;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private Book[] book; // na tablicach trzeba zainicjalizować ich rozmiar...
	private int booksLimit = 6;// Każdy User ma limit do 6 książek
	private List<Book> books; // sposób z listą przepisałem od kolegi nie bardzo
								// na czym to polega

	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		books = new ArrayList<>();// też sam tego nie wymyśliłem

		Book[] book = new Book[booksLimit];

	}

	public void addBook2(Book[] book) {// to zapsze do kolejnego pola tablicy
										// czy iterować jakość i zabezpieczyć
										// przed przekroczeniem zakresu ?
		this.book = book;
	}

	public void addBook(Book book) { // CZyli jak wywołąm tę motodkę. będę mieć
										// w Array liście books
										// pola ze zmiennymi aktualnej książki?
		this.books.add(book);
	}

}
