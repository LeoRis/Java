package GitHub;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTrail implements List {
	private String listName;
	private Trail[] trailsArray;
	
	public ListTrail() {}
	public ListTrail(String name) {
		listName = name;
		trailsArray = new Trail[10];
	}
	public ListTrail(String name, Trail[] trails) {
		listName = name;
		trailsArray = trails;
	}
	
	public void setName(String name) {
		listName = name;
	}
	
	public String getName() {
		return this.listName;
	}
	
	public void setTrail(Trail[] trails) {
		trailsArray = trails;
	}
	
	public Trail[] getTrail() {
		return this.trailsArray;
	}
	
	int i = 0;
	
	@Override

	public void pass(Trail trail) throws OutOfMemoryError {

		if(trailsArray[i] == null) {
			trailsArray[i++] = trail;
		}
		else {
			throw new OutOfMemoryError();
		}
		
	}
	
	@Override
	
	public void newTrails(int capacity) {
		trailsArray = Arrays.copyOf(trailsArray, capacity);
	}
	
	int counter1;
	
	@Override
		
	public int nrSamePositions() throws NullPointerException {
			
		for(int i = 0; i < trailsArray.length; i++) {
			if(trailsArray[i] != null) {
				counter1++;
			}
			else {
				break;
			}
		}
		
		int counter = 0;
		for(int i = 0; i < counter1; i++) {
			for(int j = i; j < counter1; j++)
				if(trailsArray[i].getStart().equals(trailsArray[j].getStart()) && trailsArray[i].getEnd().equals(trailsArray[j].getEnd())){
					counter++;
					
				}
				else if(trailsArray == null){
					throw new NullPointerException();
				}
		}
		
		return counter;
	}
	
	public String toString() {
		int sum = 0;
		for(int i = 0; i < counter1; i++) {
			sum += trailsArray[i].getLength();
		}

		return "Trail name: " + this.listName + " Total trail length: " + sum;

	}
}
