package GitHub;

import java.util.Scanner;

public class Company_Employee_Details {

	public static void sort(Company_Employee[] array, int n) {
		int i, j;
		Company_Employee employee;
		
		for(i = 0; i < n - 1; i++) {
			for(j = i; j < n; j++) {
				if(array[i].getSalary() < array[j].getSalary()) {
					employee = array[i];
					array[i] = array[j];
					array[j] = employee;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Company_Employee[] newArray = new Company_Employee[100];
		
		int n, salary, i;
		String name;
		short position;
		
		System.out.print("Enter number of employees: ");
		n = input.nextInt();
		
		for(i = 0; i < n; i++) {
			newArray[i] = new Company_Employee();
			System.out.print("Enter name: ");
			name = input.next();
			newArray[i].setName(name);
			System.out.print("Enter salary: ");
			salary = input.nextInt();
			newArray[i].setSalary(salary);
			System.out.print("Enter position (0 - Employee, 1 - Manager, 2 - Boss): ");
			position = input.nextShort();
			
			if(position == 0) {
				newArray[i].setPosition(Work_Position.Employee);
			}else if(position == 1) {
				newArray[i].setPosition(Work_Position.Manager);
			}else if(position == 2){
				newArray[i].setPosition(Work_Position.Boss);
			}else {
				System.out.println("Wrong choice!");
			}
		}
		
		Company_Employee_Details.sort(newArray, n);
		for(i = 0; i < n; i++) {
			System.out.printf("%d. %s %d %s\n", i + 1, newArray[i].getName(), newArray[i].getSalary(), newArray[i].getPosition());
		}
	}
	
}
