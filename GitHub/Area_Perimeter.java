package GitHub;

import java.util.Scanner;

public class Area_Perimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choice: 1-Circle	2-Square \n");
		short choice = input.nextShort();
		if(choice == 1) {
			System.out.println("Circle radius: \nR = ");
			
			double r = input.nextDouble();
			double areaCircle = r * r * Math.PI;
			double perimeterCircle = 2 * r * Math.PI;
			
			System.out.printf("Circle perimeter with radius %f is %f\n", r, perimeterCircle);
			
			System.out.printf("Circle area with radius %f is %f\n", r, areaCircle);		
		}else if(choice == 2) {
			System.out.println("Square side: \na = ");
			
			int a = input.nextInt();
			int areaSquare = (int)Math.pow(a, 2);
			int perimeterSquare = a * 4;
			
			System.out.printf("Square perimeter with side %d is %d\n", a, perimeterSquare);
			
			System.out.printf("Square area with side %d is %d\n", a, areaSquare);
		}else {
			System.out.println("Invalid choice!");
		}
	}
}