package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor egitmen1 = new Instructor();
		egitmen1.name = "Engin";
		egitmen1.lastname = "Demiro�";
		egitmen1.id = 1084;
		egitmen1.�denityNumber = "10564879584";
		egitmen1.�nstructorNumber = "445664112";
		
		Student ogrenci1 = new Student();
		ogrenci1.name = "Bu�ra";
		ogrenci1.lastname = "�z";
		ogrenci1.id = 1089;
		ogrenci1.�denityNumber = "10648531524";
		ogrenci1.studentNumber = "002445996";
		
		User[] users = {egitmen1, ogrenci1};
		
		UserManager user = new UserManager();
		user.loginMultiple(users);
		
		InstructorManager a = new InstructorManager();
		a.addCourse(egitmen1);
		
		StudentManager b = new StudentManager();
		b.joinCourse(ogrenci1);

	}

}
