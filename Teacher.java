public class Teacher extends User{
	
	@Override
	public void sayHello() {
		System.out.println("My name is " + firstName + " " + lastName + " and I am a teacher.");
	}
}
