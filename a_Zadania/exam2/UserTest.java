package a_Zadania.exam2;

public class UserTest {
	
	public static void main(String[] args) {
		
		User u = new User("John", "User", "u@sers.com");
		User u2 = new User("John2", "User2", "u2@sers.com");
		System.out.println(u.welcome() + " " + u2.welcome());
		
		User [] users = {u, u2};
		
		Manager m = new Manager("mUesr", "mUser", "mEmail");
		m.setUsers(users);
		
		System.out.println(m.welcome());
	}

}
