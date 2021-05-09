package javaLearning;

public class ConditionalMethods {
	// Main Method
	public static void main(String[] args) {

		ConditionalMethods conM = new ConditionalMethods();
		// Conditional Statement with method
		if (perMethod(8) < 9) {
			System.out.println("this is a Conditional Parameterized Method");
		} else {
			System.out.println("this is also a Conditional Parameterized Method");
		}

		if (conM.NonPerMethod() <= 10) {
			System.out.println("this is a Conditional Non-Parameterized Method");
		} else {
			System.out.println("this is also a Conditional Non-Parameterized Method");
		}
	}

	// parameterized Method
	public static int perMethod(int x) {
		return x + 5;
	}

	// non parameterized method

	public int NonPerMethod() {
		int a = 3;
		int b = 6;

		return a + b;
	}

}