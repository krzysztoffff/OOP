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
	
	public Book (int id, String title, Author author, Author [] additionalAuthors){
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.additionalAuthors = additionalAuthors;
		
	}

	public int getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvaible() {
		return avaible;
	}

	public void setAvaible(boolean avaible) {
		this.avaible = avaible;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author[] getAdditionalAuthors() {
		return additionalAuthors;
	}

	public void setAdditionalAuthors(Author[] additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}
	
	
	
}
