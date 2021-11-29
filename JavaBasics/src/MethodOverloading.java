class casio {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	public void add(double x, double y) {
		System.out.println(x + y);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {

		casio obj = new casio();

		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(20.20, 20.20);
	}

}
