package b_Zadania_domowe.a_Dzien_1;


public class Book {
	
	private int id;
	private String title;
	private boolean available = true;
	private Author mainAuthor; //referencja do klasy author w tym pakiecie
	private Author [] additionalAuthors;
	private User user;
	private User[] users;
	
	
	public Book (int id, String title){
		this.id = id;
		this.title = title;
	}
	
	
	public Book(int id, String title, Author author){
		this.id = id;
		this.title = title;
		this.mainAuthor = author;

//		zmienne klasy Author		
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.pseudonim = pseudonim;
		
	}
	
	
	public Book(int id, String title, Author author, Author[] additionalAuthors){
		this.id = id;
		this.title = title;
		this.mainAuthor = author;
		this.additionalAuthors = additionalAuthors;


		
	}
	
	public void borrowTo(User user){
		this.available = false;
		user.addBook(this);//dodaj do listy
		
		
	}
	
//	public void borrowToTable(User[] users){
//		this.available = false;
//		user.addBook2(this);	//dodaj do tabeli
//				
//	}
	
	public void setUser(User user){
		this.user = user;
	}
	public User getUser(){
		return this.user;
	}
	
	
	public int getId(){
		return this.id;
	}
	
	public String getTitle(){
		return this.title;
	}
		public void setTitle(String title){
		this.title = title;
	}
	
		
	public boolean getAvaible(){
	return this.available;
	}
	public void setAvaible(boolean avaible){
		this.available = avaible;
	}
	
	public Author getMainAuthor(){
		return this.mainAuthor;
	}
	public void setMainAuthor(Author author){
		this.mainAuthor = author;
	}
	
	public Author[] getAdditionalAuthors(){
		return this.additionalAuthors;
	}
	public void setAdditionalAuthors(Author[] additionalauthors){
		this.additionalAuthors = additionalAuthors;
	}
	
	
	
	
	
}
