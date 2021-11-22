class calculator {
	public int add(int a, int b) {
		return a + b;
	}
}

class advcal extends calculator {
	public int sub(int a, int b) {
		return a - b;
	}
}

class SuperAdv extends advcal {
	public int multi(int a, int b) {
		return a * b;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		SuperAdv cal = new SuperAdv();
		int result1 = cal.add(10, 20);
		int result2 = cal.sub(50, 20);
		int result3 = cal.multi(15, 2);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
