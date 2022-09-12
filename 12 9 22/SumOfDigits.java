// EXAMPLE 1 
/*

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 495;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of Digits: " +sum);
    }
}


*/

// EXAMPLE 2


public class SumOfDigits {

	public static void add(int num) {
		int sum = 0;
		int last;
		while (num != 0) {
			last =  num % 10;
			sum += last;
			num /= 10;
		}
		System.out.print("Sum Of Digits: "+sum);
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		add(num);
	}

}


