package lab5;

public class PersonMain {

	public static void main(String[] args) {
		Student stud = new Student(322, "Saurabh Patil", 87);
		Employee emp = new Employee(541, "Vallabhi Wankhade", 41000);
		System.out.println(stud.toString());
		System.out.println(emp.toString());
	}

}