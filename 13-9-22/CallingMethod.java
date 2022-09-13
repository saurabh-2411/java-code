public class CallingMethod {
	
	// This method will print only pincode
	void Area(int pincode) {
		System.out.println(pincode);
	}
	
	// This method will print pincode and police station
	void Area(int pincode, String police_s) {
		System.out.println(pincode);
		System.out.println(police_s);
	}
	
	// This method will print pincode, police station and city
	void Area(int pincode, String police_s, String city) {
		System.out.println(pincode);
		System.out.println(police_s);
		System.out.println(city);
	}	
	
	// Calling main method
	public static void main(String[] args) {
		
		// Scanner class object
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		// Taking input from the user and storing inside num_data
		System.out.print("Enter number of data: ");
		int num_data = scan.nextInt();
		
		// Creating a object of CallingMethod class
		CallingMethod cm1 = new CallingMethod();
		
		// Checking the number of data using switch statement
		switch(num_data) {
			case 1:
				// This will call the method which takes pincode as a agrument
				cm1.Area(421301);
				break;
			case 2:
				// This will call the method which takes pincode and police station as a agrument
				cm1.Area(421301, "Shahad Police Station");
				break;
			case 3:
				// This will call the method which takes pincode, police station and city as a agrument
				cm1.Area(421301, "Shahad Police Station", "Kalyan");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}