package inheritance;

public class UserManager {

	public void login(User user) {
		System.out.println(user.name + " " + user.lastname + " Ba�ar�yla Giri� Yapt�.");
	}
	
	public void loginMultiple(User[] users) {
		for(User user : users) {
			login(user);
		}
	}
}
