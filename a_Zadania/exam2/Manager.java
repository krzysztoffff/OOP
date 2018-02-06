package a_Zadania.exam2;

public class Manager extends User {

	private User[] users;
	private Department[] departments;
	
	
	public Manager(String firstName, String lastName, String email) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}


	@Override
	public String welcome() {
		return "Hello Manager " + getFirstName() + " " + getLastName();
	}


	public User[] getUsers() {
		return users;
	}


	public void setUsers(User[] users) {
		this.users = users;
	}


	public Department[] getDepartments() {
		return departments;
	}


	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}
	
	

}
