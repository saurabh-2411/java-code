import java.util.Scanner;

public class LogicalEntity {
	
	int Studentid;
	String name;
	int RollNo ;
	
	LogicalEntity(int Studentid) {
		this.Studentid = Studentid;
	}
	
	LogicalEntity(int Studentid, String name) {
		this.Studentid = Studentid;
        this.name = name;
	}
	
	LogicalEntity(int Studentid, String name, int RollNo) {
		this.Studentid = Studentid;
		this.name = name;
		this.RollNo = RollNo;
	}
	
	void showInfo() {
		System.out.println("StudentId: " + Studentid);
		System.out.println("Name: " + name);
		System.out.println("RollNo: " + RollNo);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LogicalEntity emp1 = new LogicalEntity(001);
		LogicalEntity emp2 = new LogicalEntity(002, "Saurabh");
		LogicalEntity emp3 = new LogicalEntity(003, "Gitanjali",24);
		emp1.showInfo();
		emp2.showInfo();
		emp3.showInfo();
		
	}
}