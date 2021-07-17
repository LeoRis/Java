import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
	
	public static void main(String[] args) {

		Student s = new Student();
		s.firstName = "Pete";
		s.lastName = "Peters";
		s.major = "AI";
		
		Teacher t = new Teacher();
		t.firstName = "Christa";
		t.lastName = "McAuliffe";
		
		List<User> users = new ArrayList<User>();
		users.add(s);
		users.add(t);

		for(User user : users) {
			user.sayHello();
		}
	}
}