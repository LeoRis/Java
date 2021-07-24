import java.util.ArrayList;
import java.util.List;

public class Inheritance {
	
	public static void main(String[] args) {

		Student s = new Student();
		s.firstName = "Pete";
		s.lastName = "Peters";
		s.major = "AI";
		
		s.sayHello();

	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class User{
	public String firstName;
	public String lastName;
	
	public void sayHello() {
		System.out.println("Hello. My name is " + firstName + " " + lastName + ".");
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Student extends User{
	public String major;
	
	@Override
	public void sayHello() {
		System.out.println("I am " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}
