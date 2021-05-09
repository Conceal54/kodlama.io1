package inheritance;

public class UserManager {

	public void login(User user) {
		System.out.println(user.name + " " + user.lastname + " Basariyla Giris Yapti.");
	}
	
	public void loginMultiple(User[] users) {
		for(User user : users) {
			login(user);
		}
	}
}
