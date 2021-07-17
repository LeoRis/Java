package GitHub;

// Class: Travel

public class Journey {

	public static void main(String[] args) throws IllegalArgumentException {

		Travel pole = new Travel("Highschool", "Madagascar");
		  try {
		    pole.addPassenger("Alfa 1");
		    pole.addPassenger("Beta 2");
		    pole.addPassenger("Gama 3");
		    pole.addPassenger("Alfa 1");
		    
		  } catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		  }catch (OutOfMemoryError e) {
		    System.out.println(e.getMessage());
		  }
		  pole.deletePassenger();
		  try {
		    pole.passengerAdding(new String[]{"Zulu 4", "Kilo 5", "Charlie 1", "Delta 4", "Teta 5", "Hepta 1"});
		  } catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		  }
		  System.out.println("The array has " + pole.numberOfPassengers() + " elements.");      
		  pole.sort();

	}

}
