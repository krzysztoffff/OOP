package b_Zadania_domowe.b_Dzien_2;

public class Author extends User {
	private static int id = 0;
	private String pseudonim;

	public Author() {
		id += 1;
	}

	public Author(String firstName, String lastName, String pseudonim) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.pseudonim = pseudonim;

	}

}
