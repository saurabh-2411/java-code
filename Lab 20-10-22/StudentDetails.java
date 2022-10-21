package lab7;

import java.util.*;;

public class StudentDetails {

	public static void main(String[] args) {
		ArrayList<String> numlist = new ArrayList<String>();
		// Adding student name
		numlist.add("saurabh");
		numlist.add("rinkle");
		numlist.add("twinkle");
		numlist.add("harsha");
		numlist.add("nisha");
		numlist.add("ram");
		
		ListIterator<String> stud = numlist.listIterator();
		
		// Printing student name in forward direction
		while(stud.hasNext()) {
			System.out.println(stud.next());
		}
		System.out.println();
		
		// Printing student name in backward direction
		while(stud.hasPrevious()) {
			System.out.println(stud.previous());
		}
	}
}