package week1.day2;

public class MyCalculatorusingvariable {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int total = obj.add(1, 2, 3);
		int multiply = obj.mul(3, 4);


		System.out.println("Addition value is " + total);
		System.out.println("Multiplication value is " + multiply);
		obj.sub();
	}

}

