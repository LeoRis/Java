package GitHub;

import java.util.Scanner;

public class Bank_Account {

	public static void main(String[] args) {
		
		Account firstAccount = new Account(500.00);
		System.out.println("Starting balance of account 1 is: " + firstAccount.getBalance());
		firstAccount.setBalance();
		System.out.println("New balance of account 1 is: " + firstAccount.getBalance());
		
		Account secondAccount = new Account(600.00);
		System.out.println("Starting balance of account 2 is: " + secondAccount.getBalance());
		secondAccount.setBalance();
		System.out.println("New balance of account 2 is: " + secondAccount.getBalance());
		
	}

}

class Account{
	private double balance;
	
	public Account() {}
	
	public Account(double startingBalance) {
		
		if(startingBalance > 0.0) {		
			balance = startingBalance;
		}
	}
	
	public void setBalance() {
		System.out.print("Enter balance: ");
		Scanner input = new Scanner(System.in);
		balance += input.nextInt();
	}
	
	public double getBalance() {
		return balance;
	}
}
