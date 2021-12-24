
public class MethodOverloading1 {

	// Method overloading is also called Compile time-polymorphism, Static
	// polymorphism, Early binding polymorphism

	public void m1() {
		System.out.println("Calling first method");
	}

	public void m1(int a) {
		System.out.println("calling int method");
	}

	public void m1(double d) {
		System.out.println("calling double method");
	}

	public static void main(String[] args) {

		MethodOverloading1 mv = new MethodOverloading1();
		mv.m1();
		mv.m1(10);
		mv.m1(10.5);

	}

}
