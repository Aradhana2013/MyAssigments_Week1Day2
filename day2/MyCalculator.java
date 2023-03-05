package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println("Addition Result is " + obj.add(2, 2, 2));
		System.out.println("Multiplication Result is " + obj.mul(2, 2));
		obj.sub();
		

	}

}
