import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number=");
        n = sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        if (n== sum)
        {
            System.out.println(" Given number is Perfect Number");
        }
        else
        {
            System.out.println("Given number is Not a Perfect Number");
        }
    }
}
