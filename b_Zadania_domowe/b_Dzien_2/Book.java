package b_Zadania_domowe.b_Dzien_2;

public class Book {

	private int id;
	private String title;
	private boolean avaible = true;
	private Author author;
	private Author[] additionalAuthors;
	private User user;

	public Book(int id, String title) {
		this.id = id;
		this.title = title;

	}

	public Book(int id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(int id, String title, Author author, Author[] additionalAuthors) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.additionalAuthors = additionalAuthors;

	}

	void borrowTo(User user) {
		this.avaible = false;
		boolean borrowed = false;
		for (int i = 0; i < user.books.length; i++) {
			if (user.books[i] == null) {
				user.books[i] = this;
				borrowed = true;
				break;
			}
		}
		if (borrowed == true)
			System.out.println("Wypo¿yczono ksi¹¿kê");
		else
			System.out.println("User przekroczy³ limit wypo¿yczonych ksi¹¿ek");

		// user.books.add(this); //lepiej zrobiæ list¹ ale robiê tablic¹. Ograniczam iloœæ wypo¿yczanych ksi¹¿ek dla Usera
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
