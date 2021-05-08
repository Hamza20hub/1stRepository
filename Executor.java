package javaLearning;

public class Executor {

	// Main Class
	public static void main(String[] args) {

		Constructor2 A1 = new Constructor2();
		System.out.println(A1.a + A1.b);
		Constructor2 A2 = new Constructor2("Constru", "Ctor");
		System.out.println(A2.c);
		Methods m = new Methods();
		System.out.println(m.ParaMethod("Detroit"));
		System.out.println(m.NonParaMethod());
		m.NonParaMethod1();
		System.out.println();

	}

}
