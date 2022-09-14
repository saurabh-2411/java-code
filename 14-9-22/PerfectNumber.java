
public class PerfectNumber
{
	static void Perfect(int x  , int y)			
	
		{
		     int s  = 0;

			for(int i = x;i <= y; i++)
				{
					if (PerfectNumber.checkPerfect(i) )
					{
					s = s +1;
					}

				}
				System.out.println( "Total count of perfect number between " + x + " and " + y + " is : " +s );
		}
		
	static boolean checkPerfect(int n)					
		
	{
			int sum=0;

			for(int i = 1; i<n ; i++)
			{
				if( n % i == 0)
				{
				sum= sum + i;
				}
	}

		if(n == sum) return true; return false;
	}

	//-------------------------------------------------------------------------

	static int  checkLowest(int x , int y)
	{
		if (x == y)
		{
			return 0;
		}
		else if (x > y)
		{
			return y;
		}
		else 
		{
			return x;
		}
	}
	static int checkGreatest(int x , int y)
	{
		if (x == y)
		{
			return 0;
		}
		else if (x > y)
		{
			return x;
		}
		else 
		{
			return y;
		}
		
	}

	//-----------------------------------------------------------------
      public static void main(String[] args) 
	  {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the two numbers ");

		int a = sc.nextInt();
		int b = sc.nextInt();	

	    int cc = checkLowest(a , b);
	    int dd = PerfectNumber.checkGreatest(a, b);

		Perfect(cc ,dd);
	
  } 
}
