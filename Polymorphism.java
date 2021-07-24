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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public abstract class User{
	public String firstName;
	public String lastName;
	
	public abstract void sayHello();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Student extends User{
	public String major;
	
	@Override
	public void sayHello() {
		System.out.println("I am " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Teacher extends User{
	
	@Override
	public void sayHello() {
		System.out.println("My name is " + firstName + " " + lastName + " and I am a teacher.");
	}
}
