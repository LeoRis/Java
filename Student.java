public class Student extends User{
	public String major;
	
	@Override
	public void sayHello() {
		System.out.println("I am " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}
