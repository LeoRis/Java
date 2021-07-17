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
