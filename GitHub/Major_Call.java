package GitHub;

// Interface: CallsList
// Class: Call
// Class: ListOfCalls

public class Major_Call {

	public static void main(String[] args) {

		  ListOfCalls list = new ListOfCalls("List 1");
		  try {
			  list.talked(new Call("Jane","Julie",120));
			  list.talked(new Call("Jeremy","Jacob",65));
			  list.talked(new Call("Matthew","Caleb",30));
			  list.talked(new Call("John","Jack",12));
			  list.talked(new Call("Edward","Stephen",64));
			  list.talked(new Call("Tommy","Bruce",1000));
		  } catch (OutOfMemoryError e) {
		      System.out.println(e.getMessage());
		  }
		  list.increaseCapacity(10);
		  System.out.println(list);	
		  System.out.println(list.longestCall());
	}

}
