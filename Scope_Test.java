import java.util.Scanner;

class Scoping{
	int x = 1;
	
	public void start() {
		int x = 5;
		System.out.println("Local 'x' in Start is: " + x);
		useLocal();
		useField();
		useLocal();
		useField();
		System.out.println("\nLocal 'x' in the end is: " + x);
	}
	
	public void useLocal() {
		int x = 25;
		System.out.println("\nLocal 'x' in 'useLocal()' is: " + x + " after entering 'useLocal()'" );
		++x;
		System.out.println("\nLocal 'x' in 'useLocal()' is: " + x + " before exiting of 'useLocal()'");
	}
	
	public void useField() {
		System.out.println("\nField 'x' is: " + x + " during entering 'useField()'");
		x *= 10;
		System.out.println("\nField 'x' is: " + x + " during exiting 'useField()'");
	}
}

public class Scope_Test {

	public static void main(String[] args) {
		Scoping testScope = new Scoping();
		testScope.start();
	}

}
