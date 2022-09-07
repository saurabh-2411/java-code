import java.util.Scanner;

public class EvenOdd {
//calling main method
public static void main(String[] args) {

   Scanner reader = new Scanner(System.in);

   System.out.print("Enter a number: ");
//Taking input from user
   int a = reader.nextInt();

   if(a % 2 == 0)
        System.out.println(a + " is even");
else
        System.out.println(a + " is odd");
}
}