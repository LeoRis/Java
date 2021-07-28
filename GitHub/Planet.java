package GitHub;

import java.util.Scanner;

public class Planet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weigth in kg: ");
		
		double earthWeight = input.nextDouble();
		
		EnumPlanet planet = EnumPlanet.Earth;
		
		double mass = earthWeight / planet.surfaceGravity();
		
		for(EnumPlanet p : EnumPlanet.values()) {
			System.out.printf("Your weight on %s is %.2f \n", p, p.surfaceWeight(mass));
		}
	}

}
