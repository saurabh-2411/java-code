package corejavabasics;
public class MH {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
	
		bike.stop();
		
		colour Colour = new colour();
		Colour.Colour();
	
		System.out.println(car.wheels());
		System.out.println(bike.wheels());
		System.out.println(Colour.Colour());
	}
}