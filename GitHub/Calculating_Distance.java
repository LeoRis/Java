package GitHub;

import java.util.Scanner;

public class Calculating_Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert array length: ");
		int n = input.nextInt();
		int[] distanceArray = new int[n];
		
		System.out.println("Insert the elements:");
		
		for(int i = 0; i < distanceArray.length; i++) {
			System.out.print("Element " + (i + 1) + ":");
			distanceArray[i] = input.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < distanceArray.length; i++) {
			for(int j = 1; j < distanceArray.length; j++) {
				if(Math.abs(distanceArray[i] - distanceArray[j]) > max){
					max = Math.abs(distanceArray[i] - distanceArray[j]);
				}
			}
		}
		
		System.out.println("The greatest distance between the array elements is: " + max);

	}

}
