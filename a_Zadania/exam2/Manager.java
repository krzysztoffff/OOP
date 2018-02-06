package a_Zadania.exam2;

public class Manager extends User {

	private User[] users;
	private Department[] departments;


	@Override
	public String welcome() {
		return "Hello MAnager " + getFirstName() + " " + getLastName();
	}

}
