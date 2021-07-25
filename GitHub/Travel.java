package GitHub;

import java.util.Arrays;

import java.util.*;

public class Travel {
	private String name;
	private String destination;
	private String[] passengerNames;
	
	public Travel() {
		this.name = " ";
		this.destination = " ";
		this.passengerNames = new String[10];
	}
	
	public Travel(String name, String destinations) {
		this.name = name;
		this.destination = destination;
		this.passengerNames = new String[10];
		this.passengerNames = passengerNames;
	}
	
	public Travel(String name, String destinations, String[] passangerNames) {
		this.name = name;
		this.destination = destination;
		this.passengerNames = passangerNames;
	}
	
	public boolean common(String[] names) {
		return !(Collections.disjoint(Arrays.asList(names), Arrays.asList(passengerNames)));
	}
	
	public void addPassenger(String passenger) throws OutOfMemoryError, IllegalArgumentException {
	
		for(Object i : passengerNames) {
			if(i != null) {
				throw new OutOfMemoryError("The array is full.");
			}
			else if(common(passengerNames)) {
				throw new IllegalArgumentException("The passenger already exists!");
			}
			else {
				for(int j = 0; j < passengerNames.length; j++) {
					passengerNames[j] = passenger;
				}
			}
		}
	}
	
	public void deletePassenger() {
		if(passengerNames.length == 0) {
			System.out.println("The array is empty!");
		}
		else {
			passengerNames = Arrays.copyOf(passengerNames, passengerNames.length - 1);
		}
	}
	
	public int numberOfPassengers() {
		int counter = 0;
		for(Object i : passengerNames) {
			if(i != null) {
				counter++;
			}
			else {
				continue;
			}
		}
		return counter;
	}
	
	public void passengerAdding(String[] names) throws OutOfMemoryError, IllegalArgumentException {
		
		int counter = 0;
		for(Object i : passengerNames) {
			if(i == null) {
				counter++;
			}
		}
		
		int counter1 = 0;
		for(Object j : names) {
			if(j == null) {
				counter1++;
			}
		}
		
		if(counter < counter1) {
			throw new OutOfMemoryError("Array full!");
		}
		else if(common(names)) {
			throw new IllegalArgumentException("Passenger already exists!");
		}
		else {
			for(int i = 0; i < names.length; i++) {
				passengerNames[i] = names[i];
			}
		}
	}
	
	public int countElements(){
		int counter = 0;
		for(int i = 0; i < passengerNames.length; i++) {
			if(passengerNames[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	public void sort() {
		String temp;
		for(int i = 0; i < countElements(); i++) {
			for(int j = i; j < countElements(); j++) {
				if(passengerNames[i].compareTo(passengerNames[j]) > 0) {
					temp = passengerNames[i];
					passengerNames[i] = passengerNames[j];
					passengerNames[j] = temp;
				}	
			}
		}
		for(int i = 0; i < countElements(); i++) {
			if(passengerNames[i] != null) {
				System.out.println(passengerNames[i]);
			}
		}

	}
	
}
