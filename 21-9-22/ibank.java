package corejavabasics;

import java.util.Scanner;

public class ibank {
	int amount = 10000;
	Scanner s = new Scanner(System.in);

	public void deposite() {
		System.out.println("Enter the Deposit Amount: ");
		int deposit = s.nextInt();
		amount = deposit + amount;
		System.out.println("Available balance is: " + amount);
	}

	public void withdraw() {
		System.out.println("Enter the withdraw Amount: ");
		int withdraw = s.nextInt();
		if (amount >= withdraw) {
			amount = amount - withdraw;
			System.out.println("Available balance is: " + amount);
		} else {
			System.out.println("Insufficient Amount !");
			System.out.println("Available Amount is: " + amount);
		}
	}
	public void checkBalance() {
		System.out.println("Total Amount: "+ amount);
	}
		
class client {
			public static void main(String[] args) {
				ibank ib = new ibank();
				int chk;
				ib.deposite();
				ib.withdraw();
				
				System.out.print("\nEnter Your Choice: ");
				Scanner s2=new Scanner(System.in);
				chk=s2.nextInt();
				
				switch(chk)
				{
				case 1: ib.deposite();
				break;
				case 2: ib.withdraw();
				break;
				case 3: ib.checkBalance();
				break;
				default :System.out.println("Invalid Choice !");

			}
		}
	}
}

	