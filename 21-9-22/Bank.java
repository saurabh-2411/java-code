package corejavabasics;
import java.util.Scanner;
public class Bank{
   private double bal = 10000;
   private int pwd;
   
   public  void Deposite(double money)
   {
	   System.out.print("Enter Password:");
	   Scanner s=new Scanner(System.in);
	   pwd=s.nextInt();
	   if(pwd==0000)
	   {
		   bal=bal+money;
		   System.out.println("Deposited Money: "+money);
		   System.out.println("Total Balance: "+bal);
		   
	   }
	   else
	   {
		   System.out.println("Incorrect Password !");
	   }
   }
	   public  void Withdraw(double money)
	   {
		   System.out.print("Enter Password:");
		   Scanner s=new Scanner(System.in);
		   pwd=s.nextInt();
		   if(pwd==0000)
		   {
			   bal=bal-money;
			   System.out.println("Withdraw Money: "+money);
			   System.out.println("Total Balance: "+bal);
			   
		   }
		   else
		   {
			   System.out.println("Incorrect Password !");
		   }
	   }
	   public  void checkBal()
	   {
		   System.out.print("Enter Password:");
		   Scanner s=new Scanner(System.in);
		   pwd=s.nextInt();
		   if(pwd==0000)
		   {
			   System.out.println("Total Balance: "+bal);
			   
		   }
	   }
}
 class Customer {
	public static void main(String[]args) {
		
		Bank b=new Bank();
		int chk;
		System.out.println("1. Deposite: ");
		System.out.println("2. Withdraw: ");
		System.out.println("3. Check Balance: ");
		
		System.out.print("\nEnter Your Choice: ");
		Scanner s2=new Scanner(System.in);
		chk=s2.nextInt();
		
		switch(chk)
		{
		case 1: b.Deposite(1000);
		break;
		case 2: b.Withdraw(2000);
		break;
		case 3: b.checkBal();
		break;
		default :System.out.println("Invalid Choice !");
		
		}
	}
}