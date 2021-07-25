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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

public interface CallsList {
	public void talked(Call call) throws OutOfMemoryError;
	public void increaseCapacity(int capacity);
	public Call longestCall();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

public class Call {
	private String caller;
	private String called;
	private int duration;
	
	public Call(String caller, String called, int duration) {
		this.caller = caller;
		this.called = called;
		this.duration = duration;
	}
	
	public void setCaller(String caller) {
		this.caller = caller;
	}
	
	public String getCaller() {
		return this.caller;
	}
	
	public void setCalled(String called) {
		this.called =called;
	}
	
	public String getCalled() {
		return this.called;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	@Override
	public String toString() {
		return "The longest call is from: " + this.caller + " to: " + this.called + " and lasted for: " + this.duration + " seconds.";
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfCalls implements CallsList{
	private String listName;
	private Call[] calls;
	
	public ListOfCalls(String listName) {
		this.listName = listName;
		this.calls = new Call[10];
	}
	
	public ListOfCalls(String listName, Call[] calls) {
		this.listName = listName;
		this.calls = calls;
	}
	
	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public String getListName() {
		return this.listName;
	}
	
	public void setCalls(Call[] calls) {
		this.calls = calls;
	}
	
	public Call[] getCalls() {
		return this.calls;
	}
	
	int i = 0;
	public void talked(Call call) throws OutOfMemoryError {
		calls[i++] = call;
	}
	
	public void increaseCapacity(int capacity) {
		calls = Arrays.copyOf(calls, calls.length + capacity);
	}
	
	public int counterOfElements() {
		ArrayList<Object> list = new ArrayList(Arrays.asList(calls));
		int counter = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) != null) {
				counter++;
			}
		}
		return counter;	
	}
	
	public int duration() {
		int sum = 0;
		for(int i = 0; i < counterOfElements(); i++) {
			sum += calls[i].getDuration();
		}
		return sum;
	}
	
	public Call longestCall() {
		Call temp;
		int i = 0, j;
		for(i = 0; i < counterOfElements() - 1; i++) {
			for(j = i; j < counterOfElements(); j++) {
				if(calls[i].getDuration() > calls[j].getDuration()) {
					temp = calls[i];
					calls[i] = calls[j];
					calls[j] = temp;
				}
			}
		}
		return calls[i];
	}
	
	@Override
	public String toString() {
		return "List name: " + this.listName + " total calls durations: " + this.duration();
	}

}
