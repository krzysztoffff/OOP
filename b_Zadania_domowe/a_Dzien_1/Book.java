package b_Zadania_domowe.a_Dzien_1;


public class Book {
	
	private int id;
	private String title;
	private boolean avaible = true;
	private Author author;
	private Author [] additionalAuthors;
	
	public Book (int id, String title) {
		this.id = id;
		this.title = title;
		
	}
	
	public Book (int id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
}
