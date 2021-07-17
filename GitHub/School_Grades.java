package GitHub;

import java.util.Scanner;

public class School_Grades {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int year = 4;
		int grade = 0;
		int i = 0, j = 0;
		int sum = 0, totalSum = 0;
		int average = 0, totalAverage = 0;
		
		int[][] gradeMarks = new int[year][];
		
		for(i = 0; i < year; i++) {
			System.out.println("Year " + (i + 1) + ":");
			System.out.print("Enter number of subjects: ");
			grade = input.nextInt();
			gradeMarks[i] = new int[grade];
			for(j = 0; j < grade; j++) {
				System.out.print("Subject " + (j + 1) + ": Grade: ");
				gradeMarks[i][j] = input.nextInt();
				sum += gradeMarks[i][j];
				totalSum += sum;
			}
			average = sum / grade;
			System.out.println("The average for year " + (i + 1) + " is: " + average);
			sum = 0;
			totalAverage += average;
		}
		
		System.out.println("The overall average is: " + (totalAverage / year));

	}
}
