public class Exercise {

	public static void main(String[] args) {

		Practice<Integer> newInt = new Practice<Integer>();
		newInt.setT(5);
		
		System.out.println(newInt.getT());
		
		Practice<String> newString = new Practice<String>();
		newString.setT("Hi");
		
		System.out.println(newString.getT());
		
		Practice<?> testObject = new Practice<Integer>();
		testObject.setT(null);
					
	}
}
