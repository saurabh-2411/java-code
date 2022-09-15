import java.util.Scanner;

public class prime
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Range: ");
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      System.out.println("Prime Numbers from "+a+" to " +b);
      for(int i=a; i<=b; i++)
      {
         int c = 0;
         for(int j=2; j<i; j++)
         {
            if(i%j==0)
            {
               c++;
               break;
            }
         }
         if(c==0)
            System.out.println(i);
      }
   }
}