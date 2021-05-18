package javaLearning;

public class Operator2 {

	public static void main(String[] args) {
		if (perMethod(7) == 10 || perMethod(13) < 10) {
			System.out.println("This is a OR || operator");
		} else {
			System.out.println("This is a OR || operator not working ");
		}

		System.out.println("  x0x0x0x0x0x0x0x0x0x0x0x0x0x");

		if (perMethod(6) < 4 && NonPerMethod() > perMethod(3)) {
			System.out.println("This is a && Operator");

		} else {
			System.out.println("This && operator is not used properly");
		}

	}

	// parameterized Method
	public static int perMethod(int x) {
		return x + 5;
	}

	// non parameterized method

	public static int NonPerMethod() {
		int a = 3;
		int b = 6;

		return a + b;
	}

}
